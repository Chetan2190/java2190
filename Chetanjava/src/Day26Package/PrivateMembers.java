package Day26Package;

public class PrivateMembers {
	
	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account number " + accNum);
	}
	public static void main (String[]args) {
		PrivateMembers p1= new PrivateMembers();
		System.out.println(p1.accNum);
	
	}
	class AccessPrivateMembers2 {
		public static void main(String[] args) {
			
			PrivateMembers p1=new PrivateMembers();
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}
	}
	/**
	 * private member are accessible with in class only
	 */

	}
