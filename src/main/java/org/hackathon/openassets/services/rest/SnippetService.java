package org.hackathon.openassets.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.kevinsawicki.http.HttpRequest;

@Path("snippet")
public class SnippetService {

	final String SEJMOMETR_URL = "http://sejmometr.pl/snippets/poslowie/{}.html";
	
	@GET
	@Path("/poslowie/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSnippet(
			@PathParam("id") String id) {
		String data = getHtmlSnippet(SEJMOMETR_URL.replace("{}", id));
		return "{\"html\": \"" + data + "\"}";
	}

	public String getHtmlSnippet(String url) {
		String data = HttpRequest.get(url).body();
		
		StringBuilder b = new StringBuilder();
		for (String d: data.split("\n")) {
			d = d.trim();
			d = d.replace("/>		</p>", "/></p>");
			d = d.replace("\"", "\\\"");			
			b.append(d);
		}
		return b.toString();
	}
	
}
