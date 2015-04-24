package edu.uop.students.week5;

/** Write the program in Java (without a graphical user interface) using a loan amount of $200,000 with 
an interest rate of 5.75% and a 30 year term.

 **Change Request 1**
 */

import java.text.DecimalFormat; //imports decimalformat library for decimal formatting
import java.io.*; //imports basic Java input/output library

/** Computes monthly mortgage payment for 200000 loan at a 5.75% interest with a 30 year term loan.*/
public class Mcalc2 {
	//public static void main(String[] args) {
		/*Declaring variables */
		int Principal = 200000;
		double Rate = .0575;
		int Term = 360;
		double monthlyPayment = 0.00;
		DecimalFormat decimal;
		double monthlyIntAmt;
		double TotalBalance;
		double monthlyPrinPaid;
		int LineCount;

		public static void main(String args[]) {

			/*Methods defined to calculate monthly mortgage and print results*/

			Mcalc2 mc = new Mcalc2();
			mc.calculatePaymentAmount();
			mc.printPaymentAmount();
			mc.printMortgagePaymentList();

		}

		/**Defining constructor for monthly mortgage payment*/
		public Mcalc2() {

			/*Instance variables initialized */
			Principal = 200000;
			Term = 360;
			Rate = .0575/12; //Interest calculation by dividing the rate by 12 months
			monthlyPayment = 0;
			/*Variables defined*/
			monthlyIntAmt = 0;
			TotalBalance = Principal;
			monthlyPrinPaid = 0;
			LineCount = 15;

			/*Decimal remainder to be rounded off to two digits */
			decimal = new DecimalFormat(",###.00");
		}

		public void calculatePaymentAmount() {

			monthlyPayment = (Principal * Rate) / (1 - Math.pow(1 / (1 + Rate), Term));

		}

		/** Method prints out result decimal to two digits */
		public void printPaymentAmount() {

			System.out.println("The monthly payment will be $" + decimal.format(monthlyPayment) + " per month for a $" + Principal + " loan at " + (decimal.format(100*(Rate * 12))) + "% over a period of " + (Term/12) + " years.");
			System.out.println();
		}

		/** Print results for payments remaining, total balance, amount increased to interest, remaining balance in a 20 line list, and a 3 second pause. */
		public void printMortgagePaymentList() {
			/*Prints heading for Mortgage Payment listing */
			System.out.println("\n\nTerm\tPayment\t\t Principal\t\tInterest\tBalance");
			System.out.println(); 

			//Calculation of principal and interest rate paid. */
			monthlyIntAmt = (TotalBalance * Rate);
			monthlyPrinPaid = (monthlyPayment - monthlyIntAmt);

			/** Total Balance print loop and Interest paid month to month for the duration of the loan */
			while (Term > 0) { //Start while loop
				/*Prints calculation results */
				System.out.println(Term + "\t$" + decimal.format(monthlyPayment) +
						"\t $" + decimal.format(monthlyPrinPaid) +			
						"\t\t$" + decimal.format(monthlyIntAmt) +
						"\t\t$" + decimal.format(TotalBalance - monthlyPrinPaid));

				Term --;                                         

				/*Calculation for Total Balance on a month to month */
				monthlyIntAmt = (TotalBalance * Rate);
				monthlyPrinPaid = (monthlyPayment - monthlyIntAmt);
				TotalBalance = (TotalBalance - monthlyPrinPaid);

				/*If statement for the 3 second pause plus the 15 line count. */
				if (LineCount == 15) {

					LineCount = 0;
					try {
						Thread.sleep(3000);            // 3 second pause
					}
					catch (InterruptedException e){
					}
				}                                  
				else {
					LineCount++;
				} 
			} 

		}	
	} 

