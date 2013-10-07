package org.hackathon.openassets.services.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.db.repository.mongodb.MappedDocumentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jayway.jsonpath.InvalidPathException;
import com.jayway.jsonpath.JsonPath;

@Path("transcriptions")
public class TranscriptionService {

	private final static Logger LOG = LoggerFactory
			.getLogger(TranscriptionService.class);

	private final static JsonPath DOCUMENT_ID = JsonPath.compile("$.document_id");
	private final static JsonPath EP_OBJECT_ID = JsonPath.compile("$.ep_object_id");
	
	@Context
	private HttpServletRequest request;

	@GET
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMappedDocumentsCount() {
		MappedDocumentRepository repository = new RepositoryFactory().getMappedDocumentsRepository();
		return repository.countMappedDocuments();
	}

	
	@GET
	@Path("/{documentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDocument(
			@PathParam("documentId") String documentId) {
		MappedDocumentRepository repository = new RepositoryFactory().getMappedDocumentsRepository();
		return repository.findDocuments(documentId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateDocument(final String form) {
		try {
			DOCUMENT_ID.read(form);
			EP_OBJECT_ID.read(form);
		} catch (InvalidPathException e) {
			return Response.status(Status.NOT_ACCEPTABLE).build();
		}
		
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
		    ipAddress = request.getRemoteAddr();
		}

		LOG.info("Recieved object: {} from IPAddress: {} ", form,  ipAddress);
		MappedDocumentRepository repo = new RepositoryFactory().getMappedDocumentsRepository();
		repo.insert(form, ipAddress);
		
		return Response.status(Status.CREATED).build();
	}

}
