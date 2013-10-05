package org.hackathon.openassets.datagrabber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * Class for reading html page content 
 * 
 * @author Sławomir Bretes
 *
 */
public class HtmlDocumentSnippetReader {

	public String getHtmlSnippetUrl(String documentId) {
		final String template = "http://docs.sejmometr.pl/htmlex/{document_id}/{document_id}_1.html";
		return template.replace("{document_id}", documentId);
	}
	
	public List<ImageNode> getImageUrls(String documentId) {
		if (documentId == null) return Collections.emptyList();
		
		HttpRequest request = HttpRequest.get(getHtmlSnippetUrl(documentId));
		if (request.code() == 404) return Collections.emptyList();

		String[] lines = request.body().split(System.getProperty("line.separator"));

		final String regex = "data-page-no=\"(\\d)"
				+ ".*?"
				+ "background-image:url\\((.*?)\\)";
		
		Pattern p = Pattern.compile(regex);
		
		List<ImageNode> matches = new ArrayList<ImageNode>();
		for (String line: lines) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				//matches.add(m.group(1));
				ImageNode image =new ImageNode();
				image.setId("page"+m.group(1));
				image.setUrl(m.group(2));
				matches.add(image);
			}
		}
		
		return matches;
	}

}
