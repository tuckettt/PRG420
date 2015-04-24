package edu.uop.students.week5;

/**
 * The function of this application is to show the loan payments and 
 * calculations to fully amoritize a 200,000.00 dollar loan at different interest
 * rates and terms. Then display each payment and balance. 
 *@author Dennis Wade Singleton
 * PRG/420
 * January 30, 2012
 */
import java.math.*;
import java.lang.*;
import java.text.*; 


public class Week5IAPaymentCalculator {
    
    double ArrayPrincipal;
    double ArrayInterestRate;
    double ArrayTermOfLoan;
    double MonthlyInterestRate;
    double Payment;
    double PaidMonthlyInterest;
    
    
    
    public static void main(String[] args)  {
        
        Week5IAPaymentCalculator[] payarray = {
				new Week5IAPaymentCalculator(200000,7,.0535), 
				new Week5IAPaymentCalculator(200000,15,.055),
				new Week5IAPaymentCalculator(200000,30,.0575)
		};

		for (int dw = 0; dw < payarray.length; dw++) {
			payarray[dw].CalculateMonthlyPayment();
			System.out.format("Mortgage Agreement #%d\n",dw+1);
			payarray[dw].PrintCalculations();
			System.out.println("");
			try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
        
    }}


public Week5IAPaymentCalculator(double Principal, double TermOfLoan, double InterestRate){
       
    
        /**
         * Creating and initializing variables to 
         * be used in calculating the loan payment
         */
    ArrayPrincipal =Principal;
    
    ArrayTermOfLoan= TermOfLoan*12;
        
    ArrayInterestRate=InterestRate;
            
        
    MonthlyInterestRate = InterestRate/12;
    
    PaidMonthlyInterest=0;
    
    Payment=0;
        
    
}
/**
 * The following Object uses the classes established variables to calculate the payment to fully
 * amoritize the loan calculates the paid monthly interest and recalculates the principal after subtracting the payment minus the monthly interest
 */
    
public void CalculateMonthlyPayment(){
    
    
        
    Payment = (ArrayPrincipal*MonthlyInterestRate)/(1-(Math.pow((1+MonthlyInterestRate),-ArrayTermOfLoan)));
    
      
    PaidMonthlyInterest=ArrayPrincipal * MonthlyInterestRate;
    
 
    
  

     

}
/**
 *The following object has two major functions. The first is to create a counter to loop and recalculate the loan based on payments. 
 *The second Function is to print the results to the screen.
 */

public void PrintCalculations() {
    
    
    
    System.out.println("Payment,Principal,PaidMonthlyInterest");
		double RemainingBalance=ArrayPrincipal;
                
		for (int ws = 1; ws <= ArrayTermOfLoan; ws++) {
                    
                    RemainingBalance = (RemainingBalance-Payment+PaidMonthlyInterest);
                    
			PaidMonthlyInterest = MonthlyInterestRate * RemainingBalance;
			
			System.out.format("$%.2f,$%.2f,$%.2f", Payment, RemainingBalance, PaidMonthlyInterest);
                        System.out.println();
                
			
        }
}}



