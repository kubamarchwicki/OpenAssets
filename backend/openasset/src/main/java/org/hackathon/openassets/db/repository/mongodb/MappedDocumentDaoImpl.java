package org.hackathon.openassets.db.repository.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MappedDocumentDaoImpl implements MappedDocumentDao {

	private final DBCollection mappedDocumentCollection;

	public MappedDocumentDaoImpl(final DB database) {
		mappedDocumentCollection = database.getCollection("mapped_documents");
	}



	
}
