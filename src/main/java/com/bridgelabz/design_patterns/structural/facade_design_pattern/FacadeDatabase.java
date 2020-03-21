package com.bridgelabz.design_patterns.structural.facade_design_pattern;

import java.sql.SQLException;

public class FacadeDatabase {
	private ConnectDatabase database_connection;
	//Connecting to Database
	public FacadeDatabase() throws ClassNotFoundException {
		database_connection = new ConnectDatabase();
	}
	//initializing all the basic functions that're required to connect with MySQL
	public void init(String url, String username, String password, String query) throws SQLException {
		database_connection.createConnection(url, username, password);
		database_connection.createStatement();
		database_connection.createTable(query);
	}
	//Function to insert data into Database Table
	public int insertToTable(String sqlQuery) throws SQLException {
		return database_connection.insertIntoTable(sqlQuery);
	}
	//Function to read data from Database
	public void readFromDataBase(String query) {
		database_connection.readData(query);
	}

}
