package org.hackathon.openassets.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.mongodb.DocumentsRepository;
import org.hackathon.openassets.model.DocumentForm;

@Path("document")
public class DocumentService {

	@GET
	@Path("/{documentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentForm getDocumentById(
			@PathParam("documentId") String documentId) {
		DocumentsRepository dao = new RepositoryFactory().getDocumentsRepository();
		return dao.findDocument(documentId);
	}

	@GET
	@Path("/random")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentForm getRandomDocument() {
		DocumentsRepository dao = new RepositoryFactory().getDocumentsRepository();
		return dao.getRandomDocument();
	}
}
