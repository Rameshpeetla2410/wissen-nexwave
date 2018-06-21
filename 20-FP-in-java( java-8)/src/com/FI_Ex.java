package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FI_Ex {

	public static void main(String[] args) {

		// --------------------------------------------------------
		Supplier<String> supplier = () -> "biryani";
		Consumer<String> consumer = s -> System.out.println(s);
		UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
		BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
		Function<String, Integer> function = s -> s.length();
		Predicate<String> predicate = s -> s.isEmpty();
		// --------------------------------------------------------

		// UnaryOperator<T>

		// ------------------------------------

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");

		list.replaceAll(ele -> ele.toLowerCase());
		// System.out.println(list);

		// --------------------------------------------------------

		// BinaryOperator
		List<Integer> integers = Arrays.asList();

		Optional<Integer> optional = integers.stream().reduce((n, acc) -> {
			System.out.println(n + " " + acc);
			return n + acc;
		});

		System.out.println(optional.orElse(0));

		// --------------------------------------------------------

		Supplier<Integer> supplier2 = () -> {
			return 123;
		};

		int i = supplier2.get();

		// ------------------------------------------------------

		IntSupplier intSupplier = () -> 123;
		int ii = intSupplier.getAsInt();

		// ------------------------------------------------------

		Function<String, Integer> function2 = s -> s.length();
		ToIntFunction<String> function3 = s -> s.length();

		// ------------------------------------------------------
	}

}
