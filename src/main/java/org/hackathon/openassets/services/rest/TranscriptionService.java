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
import org.hackathon.openassets.model.MappedDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("transcription")
public class TranscriptionService {

	private final static Logger LOG = LoggerFactory
			.getLogger(TranscriptionService.class);

	@GET
	@Path("/{transcriptionId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MappedDocument getDocument(
			@PathParam("transcriptionId") String documentId) {
		MappedDocumentRepository repository = getDocRepo();
		return repository.getById(documentId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateDocument(final String form) {
		//TODO: add IP address of document submitter
		LOG.info("Recieved object: " + form);
//		MappedDocumentRepository repo = getDocRepo();
//		MappedDocument document = repo.getById(form.getDocument_id());
//		boolean newDocument = false;
//		if (null == document) {
//			newDocument = true;
//			document = new MappedDocument();
//			document.setTrusted("no");
//			document.setEp_object_id(form.getEp_object_id());
//			document.setDocument_id(form.getDocument_id());
//		}
//		new DocumentTranscriptionProcessor().processTranscription(document,
//				form, new SimpleSentenceComparator());
//
//		LOG.info("Document [isNew={}, data={}]", newDocument,
//				new Gson().toJson(document));
//		if (newDocument) {
//			repo.save(document);
//		} else {
//			repo.update(document);
//		}
	}

	/**
	 * @return repository object
	 */
	protected MappedDocumentRepository getDocRepo() {
		return new RepositoryFactory().getMappedDocumentRepository();
	}
}
