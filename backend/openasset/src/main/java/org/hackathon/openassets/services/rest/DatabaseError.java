package org.hackathon.openassets.services.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class DatabaseError extends WebApplicationException {

	private static final long serialVersionUID = -5066804818943679888L;

	public DatabaseError() {
		super(Response.serverError().build());
	}

}
