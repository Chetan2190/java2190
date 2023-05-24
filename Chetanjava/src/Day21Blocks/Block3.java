package Day21Blocks;

public class Block3 {
	/* non-static block or IIB */
	{
		System.out.println("running non static block 1 of class block3");
	}
	public static void main(String[]args) {
		System.out.println("main() starts");
		Block3 b1= new Block3();
		System.out.println("***************");
		Block3 b2= new Block3();
		System.out.println("main() ends");
	}
}
