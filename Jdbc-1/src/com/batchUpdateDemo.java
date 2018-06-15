package com;

import java.sql.Connection;
import java.sql.Statement;

public class batchUpdateDemo {

	public static void main(String[] args) {

		try {

			Connection con = DBUtils.getConnection();
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();

			String q1 = "insert into employee values(6,'Xyz',200)";
			String q2 = "update employee set emp_name='updated' where emp_id=2";
			String q3 = "delete from employee where emp_id=6";

			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);

			boolean flag=true;
			int res[] = stmt.executeBatch();
			int count=0;
			for(int i=0;i<res.length;i++) {
				if(res[i]==0) {
					flag=false;
				}else {
					count++;
				}
			}
			
			if(flag) {
				con.commit();
			}else {
				con.rollback();
			}
			System.out.println(count+" statements executed");

		} catch (Exception e) {
			System.out.println("-- failed due to " + e);
		}

	}

}
