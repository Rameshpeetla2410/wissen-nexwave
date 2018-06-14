package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			
			File fileLoc=new File("src/xyz.txt");
			
			
			FileReader fr=new FileReader(fileLoc);
			
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fr.read());
			}
			
			
			
			
			
			
			
			
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
