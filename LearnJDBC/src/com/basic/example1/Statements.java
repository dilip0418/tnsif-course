package com.basic.example1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {

	public static void getAllEmps(Statement stm) {
		String selectAll = "SELECT * FROM TEST.EMPLOYEE";
		try {
			ResultSet rs = stm.executeQuery(selectAll);
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addEmp(Statement st, Employee e) {
		String insertEmp = "INSERT INTO TEST.EMPLOYEE(id, name, salary) VALUES(" + e.getId() + ", '" + e.getName()
				+ "', " + e.getSalary() + ")";

		try {
			st.executeUpdate(insertEmp);
			System.out.println("Employee added succesfully!!!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
	}

	public static void addEmpUsingPrepStmt(Connection conn, PreparedStatement pst, Employee e) {
//		String insertEmp = "INSERT INTO TEST.EMPLOYEE(id, name, salary) values(?, ?, ?)";
		 String insertEmp= "INSERT INTO test.Employee (id, name, salary) VALUES(?, ?, ?);";
		try {
			pst = conn.prepareStatement(insertEmp);
			pst.setInt(1, e.getId());
			pst.setString(2, e.getName());
			pst.setDouble(3, e.getSalary());
			pst.execute();
			System.out.println("Employee added succesfully!!!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
	}

}
