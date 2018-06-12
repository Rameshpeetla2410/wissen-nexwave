package com.hashcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class NewCar {
	String model;
	String color;

	public NewCar(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
}

public class Quiz {

	public static void main(String[] args) {

		// ------------------------------------------
		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		NewCar car1 = new NewCar("Fortuner", "white");
		NewCar car2 = new NewCar("Toy-BENZ", "red");

		Map<Owner, NewCar> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// ------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Owner Name?");
		String name = scanner.nextLine();

		Owner keyOwner = new Owner(name);
		NewCar car = map.get(keyOwner);
		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream it");
		}
		scanner.close();
		// ------------------------------------------

	}

}
