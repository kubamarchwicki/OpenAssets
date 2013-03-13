package org.hackathon.openassets.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.model.Document;

@Path("document")
public class DocumentService {

	@GET
	@Path("/random")
	@Produces(MediaType.APPLICATION_JSON)
	public Document getRandomDocument() {
		throw new RuntimeException("Not implemented yet.");
	}

	@POST
	@Path("/{document}")
	@Produces(MediaType.APPLICATION_JSON)
	public Document updateDocument(@PathParam("document") Document document) {
		throw new RuntimeException("Not implemented yet.");
	}

}
