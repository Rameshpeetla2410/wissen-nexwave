package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBUtils {

	private static Connection con = null;

	static Properties props=new Properties();
	static FileInputStream fis=null;
	public static Connection getConnection() {
		
	
		try {
			
			fis=new FileInputStream("db/db.properties");
			props.load(fis);
			

			if (con == null)
				con = DriverManager.getConnection(props.getProperty("db.url"),props.getProperty("db.user"),props.getProperty("db.password"));
		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}

		return con;
	}
	
	// close connection
	public static void closeConnection() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
