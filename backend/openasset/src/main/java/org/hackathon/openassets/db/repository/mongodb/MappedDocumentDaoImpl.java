package org.hackathon.openassets.db.repository.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public class MappedDocumentDaoImpl implements MappedDocumentDao {

	private final DBCollection mappedDocumentCollection;

	public MappedDocumentDaoImpl(final DB database) {
		mappedDocumentCollection = database.getCollection("mapped_documents");
	}
	
	public DBObject findDocument(String documentId) {
		DBObject document = null;

		BasicDBObject query = new BasicDBObject("dokument_id", documentId);

		System.out.println(query);
		document = mappedDocumentCollection.findOne(query);

		if (document == null) {
			System.out.println("Document not in database");
			return null;
		}

		System.out.println(document.toString());
		return document;
	}



	
}
