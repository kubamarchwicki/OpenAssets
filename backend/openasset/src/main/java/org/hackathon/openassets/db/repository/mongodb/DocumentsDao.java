package org.hackathon.openassets.db.repository.mongodb;

import com.mongodb.DBObject;

public interface DocumentsDao {

	public DBObject findDocument(String documentId);
	
	public Long getIdFromDbObjectDocument(DBObject obj);
	
		
}
