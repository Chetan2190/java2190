package Day32system_scanner;

class training {
	training(){
		System.out.println("Training class cons");
	}
	void manualTesting() {
		System.out.println("I am from manual testing");
	}
	void automationTesting() {
		System.out.println("I am from automation testing");
	}
}

public class systemdemo2 {
	static training t1= new training(); //static reference
	public static void main (String[]args) {
		System.out.println("Program Starts");
		systemdemo2.t1.manualTesting();
		systemdemo2.t1.automationTesting();
		//classname.staticRefVar.method
		training t2= new training();
		t2.manualTesting();
		t2.automationTesting();
		System.out.println("Program ends");
		//classname.staticRefVar.method
		System.err.println("I am error from the class");

	}

}
