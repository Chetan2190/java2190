package day9.variabletypes;

public class StaticGlobalVariableExample2 {
	//static global  variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables directly from here as mian() is also static
		System.out.println("default value of age is: "+age);
		System.out.println("default value of res is: "+res);
		System.out.println("default value of grade is: "+grade);
		System.out.println("default value of roi is: "+roi);
		System.out.println("**********************************");
		//initialization of static global variable
		age=25;
		res=false;
		grade='Z';
		roi=12.1f;
		System.out.println("updated value of age is: "+age);
		System.out.println("updated value of res is: "+res);
		System.out.println("updated value of grade is: "+grade);
		System.out.println("updated value of roi is: "+roi);
		System.out.println("Program ends");

		
		

	}

}
