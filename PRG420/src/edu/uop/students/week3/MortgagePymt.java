package edu.uop.students.week3;

/*
 * Assignment: Week 3 IA
 * Programmer: Jody Westendorf
 * Date: March 12, 2012
 * Filename: MortgagePymt.java
 * Purpose: This program is written for McBride Financial Services, requested by 
 * Dwain Hammer. The program is designed to list the payment amounts per month, the 
 * amount of interest for that month, and balance after that payment.
 */


import java.text.DecimalFormat;

/**
 * @author a510143
 *
 */
public class MortgagePymt {
    
 /**
 * @param args
 */
public static void main(String args[]) {
         int term = 360; // number of monthly payments for 30 year mortgage
         double balance = 200000.00; // total amount due principal + interest
         double monthlypymt = 1167.15; // monthly payment amount
         double princpymt = 555.56; // amount monthly payment applied to principal
         double intrstpymt = 611.59; //amount of monthly payment applied to interest
         double rembalance = balance - princpymt; 
         DecimalFormat df= new DecimalFormat("$0.00");
         
         
                
         int count = 1;
         while (count <= 360) {
                  
           
	         try{
	             Thread.sleep(3000); 
	         }
	         catch(InterruptedException ie){
	        	 System.out.println("Error");
	         }
	         
        
              
             
         System.out.println("Total payment is $" + monthlypymt);
         System.out.println("Total amount of payment applied to principal is $" +
                             princpymt);
         System.out.println("Total amount of payment applied to interest is $" +
                             intrstpymt);
         System.out.println("Remaining mortgage balance is $" + rembalance);
    
         }
         
         }
         
   }