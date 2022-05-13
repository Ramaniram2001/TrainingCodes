package com.training.jax_rs_client;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		WebTarget target= client.target("http://localhost:9090/products");
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
	Response resp=builder.get();
//	System.out.println(resp);
//	System.out.println("****************************");
//		String object=resp.readEntity(String.class);
//    	System.out.println(object);
   
    	
		//Product toAdd = new Product(6,"hari",56);
    	//Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//    	System.out.println(response.getStatus());
//    	System.out.println(response.readEntity(String.class));
    	
    	int ch =3 ;
		if(ch==1) {
		Product[] list=resp.readEntity(Product[].class);
		for(Product eachproduct:list) {
			System.out.println(eachproduct);
		}
		}
		//findall
		if(ch==2) {
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		//findbyid
		if(ch==3) {
			WebTarget findByIdTarget = target.path("/srch/76");
			
			Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);
            
			Response findByResp=builder2.get();
            
			Product object2=findByResp.readEntity(Product.class);
			System.out.println(object2);
		}
		if(ch==4) {
			Product toAdd = new Product(66,"eyeliner", 1500);
			Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
	    	System.out.println(response);
		}
    	
	}


       }
	


 
