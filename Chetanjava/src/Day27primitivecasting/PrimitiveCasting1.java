package Day27primitivecasting;

public class PrimitiveCasting1 {
	public static void main(String[]args) {
		int myInt=9;
		//widening implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		double myDouble= myInt;
		
		double d=(double)myInt;//explicit widening
		System.out.println(myInt);//
		System.out.println(myDouble);//
		System.out.println(d);//
		
		double salary=23400.6785685689d;
		int salary=(int)salary;//narrowing explicit
		long sal=(long)salary;
		float f1=(float)salary;
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);
	}

	}


