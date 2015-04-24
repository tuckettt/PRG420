package edu.uop.students.week5;

public class MyClass {
	
	/* Let me see if I can help you.  This is a really simple
	 * solution.  Don't worry about the methods, etc. right now.
	 */
	
	// Start with a simple main 
	
	public static void main(String args[]) {
		
		/* We want to loop through each of the loan types and within
		 * that loop we want to loop through the terms (in months).
		 * Inside of the loop you need to calculate payment, principle, interest, and balance
		 */
		
		
		//Declare variables		
		double loanAmount = 200000;
		double[] rate = {.0535,.055,.0575};
		int[] term = {7,15,30};
		
		
		/* Now we will start doing some looping.  The first loop (outer) goes through the 
		 * three loan types.  Then, within this outer loop we have an inner loop.
		 * This loop (inner) goes through the months.  
		 */
		for (int outer=0;outer<rate.length;outer++) {
			
			/* In here we will set up our local variables */
			double balance = loanAmount; // start out balance with loan amount
			double intRate = rate[outer]*100/12;
			int months = term[outer] * 12; // determine the number of months
	
			for (int inner=0;inner<months;inner++) {
				
				//calculate payment
				//calculate interest
				//calculate principle
				
				// print month, interest, principle, balance
				// balance = balance - principle
				
			}			
		}
	}		
}			
			
 		
		
	
	/*
	 public double MortgageCalculator () {
         /*declare set variable and decimal format*/
      // dec = new DecimalFormat("$0.00");
       
      /* double term = LoanTerm ;
       double rate = Irate ;
       double [] Payment = new Payment


then I go into my second method "calculateArray"

Should the payment array look like this?

double [] Payment = new Payment;

or like this

double [] Payment = new Payment[3];

?
*/
