package day38Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample0 {

	public static void main(String[] args) {
			List l1=new ArrayList();
			l1.add("mango");
			l1.add(1234);
			l1.add("Banana");
			l1.add(null);	
			l1.add('C');// first boxing for char to Character class object---> upcasting to object class
			l1.add(15.26);// first boxing for double to Double class object---> upcasting to object class
			l1.add(true);// first boxing for boolean to Boolean class object---> upcasting to object class
			l1.add(new ArrayListExample0());// ArrayListExample0 class object will be upcasted to Object class object
			l1.add("Banana");//duplicate 
			// Printing the arraylist object
			System.out.println("size of list " +l1.size());
			System.out.println("elements of list " + l1);
			System.out.println("Traversing list through for loop:");
			for (int i = 0; i < l1.size(); i++) {
				System.out.println(l1.get(i));
			for (int m = 0; m< l1.size(); m++) {
				System.out.println(l1.get(m));
			}
			// accessing the element 
			System.out.println("Returning element: " + l1.get(1));// it will return the 2nd element, because index starts from 0
			// changing/update existing object
			l1.set(1, "Dates");
			System.out.println("size of list: " + l1.size());
			System.out.println("Elements of list: " + l1);
		}

			}}


