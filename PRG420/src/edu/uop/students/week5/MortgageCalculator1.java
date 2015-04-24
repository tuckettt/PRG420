package edu.uop.students.week5;

import java.text.*;

public class MortgageCalculator1 {


	/*declare variables*/

	double Irate;
	DecimalFormat dec;


	public static void main (String [] args) {

		MortgageCalculator1 obj = new MortgageCalculator1();
		obj.calculateArray();
		obj.printArray();
	}

	public double MortgageCalculator1() {
		/*declare set variable and decimal format*/
		dec = new DecimalFormat("$0.00");
		int LoanAmt=200000;
		double [] LoanTerm = {7,15,30};

		double [] Irate = {.0535,.055,.0575};

		double term = LoanTerm [i];
		double rate = Irate [i];
		double [] Payment;

	}

				/*calculate payment for the array in a new method*/

				public double calculateArray() {

			Payment[0]= (LoanAmt * (rate[0]/12)) / (1 - (Math.pow (1/ (1 + (rate[0]/12)), (term[0] * 12))));
			Payment[1]= (LoanAmt * (rate[1]/12)) / (1 - (Math.pow (1/ (1 + (rate[1]/12)), (term[1] * 12))));
			Payment[2]= (LoanAmt * (rate[2]/12)) / (1 - (Math.pow (1/ (1 + (rate[2]/12)), (term[2] * 12))));

		}

		void double printArray(){

			for (double i=0;i<3;i++){
				System.out.println ("Loan amount is " + LoanAmt + Irate [i] + LoanTerm [i] + Payment [i] + (Payment - rate [i]/12));
			}
		}
	}

}
