package com;

import java.util.Arrays;
import java.util.List;

import com.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evens = Stream.filter(numbers, n -> n % 2 == 0);
		List<Integer> sqEvens = Stream.map(evens, n -> n * n);
		Stream.forEach(sqEvens, System.out::println);

	}
}
