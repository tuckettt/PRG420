package edu.uop.students.week4;

/**
* Mcalc3.java
*
* Version 3
*
* 2/6/2012
* @author Irving Jimenez
*/
import java.text.*;			// Imports the java text library
import java.io.*; 			// Imports basic Java input/output library
import java.lang.Math.*; 		// Imports Java Math library

/** Write the program in Java (without a graphical user interface) and have it calculate the payment amount for 3 mortgage loans, 7 yr at 5.35, 15 yr at 5.5, and 30 yr at 5.75.*/
public class Mcalc3 {
	
	int Principal;
	double monthlyPayment; 
	DecimalFormat dec;
	
public static void main (String[] args) { 
	/* Declaration of variables*/

	double intRate;
	double loanAmt;
	
	int term;
	int termArray[] = {7,15,30};
	double intRateArray[] = {5.35, 5.5, 5.75};
Mcalc3 mc = new Mcalc3();                                                     // Instantiation of Mortgage calculator
mc.printmonthlyPayment();
}

/** Mortgage payment constructor*/
public Mcalc3() { 
/*Declaration of Variables*/
Principal = 200000;	
monthlyPayment = 0;

/*Decimals to be rounded off to two digits*/
DecimalFormat dec = new DecimalFormat(", ###.00");
}

public void printmonthlyPayment() {
for(int count = 0; count <3; count++)			// Initiation of loop
{

termArray= term[c];
intRateArray= intRate[c];
/*Payment= (Principal * Rate) / (1- Math.pow(1 /(1 + Rate), term))*/

/** Method prints out result decimal to two digits */

System.out.println(“The monthly payment will be $” + decimal.format(Payment) + “per month for a $” + “loan at” + decimal.format(100*termArray) + “% over a period of” + (intRateArray + “years.”);
}
}
}

