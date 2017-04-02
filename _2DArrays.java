/*
 *  Jehron Petty - December 2016 - LuHi AP Computer Science
 *  
 *  The purpose of this assignment is to familiarize students with 2D 
 *  arrays and how they can me manipulated. This assignment should prepare
 *  students well for the Picture Lab project.
 *  
 *  Print Name Here:
 *  
 */


public class _2DArrays {
	
	/*
	 *  INSTRUCTIONS:
	 *  
	 *  1) 	DO NOT change the name of this class. At the top of this file
	 *  	there is a place for you to type your name. It is for testing 
	 *  	purposes. Please do that immediately.
	 *  
	 *  2)	To get started, follow the first few instructions in 'main'
	 *  	to familiarize yourself with creating 2D arrays of different sizes.
	 *  
	 *  3) 	Write the body of the method 'print2DIntArray'
	 *  	Hint: 	Think about how you would print a one-dimensional array
	 *  			and remember that a two-dimensional array is just an 
	 *  			array of one-dimensional arrays.
	 *  	
	 *  4) 	Write the body of the method 'binaryCode'
	 *  	READ THE METHOD SPECIFICATION FIRST!
	 *  	Hint:	This should be easy.
	 *  
	 *  5) 	Write the body of the methods 'leftHalf''rightHalf' 'topHalf' and 'bottomHalf'
	 *  	READ THE METHOD SPECIFICATION FIRST!
	 *  	Hint: 	Visualize the array first (maybe draw it on paper), then
	 *  			simulate what you need to do in order to fill the left half 
	 *  			of the array on the drawing. It will make writing the code
	 *  			for this task easier.
	 *  
	 *  6)	Write the body of the method 'staircase'
	 *  	READ THE METHOD SPECIFICATION FIRST!
	 *  	Hint: 	The amount of columns in each row that are being filled
	 *  			increased by one as you move down the 2D array.
	 *  
	 *  7) 	Write the body of the method 'makeAnX'
	 *  	READ THE METHOD SPECIFICATION FIRST!
	 *  	Hint: 	Once again, visualize what your code will need to do by 
	 *  			drawing out a 2D array and simulating the steps you need
	 *  			to make in order to make an 'X'
	 *  
	 *  8) 	Use the method 'separate' at the bottom of this file to clean up your output.
	 *  	Read the specification and body of the code to understand what it does and 
	 *  	how to use it.
	 *  
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 	INTEGER 2D ARRAYS
		 */
		
		//Create a 10x2 array of integers

		//Create a 5x5 array of integers

		//Create a 2x10 array of integers

		
		/*
		 *  TESTING SPACE:
		 *  Here you may use the methods 'print2DIntArray' and 'separate'
		 *  to test your methods before you submit this assignment. Be sure
		 *  to create a new 10x10 2DArray for each call to a method to ensure
		 *  that you are manipulating an untouched array.
		 */

	}

	/*
	 *  Print all contents of an integer array in grid form.
	 */
	public static void print2DIntArray(int[][] arr) {
		
	}
	
	/*
	 * 	Fill in the left half of a 2D array with 1's, then return it.
	 * 	
	 * 	Visual representation:
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 * 		1111100000
	 */
	public static int[][] leftHalf(int[][] arr) {
		//Remove this comment and line of code, then write your solution
		return null;
	}
	
	/*
	 *  Fill in the right half of a 2D array with 1's, then return it.
	 *  
	 *  Visual representation:
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 *  	0000011111
	 */
	public static int[][] rightHalf(int[][] arr) {
		//Remove this comment and line of code, then write your solution
				return null;
	}
	
	/*
	 * 	Fill in the top half of a 2D array with 1's, then return it.
	 */
	public static int[][] topHalf(int[][] arr) {
		//Remove this comment and line of code, then write your solution
		return null;
	}
	
	/*
	 *  Fill in the bottom half of a 2D array with 1's, then return it.
	 */
	public static int[][] bottomHalf(int[][] arr) {
		//Remove this comment and line of code, then write your solution
				return null;
	}
	
	/*
	 *	Fill in a half of the 2D array cut diagonally, then return it.
	 *	Here is a visual representation:
	 *	
	 *	1000000000
	 *	1100000000
	 *	1110000000
	 *	1111000000
	 *	1111100000
	 *	1111110000
	 *	1111111000
	 *	1111111100
	 *	1111111110
	 *	1111111111 
	 */
	public static int[][] staircase(int[][] arr) {
		//Remove this comment and line of code, then write your solution
		return null;
	}

	/*
	 *  Fill in spaces of the 2D array to make an 'X' with the number 1.
	 *  Precondition: The array must be in AxA form, a square.
	 */
	public static int[][] makeAnX(int[][] arr) {
		//Remove this comment and line of code, then write your solution
		return null;
	}
	
	/*
	 * 	Binary code is the language that computers speak in and it looks 
	 * 	something like this:
	 * 
	 * 	10101010111010010
	 * 	11010111110111001
	 * 	10010000011110101
	 * 	10011111001010101
	 * 
	 * 	Your task is to create this representation of binary 
	 * 	code using a 2D array.
	 * 
	 *  Fill in each index of the array with either a '1' or a '0' AT 
	 *  RANDOM, then return the 2D array.
	 */
	public static int[][] binaryCode(int[][] arr) {
		//Remove this comment and line of code, then write your solution
		return null;
	}

	/*
	 *  Gives separation for console output.
	 *  Parameters:
	 *  	x = the amount of lines of separation
	 *  
	 *  DO NOT MODIFY THIS CODE
	 */
	private static void separate(int x) {
		for (int i =0; i < x; i++) {
			System.out.println();
		}
	}

}