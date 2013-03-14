package org.hackathon.openassets.db.repository.mongodb;

import org.hackathon.openassets.model.DbObjectIdPair;

import com.mongodb.DBObject;

public interface DocumentsDao {

	public DBObject findDocument(String documentId);
	public DbObjectIdPair getRandomIncompleteDocumentId();
	
		
}
