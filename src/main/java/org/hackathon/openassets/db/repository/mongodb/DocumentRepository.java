package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import java.util.List;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;
import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentRepository {

	private final static Logger LOG = LoggerFactory
			.getLogger(DocumentRepository.class);

	private DocumentsDao documentsDao;

	public DocumentRepository() {
		try {
			DbMongoClient dbMongoClient = new DbMongoClient();
			documentsDao = dbMongoClient.getDocumentsDao();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DocumentForm getRandom() {

		DbObjectIdPair randomDocument = documentsDao
				.getRandomDocumentId();

		DocumentForm documentForm = prepareDocumentForm(
				randomDocument.getDocument_id(),
				randomDocument.getEp_object_id());

		LOG.info(
				"Random incomplete DocumentForm[document_id={}, ep_object_id={}]",
				documentForm.getDocument_id(), documentForm.getEp_object_id());
		return documentForm;
	}

	public DocumentForm getById(String paramDocumentId) {
		DbObjectIdPair document = documentsDao.findDocument(paramDocumentId);

		if (document == null) {
			LOG.warn("Object with id={} not found! Returning random document", paramDocumentId);
		}
		
		return prepareDocumentForm(document.getDocument_id(), document.getEp_object_id());
	}

	private DocumentForm prepareDocumentForm(String documentId,
			String EpObjectId) {
		DocumentForm documentForm = new DocumentForm();

		List<ImageNode> imagesUrlList = HtmlDocumentSnippetReader
				.getImageUrls(documentId);
		documentForm.setImages(imagesUrlList);
		documentForm.setDocument_id(documentId);
		documentForm.setEp_object_id(EpObjectId);

		return documentForm;
	}

}
