package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleTest {

	public static void main(String[] args) {

		try {

			// load driver class for oracle
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("-- Driver class loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//System.out.println("--- Connection Success");
			
			Statement stmt=con.createStatement();
			
			String qry="insert into employee values(2,'Bucky',18000)";
			
			int x=stmt.executeUpdate(qry);
			
			System.out.println(x+" Record(s) inserted");
			
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
