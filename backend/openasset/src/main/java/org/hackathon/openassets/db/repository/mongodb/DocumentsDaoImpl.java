package org.hackathon.openassets.db.repository.mongodb;

import org.hackathon.openassets.model.DbObjectIdPair;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
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

	private String getIdFromDbObjectDocument(DBObject obj) {
		try {
			BasicDBObject data = (BasicDBObject) obj.get("data");
			return (String) data.get("dokument_id");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private String getIdEpFromDbObjectDocument(DBObject obj) {
		try {
			return (String) obj.get("id");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public DbObjectIdPair getRandomIncompleteDocumentId() {
		DBCursor cursor = null;
		DbObjectIdPair randomDocumentIdPair = new DbObjectIdPair();
		try {
			BasicDBObject query = new BasicDBObject("trusted", "no");
			cursor = documentsCollection.find(query);

			while (cursor.hasNext()) {
				DBObject object = cursor.next();
				randomDocumentIdPair.setEp_object_id(getIdEpFromDbObjectDocument(object));
				randomDocumentIdPair.setDocument_id(getIdFromDbObjectDocument(object));
				System.out.println(cursor.next());
				break;
			}
			return randomDocumentIdPair;
		} catch (Exception e) {
			e.printStackTrace();
			return randomDocumentIdPair;
		} finally {
			cursor.close();
		}
	}

}
