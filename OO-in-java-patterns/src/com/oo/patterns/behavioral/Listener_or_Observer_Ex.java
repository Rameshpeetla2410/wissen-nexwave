package com.oo.patterns.behavioral;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class DoorEvent {
	private int floorNum;
	private int doorNum;

	public DoorEvent(int floorNum, int doorNum) {
		super();
		this.floorNum = floorNum;
		this.doorNum = doorNum;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public int getDoorNum() {
		return doorNum;
	}

}

interface DoorListener {
	void start(DoorEvent event);

	void stop(DoorEvent event);
}

class Door {
	private final ArrayList<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener listener) {
		this.doorListeners.add(listener);
	}

	public void removeListener(DoorListener listener) {
		this.doorListeners.remove(listener);
	}

	public void open() {
		System.out.println("door opened...");
		DoorEvent event = new DoorEvent(4, 5);
		for (DoorListener listener : doorListeners)
			listener.start(event);
	}

	public void close() {
		System.out.println("door closed");
		DoorEvent event = new DoorEvent(4, 5);
		for (DoorListener listener : doorListeners)
			listener.stop(event);
	}
}

// -------------------------------------------------------------

class Light implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("Light ON >>> " + event.getFloorNum() + " : " + event.getDoorNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("Light OFF >> " + event.getFloorNum() + " : " + event.getDoorNum());
	}

}

class AC implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("AC ON >>> " + event.getFloorNum() + " : " + event.getDoorNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("AC OFF >> " + event.getFloorNum() + " : " + event.getDoorNum());
	}

}

// ------------------------------------------------------------

public class Listener_or_Observer_Ex {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		Light light1 = new Light();
		Light light2 = new Light();

		AC ac = new AC();
 
		door.addDoorListener(light1);
		door.addDoorListener(light2);
		door.addDoorListener(ac);
		TimeUnit.SECONDS.sleep(5);
		door.open();
		TimeUnit.SECONDS.sleep(5);
		door.close();
		door.removeListener(ac);
		TimeUnit.SECONDS.sleep(5);
		door.open();
		TimeUnit.SECONDS.sleep(5);
		door.close();

	}

}
