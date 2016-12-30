package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDB {
	
	public static final String query = "Select * from test";
	public void queryDB() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName(ConnectionDB.Driver);
		Connection  connection = DriverManager.getConnection(ConnectionDB.JDBC_URL);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		ResultSetMetaData data = resultSet.getMetaData();
		int colCount = data.getColumnCount();
		System.out.println("Column count is:" + colCount);
		for(int i=1;i<=colCount;i++)
			System.out.format("%10s", data.getColumnName(i) + " | ");
		while (resultSet.next()) {
			System.out.println();
			for(int i=1;i<=colCount;i++){
				System.out.format("%10s",resultSet.getString(i) + " | ");
				
			}
		}
		
		if(connection!= null)
			connection.close();
		if(statement!= null)
			statement.close();
	}


}
