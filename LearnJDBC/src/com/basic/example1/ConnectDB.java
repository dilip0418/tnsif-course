package com.basic.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	private static final String DBUrl = "jdbc:mysql://localhost:3306/test";
	private static final String DBUser = "root";
	private static final String DBPassword= "#3BR19cs044";
	 
	
	public static Connection connectDB() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(DBUrl,DBUser,DBPassword);
			System.out.println("DB connection Successful!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return conn;
		
	}
	
	
}
