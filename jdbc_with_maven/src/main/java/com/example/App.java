package com.example;

import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductServices;
//import com.example.entity.Member;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void member() {
		Connection con;
		try {
			con=ConnectionFactory.getPostgresConnection();
			MemberRepository service=new MemberRepository(con);
			System.out.println(con);
			}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
		public static void product()
	{
			//Connection con=ConnectionFactory.getOracleConnection();
			//Connection con=ConnectionFactory.getPostgresConnection();
		///ProductServices service=new ProductServices(con);
			//Product toadd=new Product(46,"jam",234.89);
			//Product toadd=new Product(86,"tawa",97.06);
	       
		//int rowAdded=service.addProduct(toadd);
		//	service.findAll().forEach(System.out::println);
	}

	
       //public static void main(String[] args)
    	
    	//{
            // Connection con;
    	
         //Connection con=null;
		//try {
			//int rowAdded=0;
	  //int rowsUpdated=0;
			//con =ConnectionFactory.getOracleConnection();
		//	con=ConnectionFactory.getPostgresConnection();
			//con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/Test", "postgres","root");
			//con=ConnectionFactory.getPostgresConnection();
			////con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//			System.out.println(con);
//		System.out.println("**********************************");
//MemberRepository service=new MemberRepository(con);
//	System.out.println("the data is " );
//	  service.findAll().forEach(System.out::println);
//	System.out.println("*************************************");
//	Member toAdd=new Member(39,"Vedha","Ariyalur",LocalDate.of(2001,2,23),"Annual",6704.00,16,55.00);
//          	rowAdded=service.add(toAdd);
//       	System.out.println("Row Added : = " + rowAdded);
//		service.findAll().forEach(System.out::println);
//			System.out.println("*************************************");
//			rowsUpdated=service.update(56,"Divya");
//       System.out.println("rows updated : "+rowsUpdated);
//        service.findAll().forEach(System.out::println);
//		}
	//catch(Exception e) {
		//	e.printStackTrace();
		//}
    	//}
    	//}
			
			
//			public static void Hari_Product()
//			{
//				Connection con=ConnectionFactory.getPostgresConnection();
//				ProductServices service=new ProductServices(con);
//				Product toadd=new Product(456,"jam",234.89);
//			    
//				int rowAdded=service.addProduct(toadd);
//				service.findAll().forEach(System.out::println);
//			}
//
//		    public static void main( String[] args )
//		    {
//		    	Hari_Product();
//		    }
//		
      public static void main(String[] args){
   	   Connection con=ConnectionFactory.getOracleConnection();
   	   ProductServices service=new ProductServices(con);
   	 Product kathli=new Product(1,"kaju",450.00);
   	 Product jamun=new Product(2,"jamun",770.0);
   	 service.usingTxn(kathli, jamun);
   
   	   
   	   
  	}
		
}

