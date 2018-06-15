package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class OraclePreparedUpdate {

	public static void main(String[] args) {

		try {

			// load driver class for oracle
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("-- Driver class loaded");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// System.out.println("--- Connection Success");

			Connection con=DBUtils.getConnection();
			String q1 = "update employee set emp_name=?,emp_salary=? where emp_id=?";
			PreparedStatement ps = con.prepareStatement(q1);
			
			ps.setString(1, "Prashanth");
			ps.setDouble(2, 1200);
			ps.setInt(3, 2);
		
			int x = ps.executeUpdate();


			System.out.println(x+ " Record(s) Updated");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
