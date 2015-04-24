package edu.uop.students.week5;

import java.text.DecimalFormat;
//This calculator will accurately calculate Mortgage Payments, while allowing for flexible variable adjustments 
//(i.e. Length of Payments, Principal, Interest.) Based on Service Request from McBride Financial

//Author: Kenan Cross //

public class MortgageCalculator {
 int i; // counter
 int termLimit = 30;
 int months;
 int payments; /* No. of monthly payments in mortgage*/
 int monthsPd = 12 * i; //Calculations of months paid so far
 double balPd; //Part of Balance Paid Formula
 double balPd2; //Part of Balance Paid Formula
 double balPd3; //Part of Balance Paid formula
 double balPdCalc; //Calculated result of balPd and balPd2
 double loanCalc;   //Power of Calculation for compound interest
 double powCalc; //Power of calculation variable
 double rate;
 double loanBalance;
 double loanInterest; //Calculated Loan with Interest
 double newLoanBalance; //Calculated Remaining Loan Balanace
 double annualRate;  //Computed Annual Rate
 double interestPlus; // rate + 1
 double interestPd;  // contains interest paid so far
 double interestAdj;
 double interestExp;
 int length; /* length of mortgage */
 double principle; /* Principle loan amount */
 double monthlyPayment; /* Calculated Monthly Payment */
 DecimalFormat dec;
 DecimalFormat percentage;


public static void main (String args[]){
	MortgageCalculator calc = new MortgageCalculator();
	calc.calculatePaymentAmount();
	calc.printPaymentAmount();
}

public MortgageCalculator(){
	months = 12;
	rate = 0.0575;
     principle = 200000;
	length = 30;
	dec = new DecimalFormat ("$0.00");
     percentage = new DecimalFormat("0.00%");
}

public void calculatePaymentAmount(){
	annualRate = ((rate)/(12));
     payments = (months) * (length);
	interestAdj = (annualRate)+(1);
     interestPlus = (rate + 1);
	interestExp = Math.pow(interestAdj, payments);
	monthlyPayment = principle * (annualRate * interestExp)/(interestExp - 1);
     loanCalc = principle * (Math.pow(interestAdj,(termLimit)));
}
//Above formula is based on M=P[i(1+i)^n]/[(1+i)^n-1] found on ifitbreaks.com/interest.htm//
public void printPaymentAmount (){
  System.out.println("Your Loan Amount is "+ dec.format(principle));
  System.out.println("Your Annual Rate is "+ percentage.format(rate));
  System.out.println("Your monthly payment amount is " + dec.format (monthlyPayment));
  System.out.println("Your principal balance with interest is " + dec.format (loanCalc));
 for (i=1; i <= termLimit; i++){
  //Loop set for the limit of Mortgage term
  powCalc = principle * (Math.pow(interestAdj, i))-1;
  balPd = monthlyPayment/annualRate;
  balPd2 = balPd - principle;
  balPd3 = 1 - Math.pow(annualRate, monthsPd);
  balPdCalc = balPd - (balPd2 * balPd3); 
  //formula is based on Amt Paid = (L/R - P)[(1+R)^X - 1] found
  // at http://www.infobarrel.com/Financial_Math:__Calculating_the_Mortgage_Balance_after_X_Number_of_Years
  interestPd = powCalc - principle;
  System.out.println("\tIn Year " + i + " you will have paid " + dec.format(interestPd) + " in interest.");
  System.out.println("\t Your remaining loan balance is " + dec.format(balPdCalc));
     try {
         Thread.sleep(5000);
         } 
     catch (InterruptedException e) {
         }
 }
}
}
