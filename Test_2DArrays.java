import static org.junit.Assert.*;

import org.junit.Test;

public class Test_2DArrays {
	
	/*
	 * 	Return a string representation of the given 2D array.
	 */
	private static String stringify(int[][] arr) {
		String toReturn = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				toReturn += arr[i][j];
			}
		}
		return toReturn;
	}

	@Test
	public void testLeftHalf() {
		String correct = stringify(leftHalf(new int[10][10]));
		String student = stringify(_2DArrays.leftHalf(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	@Test
	public void testRightHalf() {
		String correct = stringify(rightHalf(new int[10][10]));
		String student = stringify(_2DArrays.rightHalf(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	@Test
	public void testTopHalf() {
		String correct = stringify(topHalf(new int[10][10]));
		String student = stringify(_2DArrays.topHalf(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	@Test
	public void testBottomHalf() {
		String correct = stringify(bottomHalf(new int[10][10]));
		String student = stringify(_2DArrays.bottomHalf(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	@Test
	public void testStaircase() {
		String correct = stringify(staircase(new int[10][10]));
		String student = stringify(_2DArrays.staircase(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	@Test
	public void testMakeAnX() {
		String correct = stringify(makeAnX(new int[10][10]));
		String student = stringify(_2DArrays.makeAnX(new int[10][10]));
		assertTrue(correct.equals(student));
	}
	
	/*
	 *  Print all contents of an integer array in grid form.
	 */
	public static void print2DIntArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}
	
	/*
	 * 	Fill in the left half of a 2D array with 1's, then return it.
	 */
	public static int[][] leftHalf(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length/2; j++) {
				arr[i][j] = 1;
			}
		}
		return arr;
	}
	
	/*
	 *  Fill in the right half of a 2D array with 1's, then return it.
	 */
	public static int[][] rightHalf(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length/2 ; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		return arr;
	}
	
	/*
	 * 	Fill in the top half of a 2D array with 1's, then return it.
	 */
	public static int[][] topHalf(int[][] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		return arr;
	}
	
	/*
	 *  Fill in the bottom half of a 2D array with 1's, then return it.
	 */
	public static int[][] bottomHalf(int[][] arr) {
		for (int i = arr.length/2; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		return arr;
	}
	
	/*
	 *	Fill in a half of the 2D array cut diagonally, then return it.
	 *	Here is a visual representation:
	 */
	public static int[][] staircase(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = 1;
			}
		}
		return arr;
	}

	/*
	 *  Fill in spaces of the 2D array to make an 'X' with the number 1.
	 *  Precondition: The array must be in AxA form, a square.
	 */
	public static int[][] makeAnX(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i][i] = 1;
			arr[i][arr.length - 1 - i] = 1;
		}
		return arr;
	}
	
	/*
	 *  Gives separation for console output.
	 *  Parameters:
	 *  	x = the amount of lines of separation
	 */
	private static void separate(int x) {
		for (int i =0; i < x; i++) {
			System.out.println();
		}
	}
	
	/*
	 *  Fill in each index of the array with either a '1' or a '0' AT 
	 *  RANDOM, then return the 2D array.
	 */
	public static int[][] binaryCode(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)(Math.random() + 0.5);
			}
		}
		return arr;
	}

}
