package week1.day2Assignment;

public class CarClass {

	/*
	 * Assignment2: 1. Create a Car class 2. create methods for this class example:
	 * applyBreak() applyGear() switchOnAc() applyAcclerate() create object and
	 * execute for same class create new class as MyCar class and create object for
	 * existing class and execute
	 */

	public static void main(String[] args) {
		CarClass VW = new CarClass();
		VW.applyAcclerate();
		VW.applyBreak();
		VW.applyGear();
		VW.switchOnAc();
	}

	public void applyBreak() {
		System.out.println("Break is applied");
	}

	public void applyGear() {
		System.out.println("Gear selected is applied");
	}

	public void switchOnAc() {
		System.out.println("Ac turned ON, Enjoy !!!");
	}

	public void applyAcclerate() {
		System.out.println("Accelarating at high speed ! Drive safe !!");
	}
}
