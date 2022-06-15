package week1.day2Assignment;

public class TwoWheelerClass {

	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;

	public static void main(String[] args) {

		TwoWheelerClass TWC = new TwoWheelerClass();
		TWC.bikeName = "Yamaha R15";
		TWC.isPunctured = true;
		TWC.chassisNumber = 646464646l;
		TWC.noOfMirrors = 2;
		TWC.noOfWheels = 2;
		TWC.runningKM = 75000;

		
		System.out.println(TWC.noOfWheels);
		System.out.println(TWC.noOfMirrors);			
		System.out.println(TWC.chassisNumber);	
		System.out.println(TWC.isPunctured);
		System.out.println(TWC.bikeName);
		System.out.println(TWC.runningKM);

	}
}
