package org.hackathon.openassets.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.db.repository.DocumentRepositoryImpl;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.model.DocumentForm;



@Path("document")
public class DocumentService {

	@GET
	@Path("/random")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentForm getRandomDocument() {
		DocumentRepository repository = getDocRepo();
		return repository.getRandomIncomplete();
	}

	// @POST
	// @Path("/{document}")
	// @Consumes(MediaType.APPLICATION_JSON)
	// public void updateDocument(@PathParam("document") DocumentForm document)
	// {
	public void updateDocument(DocumentForm document) {
		DocumentRepository repository = getDocRepo();
		repository.update(document);
	}

	/**
	 * @return obiekt repozytorium
	 */
	protected DocumentRepository getDocRepo() {
		return new RepositoryFactory()
				.getDocumentRepository(DocumentRepositoryImpl.class);
	}
}
