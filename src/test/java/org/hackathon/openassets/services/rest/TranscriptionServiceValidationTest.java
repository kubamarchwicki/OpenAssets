package org.hackathon.openassets.services.rest;

import static org.fest.assertions.Assertions.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;

public class TranscriptionServiceValidationTest {

	private TranscriptionService service = new TranscriptionService();
	
	@Test
	public void no_document_id_in_request() {
		String json = "{\"ep_object_id\":\"18816\",\"miejsce_urodzenia\":\"kjhgfds\"}";
		Response resp = service.updateDocument(json);
		assertThat(resp.getStatus()).isEqualTo(Status.NOT_ACCEPTABLE.getStatusCode());
	}

	@Test
	public void no_ep_object_id_in_request() {
		String json = "{\"document_id\":\"153613\",\"miejsce_urodzenia\":\"kjhgfds\"}";
		Response resp = service.updateDocument(json);
		assertThat(resp.getStatus()).isEqualTo(Status.NOT_ACCEPTABLE.getStatusCode());
	}

}
