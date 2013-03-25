package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DbMongoClient {

	private DocumentsDao documentsDao;
	
	private MappedDocumentDao mappedDocumentsDao;
	
	final DB database;


	public DocumentsDao getDocumentsDao() {
		documentsDao = new DocumentsDaoImpl(database);
		return documentsDao;
	}

	public DbMongoClient(String mongoURIString) throws IOException {
		final MongoClient mongoClient = new MongoClient(new MongoClientURI(
				mongoURIString));
			database = mongoClient.getDB("hackaton");
		
	}


	public MappedDocumentDao getMappedDocumentsDao() {
		mappedDocumentsDao = new MappedDocumentDaoImpl(database);
		return mappedDocumentsDao;
	}

}
