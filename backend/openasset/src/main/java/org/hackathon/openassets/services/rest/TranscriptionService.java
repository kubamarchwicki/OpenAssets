package org.hackathon.openassets.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.MappedDocumentRepository;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.model.DocumentForm;
import org.hackathon.openassets.model.MappedDocument;

@Path("transcription")
public class TranscriptionService {

	@GET
	@Path("/{transcriptionId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MappedDocument getRandomDocument(
			@PathParam("transcriptionId") String documentId) {
		MappedDocumentRepository repository = getDocRepo();
		return repository.getById(documentId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateDocument(DocumentForm form) {
		System.out.println("Recieved object: " + form.getDocument_id());
		// MappedDocumentRepository repository = getDocRepo();
		// repository.update(form);
	}

	/**
	 * @return repository object
	 */
	protected MappedDocumentRepository getDocRepo() {
		return new RepositoryFactory()
				.getMappedDocumentRepository(MappedDocumentRepository.class);
	}
}
