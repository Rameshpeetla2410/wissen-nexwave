package com;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		try {
			
			
			File fileLoc=new File("src/abc.txt");
			
			if(!(fileLoc.exists())) {				
				System.exit(0);
			}
			
			fis=new FileInputStream(fileLoc);
			
			System.out.println(fileLoc.length());
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}
			
			
			
		//	Object
	
			
	
	
			
			
			
		//	System.out.println(" --- Done ---");

			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		

	}

}
