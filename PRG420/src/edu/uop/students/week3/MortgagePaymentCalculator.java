package edu.uop.students.week3;

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
    Loan loans = new Loan(200000, 0.0575, 30);

    // print start information
    Date todaysDate = new Date();
    System.out.println ("Week 3 Home work [Edit you Name Here ] : SR-mf-03, Change Request 1 ");
    System.out.println ("Executed on: " + todaysDate);



        // calculate monthly payment and display
        double monthlyPayment = ComputeMonthlyPayment(loans.principal, loans.interestYearly, loans.lengthInYears);
        DisplayMonthlyPayment(loans.principal, loans.lengthInYears, loans.interestYearly, monthlyPayment);


   }

  /************************************************
   * Method to Display Payment
   ******************************************************/
 public static void DisplayMonthlyPayment(double total, int years, double rate, double monthlyPayment)
  {
    // use currency format for current default locale
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    System.out.println ("");
    System.out.println ("For the loan amount " + nf.format(total) + " over " + years +
            " years term at " + (rate * 100) + "% interest rate");
    System.out.println ("Monthly Payment Amount is: " + nf.format(monthlyPayment));

    double mrate = ComputeMonthlyInterest(rate);
    for (int i = 1; i <= years; i++)
    {
      for (int m = 1; m <= 12; m++)
      {
        // calculate interest paid
        double interest = total * mrate;
        // calculate left loan amount
        total -= (monthlyPayment - interest);

        // print loan balance and interest paid for each payment
        System.out.printf ("%2d Year %2d Month : loan balance paid is %s\t interest paid is %s\n",
                i, m, nf.format(monthlyPayment - interest), nf.format(interest));
        // wait
        waitScroll();
      }

    }
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
  /************************************************
   * Method to prevent scrolling off the screen
   ******************************************************/
  public static void waitScroll()
  {
    try
    {
      Thread.sleep(200);
    } catch (InterruptedException e)
    {
      e.printStackTrace();
    }
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

