package com;

import car.NewCar;
import wheel.CEATWheel;
import wheel.MRFWheel;

public class App4 {

	public static void main(String[] args) {

		NewCar newCar = new NewCar();
		newCar.setWheel(new MRFWheel());

		newCar.move();

		newCar.setWheel(new CEATWheel());

		newCar.move();

	}

}
