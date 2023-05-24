package Day21Blocks;

public class Block4 {
	Block4(){
		System.out.println("zero para cons.....");
	}
 // non static block
	{
		System.out.println("running non static block 1 of class 4");
		}
	public static void main(String[]args) {
		System.out.println("main() starts");
		Block4 b1= new Block4();
		System.out.println("************");
		Block4 b2= new Block4();
		System.out.println("main() ends");
	}
	//non static block
	{
		System.out.println("running non static block 2 of class 4");
	}
}
