package com.bhuwan.java.training.kiran.employeemanagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author kiran
 *
 */
public class DBConnection {

	private static final String USER_NAME = "root";
	private static final String PASSWORD = "mysqlkiran";
	private static final String MYSQL_DATABASE = "jdbc:mysql://localhost/java_training";
	
	/**
	 * This method is responsible for getting MySql Database connection.
	 * 
	 * @author kiran
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getMySqlConnection() throws SQLException{	
		Connection connection = null;
		connection = DriverManager.getConnection(MYSQL_DATABASE,USER_NAME,PASSWORD);	
		return connection;
	}
}
