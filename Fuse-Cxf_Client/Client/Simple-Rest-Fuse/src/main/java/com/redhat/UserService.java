package com.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public interface UserService {

	@GET
	@Path("/{msg}")
	public Response printMessage(@PathParam("msg") String msg);
}
