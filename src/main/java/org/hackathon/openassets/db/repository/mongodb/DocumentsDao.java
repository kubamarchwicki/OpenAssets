package org.hackathon.openassets.db.repository.mongodb;

import java.util.Random;

import org.hackathon.openassets.model.DbObjectIdPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public class DocumentsDao {

	private final DBCollection documentsCollection;
	private final static Logger LOG = LoggerFactory
			.getLogger(DocumentsDao.class);

	public DocumentsDao(final DB database) {
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
		documentIdPair.setEp_object_id(getFromDbObject(document, "id"));
		documentIdPair.setDocument_id(getFromDbObject(document, "document_id"));
		return documentIdPair;
	}

	public DbObjectIdPair getRandomDocumentId() {
		//http://stackoverflow.com/questions/2824157/random-record-from-mongodb
		//http://cookbook.mongodb.org/patterns/random-attribute/
		long cnt = documentsCollection.count();
		Random random = new Random();
		int randomValue = random.nextInt((int)cnt);
		DBObject randomDocument = documentsCollection.find().limit(-1).skip(randomValue).next();

		DbObjectIdPair documentIdPair = new DbObjectIdPair();
		documentIdPair.setEp_object_id(getFromDbObject(randomDocument, "id"));
		documentIdPair.setDocument_id(getFromDbObject(randomDocument, "document_id"));
		return documentIdPair;
	}

	private String getFromDbObject(DBObject obj, String field) {
		BasicDBObject data = (BasicDBObject) obj.get("data");
		String returnStr = (String) data.get(field);
		LOG.info("getFromDbObject [{}={}]", field, returnStr);
		return returnStr;
	}

}
