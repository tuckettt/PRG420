package edu.uop.students.week4;

import java.text.DecimalFormat;

public class mCalc {

	/*Declaration of variables*/
	double Principal;
	double Term;
	double Rate;
	double monthlyPayment;
		
		public static void main(String args[]) {

	/*Payment calculations and print out results*/
	
		mCalc mc = new mCalc();

		mc.calculatemonthlyPayment();

		mc.printMonthlyPayment();

	}
	
	/**Mortgage monthly payment constructor calculation is based on three variables*/

		public mCalc() {

	/*Initialization of variables*/

	Principal = 200000;
	Term = 360;
	Rate = 0.0575/12;
	monthlyPayment = 0;

	/*Decimal format is set at two digits*/

	DecimalFormat decimal = new decimalFormat("0.00");

	}

	/**Monthly mortgage payment calculation based on principal value, term, and rate variables*/

		public void calculatemonthlyPayment() {
	
	monthlyPayment = (Principal * Rate) / (1 - Math.pow(1 / (1 + Rate), Term));

	}

	/**Method prints the results of the monthlyPayment calculation*/

		public void printmonthlyPayment() {

	System.out.println();

	System.out.println("Monthly payment will be $" + decimal.format(monthlyPayment) + "per month for a $" + Principal + "loan at" + Rate + "% over a period of" + Term + "years.");

	}

	}

