package com.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class RESTEasyExample {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {


		String result = "Restful example : " + msg;

                try{Thread.sleep(9000);
                 }catch(Exception e){} 

		return Response.status(200).entity(result).build();

	}

}
