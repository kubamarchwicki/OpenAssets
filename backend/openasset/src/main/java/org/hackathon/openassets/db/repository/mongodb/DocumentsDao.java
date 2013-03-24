package org.hackathon.openassets.db.repository.mongodb;

import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;

import com.mongodb.DBObject;

public interface DocumentsDao {

	public DbObjectIdPair findDocument(String documentId);
	public DbObjectIdPair getRandomIncompleteDocumentId();
	public DbObjectIdPair getIncompleteDocument(String documentId);
	public boolean updateInvalid(DBObject obj);
	public void updateDocument(DocumentForm obj);
		
}
