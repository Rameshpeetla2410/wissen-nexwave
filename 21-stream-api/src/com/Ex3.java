package com;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {

		Random random = new Random();

		// ----------------------------------------------------------
		 Stream<Integer> randoms = Stream.generate(random::nextInt);
		 randoms
		 .limit(10)
		 .peek(n->System.out.println("generated number :"+n))
		 .filter(n->n>0)
		 .peek(n->System.out.println("filtered number :"+n))
		 .forEach(System.out::println);
		// // ----------------------------------------------------------
		//
		 Stream<String> stars = Stream.iterate("*", s -> s + "*");
		 stars.forEach(System.out::println);
		// ---------------------------------------------------------------
		 
		 // all intermediate streams opreations are Lazy

		 Stream<Integer> integers=Stream.of(1,3,4,5,2,4,7,6);
		
		 integers
		 .peek(n->System.out.println("taken -> "+n))
		 .filter(n->n%2==0)
		 .peek(n->System.out.println("after filter -> "+n))
		 .limit(3)
		 .forEach(System.out::println);

		 //----------------------------------------------------------------
	}

}
