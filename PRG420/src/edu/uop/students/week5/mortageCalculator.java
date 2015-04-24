package edu.uop.students.week5;

import java.text.NumberFormat;
import java.util.Locale;

/**
*
* @author Justin Lien
*/

//public specifies that the method is accessible from outside 
//the mortageCalculator class
public class mortageCalculator {
  // static specifies that the method is a class method that is to
  // be executable, even though no class objects have been created.
   public static void main(String[] args) {
       // create object
       mortageClass obj = new mortageClass();
       // init my objects
       obj.calcPayment();
   }
}


/*
* McBride Financial Services Mortgage Calculator
* Here are my class of objects.
*/


/**
*
* @author Justin
*/

class mortageClass {
   double  P = 200000;                         // Principal (loan amount)
   int     term = 30;                          // years of loan
   int     n = term * 12;                      // number of payments
   double  rate = .0575;                       // interest rate
   double  interest = rate / 12;               // interest per year
   double  mathPow = Math.pow(1+interest, n);  // this handles (1 + i)^n formlua part
   double  M;                                  // montly payment
   Locale  locale = Locale.US;                 // set locale to US
   
   public void calcPayment() {
       /*
       * Formula taken from: http://www.ifitbreaks.com/interest.htm
       * M = P [ i(1 + i)^n ] / [ (1 + i)^n - 1]
       * M = The monthly payment
       * P = The principal, or the amount of money being borrowed
       * i = The interest for each compounding period, or the interest per month for a standard mortgage
       * n = The number of compounding periods, or the number of months for a standard mortgage
       */
       
       // using mathPow to simplified power formula
       // the equation has been rewritten
       
       M = P * ( interest*mathPow ) / ( mathPow - 1 );
       
       // pass P, interest, n, and M var to showPayment
       showPayment( P, interest, n, M );
   }
   
   void showPayment(double P, double interest, int n, double M) {
       
       // new payment
       double monthlyInterest;
       
       System.out.println(
           "Loan amount: " + NumberFormat.getCurrencyInstance(locale).format(P) +
               "\nMonthly payment: " + 
               NumberFormat.getCurrencyInstance(locale).format(M) + "\n"
       );
       
       // loop until n (month) is 0 or payment is paid off
       for (int i = 1; i <= n/15; i++){
           int count = 0;
           System.out.flush();
           // pause 3 seconds
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               // pushing done
               // fix taken from http://www.javaspecialists.co.za/archive/Issue056.html
               Thread.currentThread().interrupt();
               break;
           }
           
           // display 15 reults at a time
           for (int ii = 1; ii <= 15; ii++) {
               P = ( P - (M - (P * interest) ) );
               monthlyInterest = ( P * interest );
               System.out.print(
                   "Current balance: " + 
                       NumberFormat.getCurrencyInstance(locale).format(P) +
                   " Interest paid this month: " + 
                       NumberFormat.getCurrencyInstance(locale).format(monthlyInterest) +
                   "\n"
               );
           }
           System.out.print("\n");
       }
   }

}

