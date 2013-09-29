package org.hackathon.openassets.db.repository.mongodb;

import java.util.List;

import org.hackathon.openassets.model.MappedDocument;

import com.mongodb.DBObject;

public interface MappedDocumentDao {
	
	public DBObject findDocument(String documentId);
	
	public List<DBObject> queryTrustedDocuments();
	
	public void save(MappedDocument document);
	
	public void update(MappedDocument document);
	
}
