package org.hackathon.openassets.db.repository.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class MappedDocumentRepository {

	private final DBCollection mappedDocumentCollection;
	private final static Logger LOG = LoggerFactory
			.getLogger(MappedDocumentRepository.class);

	public MappedDocumentRepository(final DB database) {
		mappedDocumentCollection = database.getCollection("mapped_documents");
	}

	public void insert(String document) {
		DBObject objectToSave = (DBObject) JSON.parse(document);
		mappedDocumentCollection.insert(objectToSave);
	}

	
	public String findDocument(String documentId) {
		//TODO: remove ObjectId from Query
		DBObject document = null;

		BasicDBObject query = new BasicDBObject("document_id", documentId);

		LOG.info("findDocument query: {}", query);
		document = mappedDocumentCollection.findOne(query);

		if (document == null) {
			// System.out.println("Document not in database");
			return null;
		}

		LOG.info("Document found: {}", document.toString());
		return document.toString();
	}

}
