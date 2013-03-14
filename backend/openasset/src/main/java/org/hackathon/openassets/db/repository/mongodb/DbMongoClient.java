package org.hackathon.openassets.db.repository.mongodb;

import java.io.IOException;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DbMongoClient {

	private final DocumentsDao documentsDao;


	public DocumentsDao getDocumentsDao() {
		return documentsDao;
	}

	public DbMongoClient(String mongoURIString) throws IOException {
		final MongoClient mongoClient = new MongoClient(new MongoClientURI(
				mongoURIString));
		final DB database = mongoClient.getDB("hackaton");
		documentsDao = new DocumentsDaoImpl(database);
	}

}
