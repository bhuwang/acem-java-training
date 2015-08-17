package com.bhuwan.java.training.kiran.employeemanagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String USER_NAME = "root";
	private static final String PASSWORD = "mysqlkiran";
	private static final String MYSQL_DATABASE = "jdbc:mysql://localhost/java_training";
	
	public static Connection getMySqlConnection(){	
		Connection connection = null;
		try{
			connection = DriverManager.getConnection(MYSQL_DATABASE,USER_NAME,PASSWORD);	
		}catch(SQLException e) {
			System.err.println("Got an exception!");
		    System.err.println(e.getMessage());
		}
		return connection;
	}
}
