package org.hackathon.openassets.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.mongodb.DocumentRepositoryImpl;
import org.hackathon.openassets.model.DocumentForm;

@Path("document")
public class DocumentService {

	@GET
	@Path("/{documentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentForm getRandomDocument(
			@PathParam("documentId") String documentId) {
		DocumentRepository repository = getDocRepo();
		return repository.getById(documentId);
	}

	@GET
	@Path("/random")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentForm getRandomDocument() {
		DocumentRepository repository = getDocRepo();
		return repository.getRandomIncomplete();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateDocument(DocumentForm form) {
		System.out.println("Recieved object: " + form.getDocument_id());
		DocumentRepository repository = getDocRepo();
		repository.update(form);
	}

	/**
	 * @return repository object
	 */
	protected DocumentRepository getDocRepo() {
		return new RepositoryFactory()
				.getDocumentRepository(DocumentRepositoryImpl.class);
	}
}
