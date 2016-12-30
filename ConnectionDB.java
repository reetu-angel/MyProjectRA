package com.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ConnectionDB {
	public static final String Driver = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL = "jdbc:derby:C:\\JSP & Servelets\\testDB;create=true";
	public static int count =1;
	public void getConnection(String fname, String lname, String age, String inDate, String outDate,String inTime, String outTime, String idProof, String idProofValue) throws ClassNotFoundException, SQLException{
		Class.forName(Driver);
		Connection  connection = DriverManager.getConnection(JDBC_URL);
		DatabaseMetaData data = connection.getMetaData();
		ResultSet set = data.getTables(null, null, "DETAILS", null) ;
		if(set.next()){
//			connection.createStatement().execute("insert into test values(" +
//												count + "," + "'" + fname + "'," + "'" + fname + "')" );
			connection.createStatement().execute("insert into details values(" +
					 count + "," + "'" + fname + "'," + "'" + lname +  "'," + 
					 "'" + age + "'," + "'" + inDate + "'," + "'" + outDate + "','" + inTime + "','" +outTime + "','" + idProof + "'," +
					 "'" + idProofValue + "')" );
			count++;
			System.out.println("The current row is :" + count);
		}
	
		else{
			//connection.createStatement().execute("create table test(id int, fname varchar(10),lname varchar(20))");
			connection.createStatement().execute("create table details(id int, fname varchar(10),lname varchar(20),"
												+ "age varchar(10), inDate varchar(20) , outDate varchar(20), inTime varchar(20),"
												+ "outTime varchar(20), idProof varchar(20), idProofValue varchar(20))");
			connection.createStatement().execute("insert into details values(" +
					 count + "," + "'" + fname + "'," + "'" + lname +  "'," + 
					 "'" + age + "'," + "'" + inDate + "'," + "'" + outDate + "','" + inTime + "','" +outTime + "','" + idProof + "'," +
					 "'" + idProofValue + "')" );
			count++;
			System.out.println("The current row is :" + count);
		}
		System.out.println("Table created and records inserted successfully");
		
		if(connection!= null)
			connection.close();
		
	}

}
