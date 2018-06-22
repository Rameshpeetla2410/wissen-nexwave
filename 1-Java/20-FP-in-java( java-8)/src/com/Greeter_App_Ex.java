package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Greeting {
	void greet();
}

class EnglishGreeting implements Greeting {
	@Override
	public void greet() {
		System.out.println("Hello..");
	}
}

class KannadaGreeting implements Greeting {
	@Override
	public void greet() {
		System.out.println("Namaskara..");
	}
}

public class Greeter_App_Ex {
	// main greet behav
	public static void greet(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {

		// --------------------------------------------
		// OO style
		greet(new EnglishGreeting());
		greet(new KannadaGreeting());
		greet(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Ola...");
			}
		});

		// -----------------------------------------------

		// FP style

		Greeting hindiGreeting = () -> {
			System.out.println("Namasthe...");
		};

		/*
		 * .js-lang
		 * 
		 * function hinndiGreeting(){ console.log('Namasthe'); }
		 * 
		 */

		// hindiGreeting.greet();
		greet(hindiGreeting);

		// ----------------------------------------------

		
	}
}
