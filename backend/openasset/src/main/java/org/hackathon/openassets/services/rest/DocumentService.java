package org.hackathon.openassets.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.dummy.DummyDocumentRepository;
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
		// FIXME: Podaæ konkretn¹ klasê implementuj¹c¹
		return new RepositoryFactory()
				.getDocumentRepository(DummyDocumentRepository.class);
	}
}
