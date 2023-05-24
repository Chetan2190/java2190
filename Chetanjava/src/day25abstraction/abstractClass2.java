package day25abstraction;

abstract class shape{
	abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends shape {
	protected void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle1 extends shape{
	public void draw() {
		System.out.println("drwaing circle");
	}
}
//In real scenario, method is called by programmer or user
class abstractClass2{
	public static void main(String[]args) {
		shape s =new Circle1();
		s.draw();
		shape s1=new Rectangle();
		s1.draw();
		
	}
}