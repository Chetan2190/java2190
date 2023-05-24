package day25abstraction;

interface Printable{
	int age=30;//by default public static final
	void print();
}
interface showable {
	public void show();
}
public class interface3 implements Printable,showable {
	public static int age=45;
	public void print() {
		System.out.println("Hello Print");
	}
	public void show() {
		System.out.println("welcome show");
	}
	public static void main (String[]args) {
		interface3 obj= new interface3();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
		System.out.println(interface3.age);
		}
	}
