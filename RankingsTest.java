import static org.junit.Assert.*;

import org.junit.Test;

public class RankingsTest {
	
	private String[] names = {"Jehron Petty", "Heather Noble", "Christine Dragos",
			"Harold Kennedy", "Mark Zuckerberg", "Steve Jobs", 
			"Jeff Bezos", "Evan Spiegel", "George Hotz", "Denis Scannell", 
			"John Buck", "Andrew Gove", "Jennifer Grene"};

	@Test
	public void testSetNumberOne() {
		Rankings test = new Rankings();
		
		test.setNumberOne(names[0]);
		String compare = names[0];
		assertEquals(compare, test.toString());
		assertEquals(1, test.size());
		
		test.setNumberOne(names[1]);
		compare = names[1] + compare;
		assertEquals(compare, test.toString());
		assertEquals(2, test.size());
		
		test.setNumberOne(names[2]);
		compare = names[2] + compare;
		assertEquals(compare, test.toString());
		assertEquals(3, test.size());
	}
	
	@Test
	public void testSetBottom() {
		Rankings test = new Rankings();
		
		test.setBottom(names[0]);
		String compare = names[0];
		assertEquals(compare, test.toString());
		assertEquals(1, test.size());
		
		test.setBottom(names[1]);
		compare += names[1];
		assertEquals(compare, test.toString());
		assertEquals(2, test.size());
		
		test.setBottom(names[2]);
		compare += names[2]; 
		assertEquals(compare, test.toString());
		assertEquals(3, test.size());
	}
	
	@Test
	public void testSetRank() {
		Rankings test = new Rankings();
		
		test.setRank(names[0], 1);
		String compare = names[0];
		assertEquals(compare, test.toString());
		assertEquals(1, test.size());
		
		test.setRank(names[1], 2);
		compare += names[1];
		assertEquals(compare, test.toString());
		assertEquals(2, test.size());
		
		test.setRank(names[2], 2);
		compare = names[0] + names[2] + names[1];
		assertEquals(compare, test.toString());
		assertEquals(3, test.size());
		
		test.setRank(names[3], 3);
		compare = names[0] + names[2] + names[3] + names[1];
		assertEquals(compare, test.toString());
		assertEquals(4, test.size());
		
		test.setRank(names[4], 1);
		compare = names[4] + compare;
		assertEquals(compare, test.toString());
		assertEquals(5, test.size());
		
		test.setRank(names[5], 6);
		compare += names[5];
		assertEquals(compare, test.toString());
		assertEquals(6, test.size());
		
		test.setRank(names[6], 3);
		compare = names[4] + names[0] + names[6] + names[2] + names[3] + names[1] + names[5];
		assertEquals(compare, test.toString());
		assertEquals(7, test.size());
		
	}
	
	@Test
	public void testSwapRankings() {
		Rankings test = new Rankings();
		
		test.setBottom(names[0]);
		test.setBottom(names[1]);
		test.setBottom(names[2]);
		test.setBottom(names[3]);
		test.setBottom(names[4]);
		
		test.swapRankings(1, 5);
		String compare = names[4] + names[1] + names[2] + names[3] + names[0];
		assertEquals(compare, test.toString());
		assertEquals(5, test.size());
		
		test.swapRankings(2, 4);
		compare = names[4] + names[3] + names[2] + names[1] + names[0];
		assertEquals(compare, test.toString());
		assertEquals(5, test.size());
		
		test.swapRankings(1, 3);
		compare = names[2] + names[3] + names[4] + names[1] + names[0];
		assertEquals(compare, test.toString());
		assertEquals(5, test.size());
		
		test.swapRankings(2, 5);
		compare = names[2] + names[0] + names[4] + names[1] + names[3];
		assertEquals(compare, test.toString());
		assertEquals(5, test.size());
	}
	
	@Test
	public void testRemove() {
		Rankings test = new Rankings();
		
		test.setBottom(names[0]);
		test.setBottom(names[1]);
		test.setBottom(names[2]);
		test.setBottom(names[3]);
		test.setBottom(names[4]);
		
		test.remove(1);
		String compare = names[1] + names[2] + names[3] + names[4];
		assertEquals(compare, test.toString());
		assertEquals(4, test.size());
		
		test.remove(names[4]);
		compare = names[1] + names[2] + names[3];
		assertEquals(compare, test.toString());
		assertEquals(3, test.size());
		
		test.remove(2);
		compare = names[1] + names[3];
		assertEquals(compare, test.toString());
		assertEquals(2, test.size());
		
		test.remove(names[1]);
		compare = names[3];
		assertEquals(compare, test.toString());
		assertEquals(1, test.size());
	}

}
