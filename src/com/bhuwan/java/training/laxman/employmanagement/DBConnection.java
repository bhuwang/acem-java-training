package com.bhuwan.java.training.laxman.employmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection connect = null;
	private static final String username = "root";
	private static final String password = "charpala56";
	private static final String url = "jdbc:mysql://localhost/";
	private static final String dbName = "java_training";
	private static final String driver = "com.mysql.jdbc.Driver";

	public static Connection mysqlDbConnect() throws Exception {
		try {
			// this will load the mysql driver, each db has its own driver
			Class.forName(driver).newInstance();

			connect = DriverManager.getConnection(url + dbName, username, password);

		} catch (Exception e) {
			// handling the error
			e.printStackTrace();

		}
		return connect;

	}

}
