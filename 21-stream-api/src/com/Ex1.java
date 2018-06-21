package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // ds
		
		// external iteration
		
		// way-1
//		for(Integer n:list)
//			System.out.println(n);
//		
		//way-2
//		Iterator<Integer> i=list.iterator();
//		while(i.hasNext())
//			System.out.println(i.next());
//		

		// internal iteration
		list.stream()
		.forEach(System.out::println);
		
		
	}
}
