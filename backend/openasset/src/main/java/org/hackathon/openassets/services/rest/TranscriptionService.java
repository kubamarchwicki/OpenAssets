package org.hackathon.openassets.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.business.DocumentTranscriptionProcessor;
import org.hackathon.openassets.business.SimpleSentenceComparator;
import org.hackathon.openassets.db.repository.MappedDocumentRepository;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepositoryImpl;
import org.hackathon.openassets.model.DocumentForm;
import org.hackathon.openassets.model.MappedDocument;

import com.google.gson.Gson;

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
		MappedDocumentRepository repo = getDocRepo();
		MappedDocument document = repo.getById(form.getDocument_id());
		boolean newDocument = false;
		if (null == document) {
			System.out.println("We have a new document :D");
			newDocument = true;
			document = new MappedDocument();
			document.setTrusted("no");
			document.setEp_object_id(form.getEp_object_id());
			document.setDocument_id(form.getDocument_id());
		}
		new DocumentTranscriptionProcessor().processTranscription(document,
				form, new SimpleSentenceComparator());
		System.out.println("################################################");
		System.out.println("# Its just for sure ignore another couple lines");
		System.out.println("################################################");
		System.out.println(new Gson().toJson(document));
		System.out.println("################################################");
		if (newDocument) {
			System.out.println("Saving new document");
			repo.save(document);
		} else {
			System.out.println("Updating document");
			repo.update(document);
		}
	}

	/**
	 * @return repository object
	 */
	protected MappedDocumentRepository getDocRepo() {
		return new RepositoryFactory()
				.getMappedDocumentRepository(MappedDocumentRepositoryImpl.class);
	}
}
