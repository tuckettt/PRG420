package edu.uop.troytuckett.examples;

/**  
 * Calculate Factorial on a given number
 *
 */

public class Factorial {
		
	/* To calculate Factorial I will need to loop a given
	 * number of times.  Within each loop I multiply the 
	 * current value by the current number and then subtract
	 * one from current number.
	 */
			
	public static void main(String args[]) {
	
		// declare fnumber -- ## factorial and set to 5
		int fnumber = 5;
		
		// declare answer and set to one
		int answer = 1;
		
		// loop through fnumber number of times
		while (fnumber > 0) {
		
		// multiply current answer by current value of fnumber		
			answer = answer * fnumber;
			
		// reduce fnumber by one
			fnumber--;	
			
		// end loop		
		}
		
		// print out answer
		System.out.println(answer);
		
	}	
}
