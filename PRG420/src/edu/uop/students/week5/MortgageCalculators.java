package edu.uop.students.week5;

import java.text.DecimalFormat;
import java.io.*;

public class MortgageCalculators

{

	int LoanAmount=200000;		// Loan amount 
	double ReducedLoanAmount=0;     // Loan amount after payment       
	double InterestPerPayment=0;    // Interest Paid per payment	
	double Payments=0;		// This is to be the ammount of each installment payment
	int Year=0;                     // Year for display
	double ShowInterest=0;     // Interest Rate for display
	double PrincipleAmount=0;      // This is the amount of each payment applied to the loan Principle
	int Length[] = {84, 180, 360};
	double Interest [] = {(.0535/12), (.055/12), (.0575/12)};
	DecimalFormat df;


	public static void main(String [] args){

		MortgageCalculators MortgageCalculators = new MortgageCalculators();

		MortgageCalculators.payment();

	}
	public MortgageCalculators (){

		//Setting standards for decimal formatting
		df = new DecimalFormat("$#,###.00");

	}
	public void payment(){

		for (int j = 0; j <Interest.length; j++){

			Payments = LoanAmount * (Math.pow((1+Interest[j]),Length[j]) 
					* Interest[j])/(Math.pow(1+Interest[j], Length[j])-1);
			InterestPerPayment = (Interest[j]*12);

			LoanAmount = LoanAmount;


			System.out.println ("Month " + j);
			System.out.println ("Monthly Payment " + df.format(Payments));
			System.out.println ("Loan amount" + df.format(ReducedLoanAmount));
			System.out.println ("Interest paid " + df.format(InterestPerPayment));	
			System.out.println ("Payment versus Principle is " + df.format 
					(PrincipleAmount));
			System.out.println();

			if (j%12 == 0 || j == Length[j]){

				try{

					Thread.sleep(0);
					System.out.println("Please press <Enter> to Continue:");}

				catch (InterruptedException Exc1){
					System.out.println();

				}

				try{

					int inChar;
					inChar = System.in.read();
					System.in.read();
					System.out.println();
				}

				catch (IOException Exc2){}

			}
		}
	}				

}

