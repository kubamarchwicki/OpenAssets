package org.hackathon.openassets.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement
public class DocumentForm {
	private final static Logger LOG = LoggerFactory
			.getLogger(DocumentForm.class);
	
	private String ep_object_id;
	private String document_id;
	private List<ImageNode> images;
	
	public String getEp_object_id() {
		return ep_object_id;
	}

	public void setEp_object_id(String ep_object_id) {
		this.ep_object_id = ep_object_id;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public List<ImageNode> getImages() {
		return images;
	}

	public void setImages(List<ImageNode> images) {
		this.images = images;
	}
	
	public void downloadImages() {
		List<ImageNode> imagesUrlList = HtmlDocumentSnippetReader
				.getImageUrls(getDocument_id());
		
		this.setImages(imagesUrlList);
	}

	@Override
	public String toString() {
		return "DbObjectIdPair [ep_object_id=" + ep_object_id
				+ ", document_id=" + document_id + ", images.size()=" + ((images != null)?images.size():0) + "]";
	}
	
	
	
}
