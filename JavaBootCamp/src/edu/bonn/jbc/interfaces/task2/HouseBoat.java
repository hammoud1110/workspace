package edu.bonn.jbc.interfaces.task2;

public class HouseBoat implements House, Boat {
	
	private boolean tethered;
	private boolean motorized;
	private boolean doorOpen;
	private boolean windowOpen;
	
	public HouseBoat(boolean motorized) {
		this.motorized = motorized;
	}

	@Override
	public boolean isTethered() {
		return tethered;
	}

	@Override
	public boolean isMotorized() {
		return motorized;
	}

	@Override
	public void openWindow() {
		if (windowOpen) {
			System.err.println("The window is already open!");
		} else {
			System.out.println("Opening the window..");
			windowOpen = true;
		}
	}

	@Override
	public void closeWindow() {
		if (windowOpen) {
			System.out.println("Closing the window..");
			windowOpen = false;
		} else {
			System.err.println("The window is already closed!");
		}
	}

	@Override
	public void openDoor() {
		if (doorOpen) {
			System.err.println("The door is already open!");
		} else {
			System.out.println("Opening the door..");
			doorOpen = true;
			if (!tethered) {
				System.err.println("Whoever goes out, falls into the water.");
			}
		}
	}

	@Override
	public void closeDoor() {
		if (doorOpen) {
			System.out.println("Closing the door..");
			doorOpen = false;
		} else {
			System.err.println("The door is already closed!");
		}
	}

	@Override
	public void tether() {
		this.tethered = true;
	}

}
