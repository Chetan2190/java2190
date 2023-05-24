package variable;

public class Day10 {

	static int empId=10;
	double salary;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=25;
		System.out.println("Local variable age :"+age);
		age=40;
		System.out.println("Updated local variable age :"+age);
		
		System.out.println("Static Golbal Variable empId :"+Day10.empId);
		Day10.empId=30;	
				System.out.println("Updated Static Global variable empId :"+Day10.empId);
		System.out.println("Program Ends");

	}

}
