package org.hackathon.openassets.db.repository;

import java.io.IOException;
import java.util.List;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;
import org.hackathon.openassets.db.repository.mongodb.DbMongoClient;
import org.hackathon.openassets.db.repository.mongodb.DocumentsDao;
import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;

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
	public void update(DocumentForm document) {
		// TODO Auto-generated method stub

	}

}
