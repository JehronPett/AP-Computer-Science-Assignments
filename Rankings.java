import java.util.*;

/*
 * 
 * 	Jehron Petty - December 2016 - LuHi AP Computer Science
 *  
 *  The purpose of this assignment is to familiarize students with ArrayLists
 *  and how they can be used in a practical environment. This assignment should 
 *  also explicitly show the benefits of using ArrayLists over regular arrays.
 *  
 *  What to do:
 *  	Complete the body of each of these methods. One method should only be 
 *  three lines of code. The rest should be one line. Good luck!
 *  
 *  Hint:
 *  	Reference Java 8 online API for the ArrayList class and its methods.
 *  
 *  Print Name Here:
 */

public class Rankings {
	
	//"Database" for the ranked names of people
	private List<String> theList;

	/*
	 * 	Constructs a new list of rankings by initializing a new ArrayList.
	 */
	public Rankings() {

	}
	
	/*
	 * 	Insert this person to the number one spot.
	 */
	public void setNumberOne(String s) {

	}
	
	/*
	 * 	Insert this person at the bottom of the rankings.
	 */
	public void setBottom(String s) {

	}
	
	/*
	 *  Insert this person at specified spot 'i' in the rankings.
	 */
	public void setRank(String s, int i) {

	}
	
	/*
	 * 	Swap the people at the ranks 'i' and 'j'.
	 */
	public void swapRankings(int i, int j) {

	}
	
	/*
	 * 	Remove the person 's' from the rankings list.
	 */
	public void remove(String s) {

	}
	
	/*
	 * 	Remove the person at the specified rank 'i' from the list.
	 */
	public void remove(int i) {

	}
	
	/*
	 * 	Return the size of this rankings list.
	 */
	public int size() {
		return 0;
	}
	
	/*
	 *  
	 */
	public String toString() {
		String temp = "";
		for (String s: theList) {
			temp += s;
		}
		return temp;
	}
	
}
