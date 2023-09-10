package com.basic.example1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = ConnectDB.connectDB();
		Statement stm = null;
		PreparedStatement pst = null;
		try {
			stm = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		if (conn != null) {
			System.out.println("Hello User");
			Statements.getAllEmps(stm);
			
			//using Statement interface
			//Statements.addEmp(stm, new Employee(4,"Atharva",750000.0));
			
			//using PreparedStatement interface
			//Statements.addEmpUsingPrepStmt(conn, pst, new Employee(5, "Arjun", 800000.0));
			
		}
	}
}
