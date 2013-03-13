package org.hackathon.openassets.model;

import java.io.Serializable;
import java.util.List;

public class ResponseJson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5434104657403624135L;

	private String document_id;

	private List<String> images;

	

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

}
