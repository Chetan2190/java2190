package Day19Constructor;

public class Cons3 {
	
	int age;
	double salary;
	/**
	 *  below is default constructor, that will be written by java compiler at compile time
	  Cons2(){
			//empty body
		}
	*/
	static public void main(String[] args) {
		Cons3 c1= new Cons3();
		System.out.println(c1.age);
		System.out.println(c1.salary);
		
		
	}

}
