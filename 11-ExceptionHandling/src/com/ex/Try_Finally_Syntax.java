package com.ex;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// obj who communicate with external world
class Resource implements Closeable{
	public void init() {
		System.out.println("init()");
	}

	public void use() {
		System.out.println("using()");
		int v = 10;
		if (v == 100)
			throw new RuntimeException();
		System.out.println("used()");

	}

	public void close() {
		System.out.println("close()");
	}
}

public class Try_Finally_Syntax {

	public static void main(String[] args) {
//		Resource resource = new Resource();
//		try {
//			resource.init();
//			resource.use();
//			return;
//			// resource.close();
//		} catch (RuntimeException e) {
//			System.out.println("Handling Ex while using Resource");
//			// resource.close();
//		} finally {
//			resource.close();
//		}
//		System.out.println("ends..");
//		
		//----------------------------------------
//		try {
//			
//		}finally {
//			
//		}
		
		//----------------------------------------
		
		
//		jdk 1.7  ==> try with closable resource

//		try(Resource resource=new Resource();FileReader fr=new FileReader("")) {
//			resource.init();
//			resource.use();
//		}catch (RuntimeException e) {
//			System.out.println("Handling Ex while using Resource");
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		

		//----------------------------------------
		
		// JDK 1.10
		Resource resource=new Resource();
		try(resource) {
			resource.init();
			resource.use();
		}catch (RuntimeException e) {
			System.out.println("Handling Ex while using Resource");
		} 

	}

}
