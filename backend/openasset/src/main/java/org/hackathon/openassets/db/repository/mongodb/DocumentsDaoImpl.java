package org.hackathon.openassets.db.repository.mongodb;

import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

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
			String returnStr = (String) data.get("dokument_id");
			System.out.println("dokument_id == "+returnStr);
			return returnStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private String getIdEpFromDbObjectDocument(DBObject obj) {
		try {
			String returnStr = (String) obj.get("id");
			System.out.println("id == "+returnStr);
			return returnStr; 
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
			System.out.println("Getting random incomplete document failed!");
			return randomDocumentIdPair;
		} finally {
			cursor.close();
		}
	}

	@Override
	public boolean updateInvalid(DBObject obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateDocument(DocumentForm obj) {
		try {
			BasicDBObject findQuery = new BasicDBObject("dokument_id",obj.getDocument_id()).append("ep_object_id", obj.getEp_object_id());
			DBObject objectToUpdate = documentsCollection.findOne(findQuery);
			objectToUpdate.put("trusted", "yes");
			documentsCollection.update(findQuery, objectToUpdate);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Document update failed!");
		}
	}

}
