package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Source_Ex2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// 8-bit
		FileInputStream fis = new FileInputStream("hindi_content.txt");
		int uc = -1;
		while ((uc = fis.read()) != -1) {
			System.out.println(uc);
		}
		fis.close();

		System.out.println("-------------------------------------");

		// 16-bit
		FileReader fr = new FileReader("hindi_content.txt");
		uc = -1;
		while ((uc = fr.read()) != -1) {
			System.out.println(uc);
		}
		fr.close();

	}

}
