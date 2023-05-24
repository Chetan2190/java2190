package Day21Blocks;

public class Block8 {
	int age=55;
	double salary=4520.20;
	void print() {
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
	}
	public static void main(String[]args) {
		System.out.println("main  starts");
		Block8 b1 = new Block8();
		b1.print();
		System.out.println("main ends");
	}
	//non static block
	{
		print();
		age=25;
				salary=52030.20;
	}
}
