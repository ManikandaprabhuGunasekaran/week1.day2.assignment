package week1.day2Assignment;

public class Assignment3_EmployeeDetails {

	/*
	 * Assignment3: Create a new class as EmployeeDetails with methods as below
	 * printEmployeeName(String empName, int empId) -> print the empName & empId
	 * getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
	 * printEmployeeSalary(double empSalary) -> print the empSalary
	 * printEmployeeMobileNumber(long mobNum) -> print the phoneNumber Call all the
	 * methods from main() and execute
	 * 
	 */

	public static void main(String[] args) {
		Assignment3_EmployeeDetails ED = new Assignment3_EmployeeDetails();
		ED.printEmployeeMobileNumber(9887454232l);

		ED.printEmployeeName("Mani", 15875);

		ED.printEmployeeSalary(155555);

		ED.getEmployeeAddress("12 wilmot rd, deerfield , il");

	}

	public void printEmployeeName(String empName, int empId) {
		System.out.println(empName + "," + empId);
	}

	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}

	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}

	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}
}
