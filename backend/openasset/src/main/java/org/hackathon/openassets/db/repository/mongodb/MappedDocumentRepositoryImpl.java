package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hackathon.openassets.db.repository.MappedDocumentRepository;
import org.hackathon.openassets.model.MappedDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class MappedDocumentRepositoryImpl implements MappedDocumentRepository {
	private final static Logger LOG = LoggerFactory
			.getLogger(MappedDocumentRepositoryImpl.class);

	@Override
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
	
	@Override
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

	@Override
	public void update(MappedDocument document) {
		mappedDocumentsDao.update(document);

	}

	private MappedDocumentDao mappedDocumentsDao;

	public MappedDocumentRepositoryImpl() {
		try {
			DbMongoClient dbMongoClient = new DbMongoClient();
			mappedDocumentsDao = dbMongoClient.getMappedDocumentsDao();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(MappedDocument document) {
		mappedDocumentsDao.save(document);
		
	}

}
