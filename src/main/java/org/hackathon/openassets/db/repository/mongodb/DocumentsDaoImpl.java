package org.hackathon.openassets.db.repository.mongodb;

import java.util.Iterator;
import java.util.Random;

import org.hackathon.openassets.model.DbObjectIdPair;
import org.hackathon.openassets.model.DocumentForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class DocumentsDaoImpl implements DocumentsDao {

	private final DBCollection documentsCollection;
	private final static Logger LOG = LoggerFactory
			.getLogger(DocumentsDaoImpl.class);

	public DocumentsDaoImpl(final DB database) {
		documentsCollection = database.getCollection("documents");
	}

	public DbObjectIdPair findDocument(String documentId) {
		BasicDBObject query = new BasicDBObject("data.document_id", documentId);

		LOG.info("findDocument query: {}", query);
		DBObject document = documentsCollection.findOne(query);

		if (document == null) {
			return null;
		}

		LOG.info("Document found: {}", document.toString());
		
		DbObjectIdPair documentIdPair = new DbObjectIdPair();
		documentIdPair
				.setEp_object_id(getIdEpFromDbObjectDocument(document));
		documentIdPair
				.setDocument_id(getIdFromDbObjectDocument(document));
		return documentIdPair;
	}

	@Override
	public DbObjectIdPair getIncompleteDocument(String documentId) {
		DBObject document = null;
		BasicDBObject query = new BasicDBObject("data.document_id", documentId)
				.append("trusted", "no");
		document = documentsCollection.findOne(query);

		DbObjectIdPair documentIdPair = new DbObjectIdPair();
		documentIdPair
				.setEp_object_id(getIdEpFromDbObjectDocument(document));
		documentIdPair
				.setDocument_id(getIdFromDbObjectDocument(document));
		return documentIdPair;
	}
	
	@Override
	public DbObjectIdPair getRandomIncompleteDocumentId() {
		DBCursor cursor = null;
		DbObjectIdPair randomDocumentIdPair = new DbObjectIdPair();
		try {
			BasicDBObject query = new BasicDBObject("trusted", "no");
			cursor = documentsCollection.find(query);
			if (cursor != null) {

				int cursorSize = cursor.size();
				Random random = new Random();
				int randomValue = random.nextInt(cursorSize);
				Iterator<DBObject> iterator = cursor.iterator();

				int counter = 0;
				while (iterator.hasNext()) {
					DBObject object = cursor.next();
					if (counter == randomValue) {
						randomDocumentIdPair
								.setEp_object_id(getIdEpFromDbObjectDocument(object));
						randomDocumentIdPair
								.setDocument_id(getIdFromDbObjectDocument(object));
						break;
					} else {
						counter++;
					}
				}

			}
			return randomDocumentIdPair;
		} catch (Exception e) {
			e.printStackTrace();
			LOG.warn("Getting random incomplete document failed!");
			return randomDocumentIdPair;
		} finally {
			cursor.close();
		}
	}

	private String getIdFromDbObjectDocument(DBObject obj) {
		try {
			BasicDBObject data = (BasicDBObject) obj.get("data");
			String returnStr = (String) data.get("document_id");
			LOG.info("getIdFromDbObjectDocument [document_id={}]", returnStr);
			return returnStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	private String getIdEpFromDbObjectDocument(DBObject obj) {
		try {
			String returnStr = (String) obj.get("id");
			LOG.info("getIdEpFromDbObjectDocument [id={}]", returnStr);
			return returnStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@Override
	public boolean updateInvalid(DBObject obj) {
		throw new IllegalStateException("Not implemented");
	}

	@Override
	public void updateDocument(DocumentForm obj) {
		try {
			BasicDBObject findQuery = new BasicDBObject("document_id",
					obj.getDocument_id()).append("id", obj.getEp_object_id());
			DBObject objectToUpdate = documentsCollection.findOne(findQuery);
			objectToUpdate.put("trusted", "yes");
			documentsCollection.update(findQuery, objectToUpdate);
		} catch (Exception e) {
			LOG.warn("Document update failed!", e);
		}
	}

}
