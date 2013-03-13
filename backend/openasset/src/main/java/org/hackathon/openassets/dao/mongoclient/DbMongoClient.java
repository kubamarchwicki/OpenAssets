package org.hackathon.openassets.dao.mongoclient;

import java.io.IOException;

import org.hackathon.openassets.dao.DocumentsDao;
import org.hackathon.openassets.dao.DocumentsDaoImpl;
import org.hackathon.openassets.document.HtmlDocumentSnippetReader;
import org.hackathon.openassets.services.rest.ResponseMaker;


import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DbMongoClient {

	private final DocumentsDao documentsDao;

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			new DbMongoClient("mongodb://localhost");
		} else {
			new DbMongoClient(args[0]);
		}

	}

	public DbMongoClient(String mongoURIString) throws IOException {
		final MongoClient mongoClient = new MongoClient(new MongoClientURI(
				mongoURIString));
		final DB database = mongoClient.getDB("hackaton");
		documentsDao = new DocumentsDaoImpl(database);
		DBObject doc = documentsDao.findDocument("153481");
		System.out.println("Pobrano id dokumentu "
				+ documentsDao.getIdFromDbObjectDocument(doc));
		
		HtmlDocumentSnippetReader reader = new HtmlDocumentSnippetReader();
		for (String url : reader.getImageUrls(153481L)){
			System.out.println("URL" +url);
		}
		
		ResponseMaker responseMaker = new ResponseMaker();
		System.out.println("Response: "+responseMaker.makeJsonResponse(153481L));
	}

}
