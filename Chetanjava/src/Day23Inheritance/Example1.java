package Day23Inheritance;

class country{
	//defaulter constructor
	void display() {
		System.out.println("I am display method of country");
	}
}
class state extends country{
	//default constructor with default super()
	void calling() {
		System.out.println("I am calling method of state");
	}
}
public class Example1 {

  public static void main(String[]args) {
	  state b1=new state();
	  b1.display();
	  b1.calling();
  }
}
