package org.hackathon.openassets.db.repository.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public interface MappedDocumentDao {
	
	public DBObject findDocument(String documentId);
	
}
