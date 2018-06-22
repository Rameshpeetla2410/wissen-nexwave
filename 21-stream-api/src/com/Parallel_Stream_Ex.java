package com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parallel_Stream_Ex {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		intStream
		//.parallel()
		.forEach(n -> {
			System.out.println(Thread.currentThread().getName() + "->" + n);
		});

	}

}
