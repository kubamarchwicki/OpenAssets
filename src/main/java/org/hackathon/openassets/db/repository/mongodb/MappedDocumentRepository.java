package org.hackathon.openassets.db.repository.mongodb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.AggregationOutput;
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

	public void insert(String document, String ipAddress) {
		BasicDBObject objectToSave = (BasicDBObject) JSON.parse(document);
		objectToSave.append("requestData", 
				new BasicDBObject("ip-address", ipAddress));
		
		LOG.debug("Inserting {}", objectToSave);
		mappedDocumentCollection.insert(objectToSave);
	}

	public String countMappedDocuments() {
		//db.mapped_documents.aggregate({$project: {_id:0, document_id: 1}},
		//{ $group: {_id: {document_id: "$document_id"}, documents_count: {$sum: 1}, document_id: {$first: "$document_id"}}}, 
		//{$sort:{documents_count: -1}})
		
		DBObject project = new BasicDBObject("$project", 
				new BasicDBObject("_id", 0).append("document_id", 1));

		DBObject group = new BasicDBObject("$group", 
				new BasicDBObject("_id", new BasicDBObject("document_id", "$document_id"))
						.append("document_count", new BasicDBObject("$sum", 1))
						.append("document_id", new BasicDBObject("$first", "$document_id"))
						);

		DBObject sort = new BasicDBObject("$sort", 
				new BasicDBObject("document_count", -1));

		AggregationOutput output = mappedDocumentCollection.aggregate(project, group, sort);
		Iterator<DBObject> iter = output.results().iterator();
		List<DBObject> list = new ArrayList<>();
		while (iter.hasNext()) {
			list.add(iter.next());
		}

		return JSON.serialize(list);
	}
	
	public String findDocuments(String documentId) {
		DBObject query = new BasicDBObject("document_id", documentId);
		LOG.debug("findDocument query: {}", query);
		List<DBObject> list = mappedDocumentCollection.find(query, filterMongoId()).toArray();

		LOG.debug("Document found: {}", list);
		return JSON.serialize(list);
	}
	
	private DBObject filterMongoId() {
		return new BasicDBObject("_id", 0);
	}

}
