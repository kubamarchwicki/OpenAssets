package org.hackathon.openassets.db.repository.mongodb;

import org.hackathon.openassets.model.MappedDocument;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

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
			BasicDBObject findQuery = new BasicDBObject("dokument_id",
					document.getDocument_id()).append("ep_object_id",
					document.getEp_object_id());
			DBObject objectToSave = (DBObject) JSON.parse(json);
			mappedDocumentCollection.update(findQuery, objectToSave);
		}

	}

}
