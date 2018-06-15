package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLTest {

	public static void main(String[] args) {

		try {

			// load driver class for MySQL
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver class loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
			System.out.println("--- Connection Success");
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
