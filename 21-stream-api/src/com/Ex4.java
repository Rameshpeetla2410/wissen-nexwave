package com;

import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {

		String[] menu = { 
				"idly,vada,poori",
				"chapathi,roti,dosa",
				"dosa","roti"
				};

		
		Stream<String> menuStream=Stream.of(menu); // Unit operation  M<T>
		menuStream.flatMap(m->Stream.of(m.split(","))) // bind operation : M<T> -> T:f  -> M<R>  
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}

}
