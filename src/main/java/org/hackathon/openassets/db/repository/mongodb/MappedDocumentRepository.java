package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hackathon.openassets.model.MappedDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class MappedDocumentRepository {
	private final static Logger LOG = LoggerFactory
			.getLogger(MappedDocumentRepository.class);

	private MappedDocumentDao mappedDocumentsDao;

	public MappedDocumentRepository() {
		try {
			DbMongoClient dbMongoClient = new DbMongoClient();
			mappedDocumentsDao = dbMongoClient.getMappedDocumentsDao();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void insert(String document) {
		mappedDocumentsDao.insert(document);
	}

	//?? no longer needed
	
	public MappedDocument getById(String documentId) {
		MappedDocument mappedDocument = null;

		DBObject object = mappedDocumentsDao.findDocument(documentId);
		if (object != null) {
			String objectString = JSON.serialize(object);
			Gson gson = new Gson();
			mappedDocument = (MappedDocument) gson.fromJson(objectString,
					MappedDocument.class);
		}
		return mappedDocument;
	}

	public List<MappedDocument> getTrusted() {
		List<DBObject> objects = mappedDocumentsDao.queryTrustedDocuments();

		List<MappedDocument> documents = new ArrayList<MappedDocument>();
		for (DBObject object : objects) {
			String objectString = JSON.serialize(object);
			Gson gson = new Gson();
			documents.add((MappedDocument) gson.fromJson(objectString,
					MappedDocument.class));
		}

		LOG.info("Returning [count={}] truested documents", documents.size());
		return documents;
	}

}
