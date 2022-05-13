package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductServices;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			ProductServices service=new ProductServices(con);
			Product toAdd=new Product (77,"ups",123.00);
			int rowAdded=service.addProduct(toAdd);
			System.out.println("Row Added : = " +rowAdded);
			service.findAll().forEach(System.out::println);
			
			int delete=service.deleteById(90);
			System.out.println("deleted" + delete);
			service.findAll().forEach(System.out::println);
			System.out.println("******************************");
			Optional<Product> found=service.findById(15);
			if(found.isPresent()) {
				System.out.println(found.get());
			}else {
				System.out.println("product with given id not present");
			}
			
			System.out.println("**********************************");
	        int rowsUpdated=service.updatePriceByName("cooler",80000);
	        System.out.println("rows updated : "+rowsUpdated);
	        service.findAll().forEach(System.out::println);
	        
	        
			

			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
