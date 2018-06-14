package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDataDemo {

	public static void main(String[] args) {
		
		try {
			
			InputStreamReader isr=new InputStreamReader(System.in);
			
			
			
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Enter age: ");
			int age=Integer.parseInt(br.readLine());
			System.out.println("Input String: ");
			String s1=br.readLine();
			
			System.out.println(age);
			System.out.println("String: "+s1);
			/*
			System.out.println("Enter a Character:");
			char ch=(char)br.read();
			System.out.println("Ch: "+ch);
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
