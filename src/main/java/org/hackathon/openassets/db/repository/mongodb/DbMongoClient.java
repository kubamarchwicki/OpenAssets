package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.DB;
import com.mongodb.MongoURI;

public class DbMongoClient {

	private final static Logger LOG = LoggerFactory
			.getLogger(DbMongoClient.class);
	private final static String DEFAUFT_CONNECTION_URL = "mongodb://localhost/hackaton";
	
	private DocumentsDao documentsDao;
	
	private MappedDocumentDao mappedDocumentsDao;
	
	final DB database;

	public DbMongoClient() throws IOException {
		MongoURI mongoURI = new MongoURI(getConnecionUrl());
		database = mongoURI.connectDB();
		
		if (mongoURI.getUsername() != null && mongoURI.getPassword() != null) {
			database.authenticate(mongoURI.getUsername(), mongoURI.getPassword());  
		}
	}

	public DocumentsDao getDocumentsDao() {
		documentsDao = new DocumentsDao(database);
		return documentsDao;
	}

	public MappedDocumentDao getMappedDocumentsDao() {
		mappedDocumentsDao = new MappedDocumentDao(database);
		return mappedDocumentsDao;
	}

	private static String getConnecionUrl() {
		String uri = System.getenv("MONGOHQ_URL");
		if (uri == null) {
			LOG.info("No environement variable for connection uri. Defaulting");
			uri = DEFAUFT_CONNECTION_URL;
		}
		
		LOG.info("Connection URL: {}", uri);
		return uri;
	}
}
