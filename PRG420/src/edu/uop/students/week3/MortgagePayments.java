package edu.uop.students.week3;

/*
 * mortgagepayment.java
 *
 * Created on January 9, 2011
 *
 * @author Jerica Sherrell
 *
 *The base of this program is used with permission from the author Troy Tuckett

 *	
 */


public class MortgagePayments {

	/*
	 * line shows the principal value of the loan
	 */
	double principalValue;

	/*
	 * line shows the interest rate of the loan
	 */
	double interestRate;

	/*
	 * line shows the annual percentage rate of the loan
	 */
	double apr;

	/*
	 * line shows the term of the loan in months
	 */
	int term;

	/*
	 * line shows the monthly payment of the loan
	 */
	double monthlyPayment;

	public MortgagePayments() {

		/*
		 * $200,000 principal
		 */
		principalValue= 200000;

		apr = 5.75; 					// 5.75% is the annual percentage rate
		interestRate= apr / 100 / 12; 			// Formula for interest rate by month
		term = 360; 					// 30 year loan is 360 months
		df = new DecimalFormat("$0.00"); /*sets the format to currency*/

		monthlyPayment = calculateMonthlyPayment(principalValue, interestRate,
				term);

		printAmortizationTable(monthlyPayment, term, principalValue,
				interestRate);
	}

	private static double calculateMonthlyPayment(double principalValue,
			double interestRate, int term) {

		return (principalValue * interestRate)
				/ (1 - Math.pow(1 + interestRate, -term));
	}

	/**
	 * Prints table.
	 */
	private static void printAmortizationTable(double payment, int term,
			double principalBalance, double interestRate) {

		/* calculates the balance */
		double loanBalance = term * payment;
		double interestBalance = loanBalance - principalBalance;
		double totalPrincipalPaid = 0;
		double totalInterestPaid = 0;
	}
	{

		/**
		 * Header of table.
		 */
		System.out.printf("%20s\t%25s\t%20s\n", "Balance",
				"Interest Paid This Month", "Total Interest Paid");

		/*the payment periods */
		for (int paymentNumber = 1; paymentNumber <= term; paymentNumber++) {




			{
				/**
				 * The portion of the payment that goes to interest is based on the
				 * remaining principal balance.
				 **/
				double interestPaidThisMonth = interestRate * principalBalance;
				/* principle*/

				double principalPaidThisMonth = payment - interestPaidThisMonth;

				/**
				 * Update the remaining balances and total paid values
				 **/
				loanBalance = loanBalance - payment;
				principalBalance = principalBalance - principalPaidThisMonth;
				totalPrincipalPaid = totalPrincipalPaid + principalPaidThisMonth;
				interestBalance = interestBalance - interestPaidThisMonth;
				totalInterestPaid = totalInterestPaid + interestPaidThisMonth;

				/**
				 * Print row of table.
				 */
				System.out.printf("%20.2f\t%25.2f\t%20.2f\n", principalBalance,
						interestPaidThisMonth, totalInterestPaid);
			}
		}

		/*
		 * Formula for calculating payments for mortgage
		 */


	}
}

