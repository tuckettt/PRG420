package edu.uop.students.week3;



import java.math.*;    
import java.util.*;  
import java.text.*;  
import java.io.*;

public class mfcalculatorCR1  //This begins the Calculator class. Public and class are keywords, while MFCalculatorCR1 is the identifier.
{
	public static double round(double val)  //Defines the method of the round class. Rounds the value to 2 decimal places.
	{
		int vala = (int) (val*100);
		return (double) (vala/100.00);
	}

	public static void main(String[] args) //Defines the method of the main class. Public and static are the
	//keywords, while void is the method and main is the identifier.  String
	//args is the parameter list. IOException is a method that performs
	//Input/Output (I/O) encountered and unrecoverable I/O errors.
	{


		//This declares the variables and defines the hard coded values for a mortgage of $200,000 (principal), an interest rate of 5.75%
		//(rate), and a loan term of 30 years (term). Double is also a keyword and is usually the standard.
		double principal = 200000.00;								//Loan amount of the mortgage
		double rate = 0.0575;										//Intrest rate of the mortgage (yearly)
		int term = 30;												//Number of payments in the mortgage (years)
		double payment = 0.00;										//Monthly payment of the mortgage
		payment = (principal * ((rate / 12)/(1 - Math.pow((1 + (rate / 12)), -(term * 12)))));
		double amountlefttopay = principal;							//This holds the amount left to pay after each payment (loan balance)
		double interest;											//Calculated interest for each month
		double actualprinciple;										//Actual amount payed (monthly payment - interest)
		InputStreamReader isr = new InputStreamReader(System.in);	//Creates the Stream Reader class
		BufferedReader bfr = new BufferedReader(isr);	//Needed to read the Stream Reader class for user interaction


		//These are outputs that will be seen by the user based on the calculations
		System.out.print("Payment Number   "); 	//Displays the Payment Number header
		System.out.print("Interest Paid   ");	//Displays the Interest Paid header
		System.out.print("Actual Amount Paid   ");	//Displays the Actual Amount Paid header
		System.out.print("Amount Left to Pay   ");	//Displays the Amount Left to Pay header
		System.out.println();										//Creates a blank or new line

		for (int i = 0; i < term * 12; i++)	//Loops through payments
		{

			interest = (amountlefttopay * (rate / 12));	//Actual interest paid (amount left * interest rate/12)
			actualprinciple = (payment - interest);	//Actual amount paid (monthly payment - interest)

			amountlefttopay = amountlefttopay - actualprinciple;


			if (i == term * 12 - 1)	//This is due to a problem with Java rounding - can give negative value
			{
				amountlefttopay = 0;
			}
			if (i % 15 == 0 && i != 0)					//Displays 15 payments per ENTER stroke and pauses for user action
			{

				System.out.println();	//Creates a blank or new line
				System.out.println();	//Creates a blank or new line
				System.out.println();	//Creates a blank or new line
				System.out.println("           To Display More of the Loan Payment History, Press ENTER"               );

				try {
					bfr.readLine();
				} catch (IOException io) {
				}

				System.out.print((i + 1) + "                    ");				//Displays the payment number
				System.out.print(round(interest) + "             ");//Displays the interest amount
				System.out.print(round(actualprinciple) + "             ");//Displays the actual pay amount
				System.out.print(round(amountlefttopay) );						//Displays the amount left to pay
				System.out.println();											//Creates a blank or new line

			}		//This ends the loop

		}				//This ends the class "main"

	}					//This ends the class "MFCalculatorCR1"
}