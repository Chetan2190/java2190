package day9.variabletypes;

public class StaticGlobalVariableExample4 {
	//static global  variables
	static int age=25;
	static boolean res;
	static char grade;
	static float roi;
	public static void main(String[] args) {
	System.out.println("Program Starts");
	//we can access static global variables using classname from here as main() is also static
	System.out.println("Value of age is " +StaticGlobalVariableExample4.age);
	System.out.println("Value of res is " +StaticGlobalVariableExample4.res);
	System.out.println("Value of grade is " +StaticGlobalVariableExample4.grade);
	System.out.println("Value of roi is " +StaticGlobalVariableExample4.roi);
	System.out.println("*************************");
	//initialization of static global variable
	age=35;
	res=true;
	grade='J';
	roi=1.5f;
	System.out.println("updated value of age is: "+StaticGlobalVariableExample4.age);
	System.out.println("updated value of res is: "+StaticGlobalVariableExample4.res);
	System.out.println("updated value of grade is: "+StaticGlobalVariableExample4.grade);
	System.out.println("updated value of roi is: "+StaticGlobalVariableExample4.roi);
	System.out.println("Program ends");

}

}
