package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import java.util.List;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;
import org.hackathon.openassets.db.repository.MappedDocumentRepository;
import org.hackathon.openassets.model.DocumentForm;
import org.hackathon.openassets.model.MappedDocument;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class MappedDocumentRepositoryImpl implements MappedDocumentRepository {

	@Override
	public MappedDocument getById(String documentId) {
		MappedDocument mappedDocument = new MappedDocument();

		DBObject object = mappedDocumentsDao.findDocument(documentId);
		String objectString = JSON.serialize(object);
		Gson gson = new Gson();

		mappedDocument = (MappedDocument) gson.fromJson(objectString,
				MappedDocument.class);

		return mappedDocument;
	}

	@Override
	public void update(MappedDocument document) {
		// TODO Auto-generated method stub

	}

	private MappedDocumentDao mappedDocumentsDao;

	private final static String connectionUrl = "mongodb://localhost";

	public MappedDocumentRepositoryImpl() {
		try {
			DbMongoClient dbMongoClient = new DbMongoClient(connectionUrl);
			mappedDocumentsDao = dbMongoClient.getMappedDocumentsDao();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
