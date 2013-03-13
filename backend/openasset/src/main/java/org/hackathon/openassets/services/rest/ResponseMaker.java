package org.hackathon.openassets.services.rest;

import org.hackathon.openassets.document.HtmlDocumentSnippetReader;
import org.hackathon.openassets.model.ResponseJson;

import com.google.gson.Gson;



public class ResponseMaker {

	public String makeJsonResponse(Long documentId) {

		Long id = documentId;

		if (id == null) {
			id = getRandomDocumentId();
		}

		Gson gson = new Gson(); 
		
		ResponseJson response = new ResponseJson();
		if (id != null) {
			response.setDocument_id(id.toString());
			response.setImages(HtmlDocumentSnippetReader.getImageUrls(id));
		}

		return gson.toJson(response);

	}

	private Long getRandomDocumentId() {

		return 12L;
	}

}
