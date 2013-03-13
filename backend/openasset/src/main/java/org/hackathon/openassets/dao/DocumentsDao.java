package org.hackathon.openassets.dao;

import com.mongodb.DBObject;

public interface DocumentsDao {

	public DBObject findDocument(String documentId);
	
	public Long getIdFromDbObjectDocument(DBObject obj);
	
		
}
