package chapter08;
import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> FirstExample = new ArrayList<Integer>(); // Creates an ArrayList
		
		for(int i = 0; i < 5; i++) {
			FirstExample.add(i);		// Adds an element to the ArrayList
		}
		
		for(int x : FirstExample) {
			System.out.print(x + " ");
		}
		
//	System.out.println("The ArrayList has " + FirstExample.size() + " elements.");
//	System.out.println(FirstExample.get(2));		// Value is 2.
		
		System.out.print("\n");
		FirstExample.set(2, 27);						// Set index 2 to 27.
//	System.out.println(FirstExample.get(2));		// Now value is 27.
		
		for(int x: FirstExample) {		// For each loop
			System.out.print(x + " ");
		}
		
		System.out.print("\n");
		
		FirstExample.add(2, 5);
		for(int x: FirstExample) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		
// Remove Method:
		FirstExample.remove((Integer)27);		// .remove(2) - removes element at index 2
		
		for(int x: FirstExample) {
			System.out.print(x + " ");
		}
		System.out.println("\n" + FirstExample.contains(27));	// Returns a boolean value

		System.out.println(FirstExample.remove(FirstExample.indexOf(5)));	// Value is 2.
		System.out.println(FirstExample.contains(5));	// False
		//FirstExample.remove();
	
}
}
