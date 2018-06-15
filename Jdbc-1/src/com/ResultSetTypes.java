package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetTypes {

	public static void main(String[] args) {

		Connection con;

		try {
			con = DBUtils.getConnection();
			String qry = "select * from employee";
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery(qry);

			rs.absolute(1);
			//rs.updateFloat(3, 2500);
			//rs.updateRow();
			
			//if (rs.next()) {
				System.out.println("Employee Id: " + rs.getString("emp_id"));
				System.out.println("Name: " + rs.getString("emp_name"));
				System.out.println("Salary: " + rs.getString("emp_salary"));
				System.out.println("------------------------------------");
			//}

			
			
				
				
		} catch (Exception e) {
			System.out.println("failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}
}
