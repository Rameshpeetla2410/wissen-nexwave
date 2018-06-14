package com;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw=new FileWriter("src/xyz.txt");
			
			String msg="Good Morning..";
			
			fw.write(msg);
			
			System.out.println("---- Done ---");
			
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
