package org.hackathon.openassets.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int updateDocument(DocumentForm form) {
		System.out.println("Recieved object: " + form.getDocument_id());
		DocumentRepository repository = getDocRepo();
		repository.update(form);
		// throw new DatabaseError();
		return 0;
	}

	/**
	 * @return obiekt repozytorium
	 */
	protected DocumentRepository getDocRepo() {
		// FIXME: Podać konkretną klasę implementującą
		return new RepositoryFactory()
				.getDocumentRepository(DummyDocumentRepository.class);
	}
}
