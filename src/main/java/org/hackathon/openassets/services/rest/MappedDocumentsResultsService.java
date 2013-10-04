package org.hackathon.openassets.services.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hackathon.openassets.db.repository.MappedDocumentRepository;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepositoryImpl;
import org.hackathon.openassets.model.MappedDocument;

@Path("results")
public class MappedDocumentsResultsService {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MappedDocument> getTrustedDocuments() {
		MappedDocumentRepository repository = getDocRepo();
		return repository.getTrusted();
	}


	/**
	 * @return repository object
	 */
	protected MappedDocumentRepository getDocRepo() {
		return new RepositoryFactory().getMappedDocumentRepository();
	}
}
