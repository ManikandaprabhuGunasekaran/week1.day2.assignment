package week1.day2Assignment;

public class TwoWheelerClass2 {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 654984414645l;
	boolean isPunctured = false;
	String bikeName = "Harley Davidson";
	double runningKM = 1524545;

	public static void main(String[] args) {
		
		//non Static variable cant be accessed inside a static member function(here main is a static method )
		//if you remove static from main and try accessing global variables , it will work

		TwoWheelerClass2 TWC = new TwoWheelerClass2();		
		System.out.println(TWC.noOfWheels);
		System.out.println(TWC.noOfMirrors);			
		System.out.println(TWC.chassisNumber);	
		System.out.println(TWC.isPunctured);
		System.out.println(TWC.bikeName);
		System.out.println(TWC.runningKM);

	}
}
