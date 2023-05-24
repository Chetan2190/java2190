package Day21Blocks;

public class Block7 {
	final static int age;// using sib we can initialze final static global variable
	final double salary;
	//static block
	static {
		age=30;
	}
	//non static block
	{
		salary=45200.20;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + Block7.age);
		System.out.println("---------------------------------");
		Block7 b1 = new Block7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");

}}
