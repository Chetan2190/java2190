package Day19Constructor;

public class Cons6 {
	double i;
	Cons6 (double j) {
		System.out.println("Running Class C constructor..");
		i = j;
	}


	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		Cons6 b1 = new Cons6(25.34);
		System.out.println("Class C global varibale i = " + b1.i);//
		b1.i=14.65;
		System.out.println("Class C global varibale i = " + b1.i);//
		System.out.println("======================================");
		Cons6 b2 = new Cons6(55.32);
		System.out.println("Class C global varibale i = " + b2.i);// 
		System.out.println("Main() of Class Cons5 is ends here...");
	}



/**
what is the use of parameterized constructor?
with the help of parameterized constructor, for every instance we can initialize different value of non-static variables

*/

	}

}
