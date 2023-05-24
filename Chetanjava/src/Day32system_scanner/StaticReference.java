package Day32system_scanner;

class Demo {
	void display() {
		System.out.println("Demo class display method");
	}
	void callme(int num) {
		System.out.println("Demo class callme method");
	}
	Demo() {
		System.out.println("Demo class cons");
	}
}
public final class StaticReference {
	
	static Demo d1= new Demo();
	static int age=25;
	public static void main(String[] args) {
		// access Demo class non-static member
		Demo d2=new Demo();
		d2.display();
		d2.callme(123);
		
		//classname.staticref.method
				System.out.println(StaticReference.age);
				StaticReference.d1.callme(123);
				StaticReference.d1.display();
				
				System.err.println("I am the error msg");
				


	}

}
