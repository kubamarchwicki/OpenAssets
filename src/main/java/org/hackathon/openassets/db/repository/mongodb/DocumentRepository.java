package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;

import org.hackathon.openassets.model.DbObjectIdPair;
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
			throw new RuntimeException(e);
		}
	}

	public DbObjectIdPair getRandom() {
		DbObjectIdPair randomDocument = documentsDao
				.getRandomDocumentId();
		randomDocument.downloadImages();
		
		LOG.info("Random DocumentForm[document_id={}, ep_object_id={}]",
				randomDocument.getDocument_id(), randomDocument.getEp_object_id());
		return randomDocument;
	}

	public DbObjectIdPair getById(String paramDocumentId) {
		DbObjectIdPair document = documentsDao.findDocument(paramDocumentId);

		if (document == null) {
			LOG.warn("Object with id={} not found! Returning random document", paramDocumentId);
			return document;
		}

		document.downloadImages();
		LOG.info("Random DocumentForm[document_id={}, ep_object_id={}]",
				document.getDocument_id(), document.getEp_object_id());
		return document;
	}

}
