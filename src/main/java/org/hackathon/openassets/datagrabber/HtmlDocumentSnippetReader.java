package org.hackathon.openassets.datagrabber;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for reading html page content 
 * 
 * @author Sławomir Bretes
 *
 */
public class HtmlDocumentSnippetReader {

	public static List<ImageNode> getImageUrls(String documentId) {
		//TODO: this is a bit hacked because new urls doesnt work at all. 
		//but based on url tracing we can figureout most important images

//		TODO: the new API url
//		http://docs.sejmometr.pl/htmlex/{$id}/{$id}.html

		List<ImageNode> matches = new ArrayList<ImageNode>();
		for (int i=1; i<=6; i++) {
			ImageNode image =new ImageNode();
			image.setId("page"+i);
			image.setUrl("http://docs.sejmometr.pl/htmlex/"+documentId+"/p"+i+".png");
			matches.add(image);
		}
		
		return matches;
	}
	
	/**
	 * @param documentId - document identifier
	 * @return list of image urls or null if error occurs
	 */
//	public static List<ImageNode> getImageUrls(String documentId) {
//
//		try {
//			String urlStr = "http://epanstwo.net/docs/snippets/{document_id}.html";
//
//			if (documentId != null) {
//				urlStr = urlStr.replace("{document_id}", documentId);
//
//				URL u = new URL(urlStr);
//				URLConnection conn = u.openConnection();
//				BufferedReader in = new BufferedReader(new InputStreamReader(
//						conn.getInputStream()));
//
//				 final String regex = "src=(['\"])" // the ' or the " is in group 1
//		              + "(.*?)" // match any character in a non-greedy fashion
//		              + "\\1"; // closes with the quote that is in group 1
//				List<ImageNode> matches = new ArrayList<ImageNode>();
//				Pattern p = Pattern.compile(regex);
//				Matcher m = null;
//				int pageCounter =1;
//				String inputLine;
//				while ((inputLine = in.readLine()) != null) {
//					m = p.matcher(inputLine);
//					while (m.find()) {
//						//matches.add(m.group(1));
//						ImageNode image =new ImageNode();
//						image.setId("page"+pageCounter);
//						image.setUrl(m.group(2));
//						matches.add(image);
//						pageCounter++;
//					}
//				}
//
//				in.close();
//
//				return matches;
//			}
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//
//	}

}
