import java.util.*;
/*
 *  Jehron Petty - December 2016 - LuHi AP Computer Science
 *  
 *  The purpose of this assignment is to familiarize students with ArrayLists
 *  and te benefits of using them over arrays. 
 *  
 */


public class ArrayLists_AK {

	private static Scanner scan;

	public static void main(String[] args) {
	
		//Create a new ArrayList of Strings
		List<String> temp = new ArrayList<String>();
		//Print the ArrayList
		System.out.println(temp);
		//Add your first, middle, and last name to the ArrayList
		temp.add("Jehron");
		temp.add("Warren");
		temp.add("Petty");
		//Print the modified ArrayList and its size
		System.out.println(temp);
		System.out.println("size " + temp.size());
		//Print your first and last name by getting the respective strings from the ArrayList
		System.out.println(temp.get(0) + " " + temp.get(2));
		//Remove your middle name from the ArrayList by index
		temp.remove(1);
		//Print the modified ArrayList and its size
		System.out.println(temp);
		System.out.println("size " + temp.size());
		//Add your middle name back to the ArrayList in between your first and last name
		temp.add(1, "Warren");
		//Print the modified ArrayList and its size
		System.out.println(temp);
		System.out.println("size " + temp.size());
		//Remove your middle name again from the ArrayList by name
		temp.remove("Warren");
		//Print the modified ArrayList and its size
		System.out.println(temp);
		System.out.println("size " + temp.size());
		//Set the the indices that is holding your first and last name, to your friend's
		temp.set(0, "Heather");
		temp.set(1, "Noble");
		//Print the modified ArrayList and its size
		System.out.println(temp);
		System.out.println("size " + temp.size());
		
		//	Challenge:
		//		Write code that will allow a user to input as many words as he/she wants.
		//	Once they are done. The code should print out all of the words the user inputted.
		
		scan = new Scanner(System.in);
		List<String> input = new ArrayList<String>();
		
		System.out.println("Enter your first word: ");
		String scanned = scan.next();
		while (!scanned.equalsIgnoreCase("stop")) {
			input.add(scanned);
			System.out.println("Enter another word: ");
			scanned = scan.next();
		}
		
		System.out.println("Here is a list of the words you've inputted: ");
		System.out.println(input);
		
	}
	
}