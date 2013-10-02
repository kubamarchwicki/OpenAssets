package org.hackathon.openassets.db.repository.mongodb;

import java.util.List;

import org.hackathon.openassets.model.MappedDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class MappedDocumentDaoImpl implements MappedDocumentDao {

	private final DBCollection mappedDocumentCollection;
	private final static Logger LOG = LoggerFactory
			.getLogger(MappedDocumentDaoImpl.class);


	public MappedDocumentDaoImpl(final DB database) {
		mappedDocumentCollection = database.getCollection("mapped_documents");
	}

	public DBObject findDocument(String documentId) {
		DBObject document = null;

		BasicDBObject query = new BasicDBObject("document_id", documentId);

		LOG.info("findDocument query: {}", query);
		document = mappedDocumentCollection.findOne(query);

		if (document == null) {
			//System.out.println("Document not in database");
			return null;
		}

		LOG.info("Document found: {}", document.toString());
		return document;
	}

	@Override
	public void save(MappedDocument document) {
		if (document != null) {
			Gson gson = new Gson();
			String json = gson.toJson(document);
			DBObject objectToSave = (DBObject) JSON.parse(json);
			mappedDocumentCollection.save(objectToSave);
		}
	}

	@Override
	public void update(MappedDocument document) {
		if (document != null) {
			Gson gson = new Gson();
			String json = gson.toJson(document);
			BasicDBObject findQuery = new BasicDBObject("document_id",
					document.getDocument_id()).append("ep_object_id",
					document.getEp_object_id());
			DBObject objectToSave = (DBObject) JSON.parse(json);
			mappedDocumentCollection.update(findQuery, objectToSave);
		}

	}

	@Override
	public List<DBObject> queryTrustedDocuments() {
		
		BasicDBObject query = new BasicDBObject("trusted", "yes");
		DBCursor cursor = mappedDocumentCollection.find(query);
		
		return cursor.toArray();
	}

}
