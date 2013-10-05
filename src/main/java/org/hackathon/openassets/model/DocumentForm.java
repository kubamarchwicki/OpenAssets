package org.hackathon.openassets.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.datagrabber.ImageNode;

@XmlRootElement
public class DocumentForm {
	private String ep_object_id;
	private String document_id;
	private String posel_id;
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

	public String getPosel_id() {
		return posel_id;
	}

	public void setPosel_id(String posel_id) {
		this.posel_id = posel_id;
	}

	public List<ImageNode> getImages() {
		return images;
	}

	public void setImages(List<ImageNode> images) {
		this.images = images;
	}
	
	public void downloadImages() {
		List<ImageNode> imagesUrlList = new HtmlDocumentSnippetReader()
				.getImageUrls(getDocument_id());
		
		this.setImages(imagesUrlList);
	}

	@Override
	public String toString() {
		return "DbObjectIdPair [ep_object_id=" + ep_object_id
				+ ", document_id=" + document_id + ", images.size()=" + ((images != null)?images.size():0) + "]";
	}
	
	
	
}
