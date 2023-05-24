package Day21Blocks;

public class Block5 {
//static block
	static {
		System.out.println("running static block 1 of class block 5");
	}
	{
		System.out.println("running non static block of class block5");
	}
	public static void main(String[]args) {
		System.out.println("main() starts");
		Block5 b1= new Block5();
		System.out.println("*********");
		Block5 b2= new Block5();
		System.out.println("main() ends");
	}
}
