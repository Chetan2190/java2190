package Day13Methodswitch;

public class SwitchCase1 {

	public static void main(String[] args) {
		int value=8;
		switch (value) {
		case 3:
			System.out.println("Congratulation her is case 3 executed");
			break;
		case 4 :
			System.out.println("Congratulation her is case 4 executed");
			break;
		case 8:
			System.out.println("Congratulation her is the case 8 to be executed");
			break;
		default:
			System.out.println("Sorry non of the case matched");
			break;
			
		}
		
	}

}
/**
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 
