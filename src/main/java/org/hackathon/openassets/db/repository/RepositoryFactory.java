package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.db.repository.mongodb.DocumentRepository;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepositoryImpl;

public class RepositoryFactory {

	public DocumentRepository getDocumentRepository() {
		return new DocumentRepository();
	}

	public MappedDocumentRepository getMappedDocumentRepository() {
		return new MappedDocumentRepositoryImpl();
	}

}
