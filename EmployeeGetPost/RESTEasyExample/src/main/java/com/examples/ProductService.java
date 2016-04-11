package com.javatpoint.rest;  
import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;  
import java.util.*;  

@Path("/employee")  
public class ProductService{  


static HashMap<Integer,String> hm=new HashMap<Integer,String>();  

static
{

hm.put(101,"Herambh");
hm.put(102,"Kunjan");
hm.put(103,"Ravi");

}
        
    @POST  
    @Path("/add")  
    public Response addUser(  
        @FormParam("id") int id,  
        @FormParam("name") String name){  
       
	HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	hm.put(id,name);
 
        return Response.status(200)  
            .entity(" Employee added successfuly!<br> Id: "+id+"<br> Name: " + name)  
            .build();  
    }  


     @GET
     @Path("/{param}")
     public Response printMessage(@PathParam("param") String id) throws Exception{

                int empid=Integer.parseInt(id);

                String empname = hm.get(empid);

		return Response.status(200).entity("The employee name you are looking for is"+empname).build();

	}

}  
