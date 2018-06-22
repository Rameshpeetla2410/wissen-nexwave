package car;

import wheel.MRFWheel;

public class Car {

	private MRFWheel mrfWheel;

	public void setMrfWheel(MRFWheel mrfWheel) {
		this.mrfWheel = mrfWheel;
	}

	public void move() {
		this.mrfWheel.rotate();
		System.out.println("car moving..");
	}

}
