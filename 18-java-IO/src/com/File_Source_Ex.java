package com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Source_Ex {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("Notes.txt");

		// long start = System.nanoTime();
		//
		// FileInputStream fis = new FileInputStream(file); // 8-bit stream open
		// try (fis) {
		// int uc = -1;
		// while ((uc = fis.read()) != -1) {
		// System.out.print((char) uc);
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// long end=System.nanoTime();
		// System.out.println(end-start);
		//

		// long start = System.nanoTime();
		FileInputStream fis = new FileInputStream(file); // 8-bit stream open
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("Notes_backup.txt", true);
		try (fis; bis; fos) {
			int uc = -1;
			while ((uc = bis.read()) != -1) {
				// System.out.print((char) uc);
				fos.write(uc);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// long end = System.nanoTime();
		// System.out.println(end - start);

	}

}
