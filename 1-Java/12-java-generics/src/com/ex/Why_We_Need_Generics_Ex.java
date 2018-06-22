package com.ex;

/*
 * 
 *  problems , without generics
 *  
 *  ==> obj's type-safety voilation can happen
 *  ==> type-cast issues
 *  
 *  soln:
 *  
 *  in JDK 1.5 ,
 *  
 *      => generic-types
 * 
 */

class Java {
}

class JS {
}

class Trainer<T> {
	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Why_We_Need_Generics_Ex {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<>();
		javaTrainer.setSubject(new Java());

		// ------------------------------------
		// javaTrainer.setSubject(new JS()); // type-safety voilation
		// ------------------------------------

		// in java-class-room
		// Object object = javaTrainer.getSubject();
		// Java java = (Java) object;

		Java java = javaTrainer.getSubject();
		System.out.println("Happy Learning in java-class-room");

		// ---------------------------------------------------------
	}

}
