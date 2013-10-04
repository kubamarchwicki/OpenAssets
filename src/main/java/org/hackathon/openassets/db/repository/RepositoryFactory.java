package org.hackathon.openassets.db.repository;

import java.io.IOException;

import org.hackathon.openassets.db.repository.mongodb.DbMongoClient;
import org.hackathon.openassets.db.repository.mongodb.DocumentsRepository;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepository;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepository;

public class RepositoryFactory {
	
	private static DbMongoClient MONGODB_CLIENT = null;
	
	static {
		try {
			MONGODB_CLIENT = new DbMongoClient();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public DocumentsRepository getDocumentsRepository() {
		return MONGODB_CLIENT.getDocumentsRepository();
	}

	public MappedDocumentRepository getMappedDocumentsRepository() {
		return MONGODB_CLIENT.getMappedDocumentsRepository();
	}

}
