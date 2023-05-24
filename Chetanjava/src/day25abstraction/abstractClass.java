package day25abstraction;

abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() {
		System.out.println("zzz");
	}
}
//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("the pig says :wee wee");
	}
}
//Subclass (inherit from Animal)
class Dog extends Animal{
	public void animalSound( ) {
		// The body of animalSound() is provided here
		System.out.println("The dog says :bow bow");
	}
}
class abstractClass {
	public static void main(String[]args) {
		Pig p1=new Pig();// Create a Pig object
		p1.animalSound();
		p1.sleep();
		Dog d1=new Dog();
		d1.animalSound();
		d1.sleep();
	}
}


