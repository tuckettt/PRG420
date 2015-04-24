package edu.uop.students.week4;

import java.text.*;

public class MortgageCalculatorClass {

	/*Declarations*/
	 double LoanAmt;
	 double IRate;
	 int LoanTerm;
	 int MonthsTerm;

	//DecimalFormat dec = new DecimalFormat();
	
	public static void main(String [] args) {

		MortgageCalculatorClass obj = new MortgageCalculatorClass ();
		obj.printPayment( obj.calculatePayment());

	}

/*define variables for this instance*/
	public MortgageCalculatorClass() {
		LoanAmt = 200000.00;
		IRate = .0575;
		LoanTerm = 30;
	}

/*make calculations*/
	public double calculatePayment() {
		
		double rate = IRate / 12;
		double pmt = LoanAmt * (Math.pow((1+rate),LoanTerm) * rate)/(Math.pow(1+rate, LoanTerm) -1);
		// principle * (Math.pow((1+rate), term) * rate)/(Math.pow(1+rate, term)-1);
		
		return  pmt;
	
	}

	public void printPayment(double payment) {
		System.out.println("Loan Payment is $ " + payment);
	}
}