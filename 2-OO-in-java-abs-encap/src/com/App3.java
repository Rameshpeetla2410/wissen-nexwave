package com;

import car.Car;
import wheel.CEATWheel;
import wheel.MRFWheel;

public class App3 {

	public static void main(String[] args) {

		MRFWheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();

		Car car = new Car();
		car.setMrfWheel(mrfWheel);

		// -------------------------------------
		car.move();
		// -------------------------------------

	}

}
