package car;

import wheel.Wheel;

public class NewCar {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void move() {
		this.wheel.rotate();
		System.out.println("car moving...");
	}

}
