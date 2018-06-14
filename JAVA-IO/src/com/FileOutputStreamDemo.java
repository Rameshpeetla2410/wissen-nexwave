package com;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos=new FileOutputStream("src/abc.txt",true);
			
			String msg="Yes. It is..";
			
			byte data[]=msg.getBytes();
			
			/*for(byte d:data) {
				System.out.print(d);
			}*/
		
		
			fos.write(data);
			
			System.out.println(" --- Done ---");
			

			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
