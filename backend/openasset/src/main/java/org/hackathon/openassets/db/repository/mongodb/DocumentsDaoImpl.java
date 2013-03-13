package org.hackathon.openassets.db.repository.mongodb;

import java.math.BigDecimal;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public class DocumentsDaoImpl implements DocumentsDao {

	private final DBCollection documentsCollection;

	public DocumentsDaoImpl(final DB database) {
		documentsCollection = database.getCollection("documents");
	}

	public DBObject findDocument(String documentId) {
		DBObject document = null;

		BasicDBObject query = new BasicDBObject("data.dokument_id", documentId);
		
		System.out.println(query);
		document = documentsCollection.findOne(query);

		if (document == null) {
			System.out.println("Document not in database");
			return null;
		}

		System.out.println(document.toString());
		return document;
	}

	public Long getIdFromDbObjectDocument(DBObject obj) {
		try {
			BasicDBObject data = (BasicDBObject) obj.get("data");
			return Long.parseLong((String) data.get("dokument_id"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	}


}
