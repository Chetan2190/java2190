package Day26Package;

public class defaultmembers {
	int accNum=12345;
	void displayAccNum() {
		System.out.println("Account number " + accNum);
	
	}
	public static void main (String[]args) {
		defaultmembers d1= new defaultmembers();
		System.out.println(d1.accNum);
		d1.displayAccNum();
	}
}
class AccessDefaultMembers {
	public static void main (String[]args) {
		defaultmembers p1=new defaultmembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
default members are accessible with in package 
*/

