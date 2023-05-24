package Day19Constructor;

public class Cons4 {
	int roll;
	double salary;
	Cons4(int r, double s){
	roll=r;
	salary=s;
	}
	void display() {
		System.out.println(roll+ " " + salary);
	}
	public static void main(String[]args) {
		Cons4 c1= new Cons4(101,202.20);
		c1.display();
		Cons4 c2= new Cons4(102,102.20);
		c2.display();
		Cons4 c3= new Cons4(0,104.50);
		c3.display();
		
	}

}
