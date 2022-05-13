package com.training.model;


	import java.util.List;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.training.services.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
	import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
	
	
	@Path("/students")
	public class StudentResource {
		
		private static  StudentService service=new StudentService();
		
		
		public StudentResource() {
			super();
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public  List<Student> getAllStudent() {
			return service.getAll();
		}
		
		@GET
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response findById(@PathParam("rollNumber")int id) {
			try {
				Student entity=service.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
				return Response.ok(entity).build();
				}catch(RuntimeException e) {
				e.printStackTrace();
			return Response.ok("Id not found").status(400,"id not found").build();
		}
	}
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		public Response add(Student student) { //changing student to Response
			boolean result=service.add(student);
			if(result) {
				return Response.ok(student).status(201).build();
			}
			else {
				return Response.status(400,"Not Created").build();
			}
			
		}
		
		@DELETE
		@Path("/{rollNumber}") 
		@Produces(MediaType.APPLICATION_JSON)
		public Response remove(@PathParam("rollNumber")int id) {
			boolean result=service.remove(id);
			if(result) {
				return Response.status(204,"Successfully deleted").build();
			}
			else {
				return Response.status(400,"Not deleted").build();
			}
		}
	    
		@PUT
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Student update(@PathParam("rollNumber")  int id , Student newStudent)
			{
				return service.update(id,newStudent);
			}
		
}

			
	
		
		
		

	
