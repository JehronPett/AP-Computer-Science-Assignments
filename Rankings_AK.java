import java.util.ArrayList;
import java.util.List;

public class Rankings_AK {
	
	//"Database" for the ranked names of people
	private List<String> theList;

	/*
	 * 	Constructs a new list of rankings.
	 */
	public Rankings_AK() {
		theList = new ArrayList<String>();
	}
	
	/*
	 * 	Insert this person to the number one spot.
	 */
	public void setNumberOne(String s) {
		theList.add(0, s);
	}
	
	/*
	 * 	Insert this person at the bottom of the rankings.
	 */
	public void setBottom(String s) {
		theList.add(s);
	}
	
	/*
	 *  Insert this person at specified spot 'i' in the rankings.
	 */
	public void setRank(String s, int i) {
		theList.add(i - 1, s);
	}
	
	/*
	 * 	Swap the people at the ranks 'i' and 'j'.
	 */
	public void swapRankings(int i, int j) {
		String temp = theList.get(i - 1);
		theList.set(i - 1, theList.get(j - 1));
		theList.set(j - 1, temp);
	}
	
	/*
	 * 	Remove the person 's' from the rankings list.
	 */
	public void remove(String s) {
		theList.remove(s);
	}
	
	/*
	 * 	Remove the person at the specified rank 'i' from the list.
	 */
	public void remove(int i) {
		theList.remove(i - 1);
	}
	
	/*
	 * 	Return the size of this rankings list.
	 */
	public int size() {
		return theList.size();
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
