package com.example.util;
import java.sql.*;
import java.util.ResourceBundle;




public class ConnectionFactory {
	public static Connection getOracleConnection(){
		Connection Con=null;
		try {
		ResourceBundle labels=ResourceBundle.getBundle("application");
		Con=DriverManager.getConnection(labels.getString("datasource.oracle.url"),
				labels.getString("datasource.oracle.username"),
				labels.getString("datasource.oracle.password"));
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Con;
	}
	public static Connection getPostgresConnection(){
		Connection con=null;
		try {
		ResourceBundle labels=ResourceBundle.getBundle("application");
		con=DriverManager.getConnection(labels.getString("datasource.postgres.url"),
				labels.getString("datasource.postgres.username"),
				labels.getString("datasource.postgres.password"));
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}
