package org.hackathon.openassets.services.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.model.Document;

@Path("document")
public class DocumentService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Document> getDocuments() {
		throw new RuntimeException("Not implemented yet.");
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Document> getDocument(@PathParam("id") Long id) {
		throw new RuntimeException("Not implemented yet.");
	}

	@GET
	@Path("/random")
	@Produces(MediaType.APPLICATION_JSON)
	public Document getRandomDocument() {
		throw new RuntimeException("Not implemented yet.");
	}

}
