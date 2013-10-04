package org.hackathon.openassets.db.repository.mongodb;

import java.util.Random;

import org.hackathon.openassets.model.DocumentForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public class DocumentsRepository {

	private final DBCollection documentsCollection;
	private final static Logger LOG = LoggerFactory
			.getLogger(DocumentsRepository.class);

	public DocumentsRepository(final DB database) {
		documentsCollection = database.getCollection("documents");
	}

	public DocumentForm findDocument(String documentId) {
		BasicDBObject query = new BasicDBObject("data.document_id", documentId);

		LOG.info("findDocument query: {}", query);
		DBObject document = documentsCollection.findOne(query);

		if (document == null) {
			return null;
		}

		DocumentForm d = getDocumentForm(document);
		LOG.info("Found {}", d);
		return d;
	}

	public DocumentForm getRandomDocument() {
		//http://stackoverflow.com/questions/2824157/random-record-from-mongodb
		//http://cookbook.mongodb.org/patterns/random-attribute/
		long cnt = documentsCollection.count();
		Random random = new Random();
		int randomValue = random.nextInt((int)cnt);
		DBObject randomDocument = documentsCollection.find().limit(-1).skip(randomValue).next();
		
		DocumentForm d = getDocumentForm(randomDocument);
		LOG.info("Random {}", d);
		return d;
	}

	private DocumentForm getDocumentForm(DBObject document) {
		DocumentForm documentIdPair = new DocumentForm();
		documentIdPair.setEp_object_id(getFromDbObject(document, "id"));
		documentIdPair.setDocument_id(getFromDbObject(document, "document_id"));
		documentIdPair.setPosel_id(getFromDbObject(document, "posel_id"));
		documentIdPair.downloadImages();

		return documentIdPair;
	}
	
	private String getFromDbObject(DBObject obj, String field) {
		BasicDBObject data = (BasicDBObject) obj.get("data");
		String returnStr = (String) data.get(field);
		return returnStr;
	}

}
