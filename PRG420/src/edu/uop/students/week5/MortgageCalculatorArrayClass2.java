package edu.uop.students.week5;

import java.text.*;

public class MortgageCalculatorArrayClass2 {

	/*Declarations*/
	double LoanAmt;
	double Payment;

	DecimalFormat dec = new DecimalFormat();

	public void main(String [] args) {

		/*define variables for this instance*/
		LoanAmt = 200000;
	//}


	/*define arrays*/

	//{
		double [] LoanTerm

		= new double[]{7,15,30};

		double [] IRate

		=new double[] {.0535,.055,.0575};

		/*make calculations*/


		for (int index=0;index<3;index++) {

			LoanTerm[i]= LoanTerm;
			Irate[i]= Irate;

			Payment = (LoanAmt * (Irate/12)) / (1 - (Math.pow (1/ (1 + (IRate/12)), (LoanTerm * 12))));

			System.out.println("Loan Payment is $ " + dec.format (Payment));
		}
	}
}