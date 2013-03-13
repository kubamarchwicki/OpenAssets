package org.hackathon.openassets.datagrabber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for reading html page content 
 * 
 * @author Sławomir Bretes
 *
 */
public class HtmlDocumentSnippetReader {

	
	/**
	 * @param documentId - document identifier
	 * @return list of image urls or null if error occurs
	 */
	public static List<String> getImageUrls(Long documentId) {

		try {
			String urlStr = "http://epanstwo.net/docs/snippets/{dokument_id}.html";

			if (documentId != null) {
				urlStr = urlStr.replace("{dokument_id}", documentId.toString());

				URL u = new URL(urlStr);
				URLConnection conn = u.openConnection();
				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));

				 final String regex = "src=(['\"])" // the ' or the " is in group 1
		              + "(.*?)" // match any character in a non-greedy fashion
		              + "\\1"; // closes with the quote that is in group 1
				List<String> matches = new ArrayList<String>();
				Pattern p = Pattern.compile(regex);
				Matcher m = null;

				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					m = p.matcher(inputLine);
					while (m.find()) {
						//matches.add(m.group(1));
						matches.add(m.group(2));
					}
				}

				in.close();

				return matches;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
