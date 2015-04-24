package edu.uop.students.week4;

/**************************************
 * Formula to calculate monthly payment
 * ************************************
 *
 *                            Principal + InterestMontly
 * MonthlyPayment = --------------------------------------------
 *                  1 - (1+ InterestMonthly) ^ -NumberOfPayments
 *
 *
 *Principal = The initial amount of the loan
 *InterestYearly = The annual interest rate (from 1 to 100 percent)
 *InterestMonthly = monthly interest in decimal form = interestYealy / (12 * 100)
 *LengthInYears = the length (in years) of the loan
 *NumberOfPayments = number of months over which loan is amortized = L * 12
 *
 *
 *
 *
 *InterestMonthly = InterestYearly / (12.0*100.0)
 *NumberOfPayments = LengthInYears *12
 *MonthlyPayment = (Principal * InterestMonthly) / (1.0 - (Math.pow(1.0 + InterestMonthly, - NumberOfPayments)))
 *
 *
 *
 *
 *Importing Date class
 */

import java.text.NumberFormat;
import java.util.Date;

//Demonstrates a public Class
// File name is MortgagePaymentCalculator.java
public class MortgagePaymentCalculator
{
  // Calculate the MortgagePaymentCalculator method
  public static void main(String[] args){
    // Initial Conditions
	// declares variables and defines hard coded values
    // array of loan data
    Loan loans[] = new Loan[3];
    loans[0]= new Loan(200000, 0.0535, 7);
    loans[1]= new Loan(200000, 0.0550, 15);
    loans[2]= new Loan(200000, 0.0575, 30);

    // print start information
    Date todaysDate = new Date();
    System.out.println ("Week 4 Home work [Edit you Name Here ] : SR-mf-03, Change Request 2 ");
    System.out.println ("Executed on: " + todaysDate);



    // calculate monthly payment and display
    for(int i=0;i<loans.length;i++)
    {
    	double monthlyPayment = ComputeMonthlyPayment(loans[i].principal, loans[i].interestYearly, loans[i].lengthInYears);
    	DisplayMonthlyPayment(loans[i].principal, loans[i].lengthInYears, loans[i].interestYearly, monthlyPayment);
    }


   }

  /************************************************
   * Method to Display  Payment
   ******************************************************/
  public static void DisplayMonthlyPayment(double total, int years, double rate, double monthlyPayment)
  {
    // use currency format for current default locale
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    System.out.println ("");
    System.out.println ("For the loan amount " + nf.format(total) + " over " + years +
            " years term at " + (rate * 100) + "% interest rate");
    System.out.println ("Monthly Payment Amount is: " + nf.format(monthlyPayment));
  }

  /************************************************
   * Method to calculate and Return the Monthly Payment
   ******************************************************/
  public static double ComputeMonthlyPayment(double principal, double interestYearly, int lengthInYears)
  {
    double interestMonthly = 0;  // Interest paid Each Month
    double numberOfPayments = 0;

    interestMonthly =  ComputeMonthlyInterest( interestYearly );
    numberOfPayments = lengthInYears * 12.0;
    //  Apply the method outlined above
    //  Demonstrates using the power function of the Math class
    return (principal * interestMonthly) / (1.0-(Math.pow((1.0 + interestMonthly),-numberOfPayments)));
  }


  /*****************************************
   * Method to compute the Monthly Interest
   **********************************************/
  public static double ComputeMonthlyInterest( double interestYearly)
  {
    return interestYearly / (12.0);
  }
}
  
//Loan class store loan data
class Loan
{
    // principal is the amount of the loan
    double principal;

    // interestYearly is the year interest of the loan
    double interestYearly;

    // lengthInYears is the term of the loan in years
    int lengthInYears;

    // constructor
    public Loan(double principal, double interestYearly, int lengthInYears)
    {
        // initialize member instance
        this.principal = principal;
        this.interestYearly = interestYearly;
        this.lengthInYears = lengthInYears;
    }
}
