// Import the Arraylist class to use dynamic arrays
// Used with non-primitive types

import java.util.ArrayList;


public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// Create a reference to a ArrayList of strings
		// and allocated memory for the arrays
		ArrayList<String> slist = new ArrayList<String>();
		
		// Adding the string "Hello" to the arrayList
		slist.add("Hello");
		
		// Add the string "world" to the arrayList
		slist.add("world");
		
		// Add the string ! to the arrayList
		slist.add("!");
		
		// print the current size of the array
		System.out.println( slist.size() );
		
		// Retrieve the object in position 0 of arrayList
		// print to screen
		String s;
		s = slist.get(0);
		System.out.println(s);
		
		// Create a reference ot an Arraylist of MyPoint objects
		// and allocate memory for the array
		ArrayList<MyPoint> plist = new ArrayList<MyPoint>();
		
		// Create a MyPoint object and place inside an Arraylist
		MyPoint p1 = new MyPoint();
		p1.x = -1.0;
		p1.y = -2.0;
		
		plist.add(p1);
		
		MyPoint p2 = new MyPoint();
		p2.x = -3.0;
		p2.y = -4.0;
		
		plist.add(p2);
		
		System.out.println( plist.size() );
		
		// Retrieve the last point's y-coordinate and display
		// Display this object's y-coordinate on the screen
		
		// Create a variable to reference a MyPoint object
		MyPoint r;
		r = plist.get(plist.size()-1);
		
		// Display this object y-coordinate
		System.out.println(r.y);
		
	
	}
}