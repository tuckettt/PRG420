package edu.uop.students.week3;

//This mortgage Calculator was created December 12/31/2011.
//The base of this program is used with permission from the author Troy Tuckett in 
//my personal forum dated MON 12/19/2011 at 12:51PM
//http://www.java2s.com/Code/JavaAPI/java.lang/Systeminread.htm was used to use the please use <Enter> key to continue
//the try statement section of this code is referenced from http://www.java-//forums.org/threads-synchronization/528-how-use-sleep-method.html and //http://www.java-examples.com/pause-thread-using-sleep-method-example
// Authored by Michael Magruder II for Class PRG/420
// Verified by (Please add name and date here)

import java.text.DecimalFormat;
import java.io.IOException;

public class mortgagevariables{

	int L;				/*L = Amount requested by Borrower*/
	int Y;				/*Y = Time for loan payoff from borrower*/
	int CalendarMonths;		/*How many Calendar Months in a year*/
	int M;				/*Formula to find months of Loan Duration*/
	double I;			/*Interest Divided by the months in a year*/
	double baseinterest;		/*baseinterest = Interest rate of Loan*/
	double MonthlyPayments;		/*Amount Loan Payment Per Month*/
	double Mikeponent;		/*Emponential protion of the formula*/
	double Division;		/*Division Portion of the equation*/
	double Adjustedloan;		/*Loan amount times the interest minus Monthly Payment*/
	double Interestpaid;		/*adjusted loan - (adjusted loan - loan amount * interest*/
	double Balancepaid;		/*Montlypayments - Interest paid*/
	int Month;			/*used to do month calculation in array*/
	DecimalFormat df;

	public static void main(String [] args){

		mortgagevariables mortgagevariables = new mortgagevariables();
		mortgagevariables.monthlypayment();
		mortgagevariables.larray();
	}

	public mortgagevariables (){

		// This section sets Variables to Needed information for use later in formula

		L = 200000;
		Y = 30;
		CalendarMonths = 12;
		M = (Y * CalendarMonths);
		I = (.0575 / 12);
		baseinterest = 5.75;
		MonthlyPayments = .0;
		Mikeponent = Math.pow((1 + I),M);
		Division = .0;
		Adjustedloan = 200000;
		Interestpaid = 0.0;
		Balancepaid = 0.0;
		Month = 0;
		df = new DecimalFormat("$0.00");

	}

	public void monthlypayment(){

		//Takes Variables and uses them to fil in complete assignment
		Division = (I * Mikeponent) / (Mikeponent - 1);
		MonthlyPayments = L * Division;

	}

	//Paychart is area which will figure the reduction from the entire price of the mortgage
	//to the final payment and completion of the loan. 

	public void larray(){

		for (M = 1; M<=360; M++){

			Adjustedloan = Adjustedloan;
			Interestpaid = Adjustedloan * I;
			Adjustedloan = Adjustedloan - (MonthlyPayments - (Adjustedloan * I));

			System.out.println("Month " + M + " Balance " + df.format (Adjustedloan) + " Paid Interest "+ df.format(Interestpaid) + " Monthly payment " + df.format(MonthlyPayments));

			if (M%30 == 0){

				try{

					Thread.sleep(7);
					System.out.println("Please press <Enter> to Continue:");

				}

				catch (InterruptedException ie){
				}
				try{

					int inChar;
					inChar = System.in.read();
					System.in.read();
					System.out.println();
				}

				catch (IOException e){
					System.out.println("Please try again");	
				}		
			}
		}
	} 
}
