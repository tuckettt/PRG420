package edu.uop.students.week5;

import java.lang.*;
import java.math.*;
import java.text.*;

public class MortgagePayment1

{
	/**Portions of the code below taken from Object Oriented Programming Tips, Troy Tuckett, PRG420, 2011.
	*Define variable fields */
	double lAmount;
	double lTerm;
	double lRate;
	double lPayment;

	public static void main(String[] args)
	{
		MortgagePayment1[] mps = {
				new MortgagePayment1(200000,7,5.35), 
				new MortgagePayment1(200000,15,5.5),
				new MortgagePayment1(200000,30,5.75)
		};

		for (int ii = 0; ii < mps.length; ii++) {
			mps[ii].calculatePaymentAmount();
			System.out.format("Mortgage #%d\n",ii+1);
			mps[ii].printPaymentAmount();
			System.out.println("");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public MortgagePayment1 (double amount, double term, double rate)	{

		//set amounts
		lAmount = amount;
		lTerm = term*12;
		lRate = rate/100;
	}

	public void calculatePaymentAmount ()	{

		//calculate monthly interest and payment amount. reference The Mortgage Professors Web Site,

//http://www.mtgprofessor.com/formulas.htm
		double c = lRate/12.0;
		lPayment = lAmount*( (c*Math.pow((1+c),lTerm)) / (Math.pow((1+c),lTerm) - 1) );

	}

	public void printPaymentAmount ()	{
		System.out.println("Payment,Balance,Interest");
		double lBalance = lAmount;
		for (int ii = 1; ii <= lTerm; ii++) {
			double lInterest = (lRate/12.0) * lBalance;
			lBalance = lBalance + lInterest - lPayment;
			System.out.format("$%.2f,$%.2f,$%.2f\n", lPayment, lBalance, lInterest);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		}
}

