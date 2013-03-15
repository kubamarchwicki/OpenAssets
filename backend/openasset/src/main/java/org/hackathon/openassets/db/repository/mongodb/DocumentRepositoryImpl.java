package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import java.util.List;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;
import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;

import com.mongodb.DBObject;

public class DocumentRepositoryImpl implements DocumentRepository {

	@Override
	public DocumentForm getRandomIncomplete() {
		
		DocumentForm documentForm = new DocumentForm();

		DbObjectIdPair randomInclompleteDocumentIdPair = documentsDao
				.getRandomIncompleteDocumentId();
		Long randomIncompleteDocumentId = null;
		try {
			randomIncompleteDocumentId = Long
					.parseLong(randomInclompleteDocumentIdPair.getDocument_id());
		} catch (NumberFormatException e) {
			System.out.println("Document id not found in DB!");
		}

		List<ImageNode> imagesUrlList = HtmlDocumentSnippetReader
				.getImageUrls(randomIncompleteDocumentId);
		documentForm.setImages(imagesUrlList);
		documentForm.setDocument_id(randomInclompleteDocumentIdPair
				.getDocument_id());
		documentForm.setEp_object_id(randomInclompleteDocumentIdPair
				.getEp_object_id());

		return documentForm;
	}

	private DocumentsDao documentsDao;

	private final static String connectionUrl = "mongodb://localhost";

	public DocumentRepositoryImpl() {
		try {
			DbMongoClient dbMongoClient = new DbMongoClient(connectionUrl);
			documentsDao = dbMongoClient.getDocumentsDao();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	/**
	 * Mark document as trusted = yes in initial repository
	 */
	public void update(DocumentForm document) {
		documentsDao.updateDocument(document);
	}

	@Override
	public DocumentForm getById(String documentId) {
		DocumentForm documentForm = new DocumentForm();
		DBObject object = documentsDao.findDocument(documentId);

		if (object != null) {
			Long documnetId = null;
			try {
				documnetId = Long.parseLong((String) object.get("document_id"));
			} catch (NumberFormatException e) {
				System.out.println("Document id not found in DB!");
			}

			Long epObjectId = null;
			try {
				epObjectId = Long
						.parseLong((String) object.get("ep_object_id"));
			} catch (NumberFormatException e) {
				System.out.println("Ep object id not found in DB!");
			}

			if (documnetId != null && epObjectId != null) {
				List<ImageNode> imagesUrlList = HtmlDocumentSnippetReader
						.getImageUrls(documnetId);
				documentForm.setImages(imagesUrlList);
				documentForm.setDocument_id(documentId.toString());
				documentForm.setEp_object_id(epObjectId.toString());

			}
		}
		return documentForm;

	}

}
