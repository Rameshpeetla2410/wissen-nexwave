package com;

import java.util.concurrent.TimeUnit;

// from JDK 1.5

//----------------------------------------------------
enum Gender {
	MALE, FEMALE
}

class Employee {
	int id;
	String name;
	Gender gender;
}

// ----------------------------------------------------

interface Dir {
	void move();
}

enum Directions implements Dir {

	NORTH(10) {
		@Override
		public void displayDirection() {
			System.out.println("towards NORTH");
		}

		@Override
		public String toString() {
			return "UTHRA";
		}

		@Override
		public void move() {
			System.out.println("go towards delhi..");
		}
	},
	SOUTH(20) {
		@Override
		public void displayDirection() {
			System.out.println("towards SOUTH");
		}

		@Override
		public void move() {
			System.out.println("go towards chennai..");
		}
	},
	EAST(30) {
		@Override
		public void displayDirection() {
			System.out.println("towards EAST");
		}

		@Override
		public void move() {
			System.out.println("go towards kolkotta..");
		}
	},
	WEST(40) {
		@Override
		public void displayDirection() {
			System.out.println("towards WEST");
		}

		@Override
		public void move() {
			System.out.println("go towards mumbai..");
		}
	};

	private int value; // instance-var

	private Directions(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public abstract void displayDirection();

}

public class Ex {
	public static void main(String[] args) {

		// ---------------------------------
		Employee employee = new Employee();
		employee.id = 123;
		employee.name = "Abc";
		employee.gender = Gender.MALE;
		// ---------------------------------

		System.out.println(Directions.NORTH.ordinal());
		System.out.println(Directions.NORTH.getValue());
		
		//----------------------------------------------
		
		
		for(Directions direction:Directions.values()) {
			System.out.println(direction);
		}
		
		//------------------------------------------------
		Directions key=Directions.NORTH;
		switch (key) {
		case NORTH:
			
			break;

		default:
			break;
		}
		
	}
}
