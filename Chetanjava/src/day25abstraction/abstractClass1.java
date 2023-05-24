package day25abstraction;

abstract class Bike1 {
	abstract void run();
	void speed(int speed) {
		System.out.println("Bike speed " +speed);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("Running safely");
	}
	void speed (int speed) {
		System.out.println("Hond 4 speed" + speed);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");

}
class abstractClass1{
	public static void main(String[]args) {
		Honda4 obj =new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		//Bike1 b1=new Bike1(); //we cann't create an object of abstract class as it is incomplete class
		Bike1 b2= new Honda4();
		b2.run();
		b2.speed(20);
		}
}}
/*
classname ref;

new classname();

*/


