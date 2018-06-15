package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class OraclePrepared {

	public static void main(String[] args) {

		try {

			// load driver class for oracle
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("-- Driver class loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// System.out.println("--- Connection Success");

			String q1 = "insert into employee values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q1);

			ps.setDouble(3, 63654);
			ps.setInt(1, 3);
			ps.setString(2, "James");

			int x = ps.executeUpdate();


			System.out.println(x + " Record(s) inserted");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
