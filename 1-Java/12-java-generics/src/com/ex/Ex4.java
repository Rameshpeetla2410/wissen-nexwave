package com.ex;

interface NewSubject {
}

class NewJava implements NewSubject {
}

class NewJS implements NewSubject {
}

class NewTrainer<T extends NewSubject> {
	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Ex4 {

	public static void main(String[] args) {

		// NewTrainer<String> newTrainer = new NewTrainer<>();

	}
}
