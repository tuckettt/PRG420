package edu.uop.students.week5;

import java.text.DecimalFormat;
import java.util.Scanner;


public class MortChoice {


	public static void main(String[] args) {
	Scanner custinf = new Scanner(System.in);
	
		System.out.println ("Enter your full name:");    // scanner to enter the customer name
		System.out.println (custinf.nextLine ());
		System.out.println ("Enter your city and state:");   // scanner to enter customer address
		System.out.println (custinf.nextLine ()); 
		System.out.println ("Enter your loan terms in amount of years  " + (" "));    // scanner to enter term to run correct mortgage term

		//if  (7);
		System.out.println("Loan Terms are: ");
			double intrst, term,R1,monthpmt, R2;
			double inst = 5.35;
			double trm = 7;
			double pnum = 200000;
			double I = 1;
			
		  	intrst = inst / 100 / 12;               // formula to determine how many months of loan
		   	System.out.println ("");
			System.out.println ("Interest rate is " + (inst) + ".");    // print out interest rate
			term = trm * 12;
			DecimalFormat decFor3 = new DecimalFormat ("0");       //form number with no decimal
			System.out.println ("The term in years is " + decFor3.format (trm) + ".");  // print whole number
			System.out.println ("The principle amount is " + decFor3.format (pnum) + ".");   // print whole number
					
			I = Math.pow(intrst + 1,-term);         // determine monthly payment using math power of formula
	   		R1 = intrst * pnum;
	   		R2 = 1 - I;
	   		monthpmt = R1/R2;
	   		
	  
	   					
	   			
	   		
			DecimalFormat decFor = new DecimalFormat ("0.00");     // formulate decimal point for monthly payment
				System.out.println(" ");
				System.out.println("The monthly payment is "+ decFor.format (monthpmt) + "."); 
				
	 	
				DecimalFormat decFor2 = new DecimalFormat ("0.0000");
				  double prnc = 200000.00;
				  double finAmt= 240222.36;
				  double monpy = 2859.79;
				  double intr = 0.0048;
				  double totint;
				  double amount = 0;
				  double curBal;
									 
					for (int intpd=1; intpd<85; intpd++) {
						
						amount = prnc * Math.pow (1 + intr, intpd) - prnc; 
						curBal =finAmt - (monpy * intpd);
						
					System.out.println ("Payment number= " + intpd + "  Interest paid= " + decFor.format(amount) + "  Balance= " + decFor.format(curBal)); }
									 
				 	totint = monpy * term - prnc;                      //interest paid over course of loan
					curBal = finAmt - (monpy * 84);
					System.out.println("These are your payments, interest paid, and balance!" +  " Total paid = " + decFor.format (totint) + "  Balance= " + decFor.format(curBal));
				 	System.out.println ("PRESS ENTER");
				 	System.out.println (custinf.nextLine ());   // print stops cust needs to press enter to continue
				 	
				 	
	//if (15);
	double intrst2, term2,R12,monpy2, R22;
	double inst2 = 5.50;
	double trm2 = 15;
	double pnum2 = 200000;
	double I2 =1;
	
  	intrst2 = inst2 / 100 / 12;               // formula to determine how many months of loan
   	System.out.println ("");
	System.out.println ("Interest rate is " + (inst2) + ".");    // print out interest rate
	term2 = trm2 * 12;
	System.out.println ("The term in years is " + decFor3.format (trm2) + ".");  // print whole number
	System.out.println ("The principle amount is " + decFor3.format (pnum2) + ".");   // print whole number
			
	I2 = Math.pow(intrst2 + 1,-term2);         // determine monthly payment using math power of formula
		R12 = intrst2 * pnum2;
		R22 = 1 - I2;
		monpy2 = R12/R22;
		
		System.out.println(" ");
		System.out.println("The monthly payment is "+ decFor.format (monpy2) + "."); 
		

		  double finAmt2= 294150.60;
		  double intr2 = 0.0046;
		  double totint2;
		  double amount2 = 0;
		  double curBal2;
		 	
			for (int intpad=1; intpad<181; intpad++) {
				
				amount2 = pnum2 * Math.pow (1 + intr2, intpad) - pnum2; 
				curBal2 =finAmt2 - (monpy2 * intpad);
				
			System.out.println ("Payment number= " + intpad + "  Interest paid= " + decFor.format(amount2) + "  Balance= " + decFor.format(curBal2)); }
		 			 
		 	totint2 = monpy2 * term2 - pnum2;                      //interest paid over course of loan
			curBal2 = finAmt2 - (monpy2 * 180);
			
		 	System.out.println("These are your payments, interest paid, and balance!" +  " Total interest paid = " + decFor.format (totint2) + "  Balance= " + decFor.format(curBal2));
		 	System.out.println ("PRESS ENTER");
		 	System.out.println (custinf.nextLine ());   // print stops cust needs to press enter to continue
		
		
		 	//if (30);
			double intrst3, term3,R13,monthpmt3, R23;
			double inst3 = 5.75;
			double trm3 = 30;
			double pnum3 = 200000;
			double I3 = 1;
			
		  	intrst3= inst3 / 100 / 12;               // formula to determine how many months of loan
		   	System.out.println ("");
			System.out.println ("Interest rate is " + (inst3) + ".");    // print out interest rate
			term3 = trm3 * 12;
			System.out.println ("The term in years is " + decFor3.format (trm3) + ".");  // print whole number
			System.out.println ("The principle amount is " + decFor3.format (pnum3) + ".");   // print whole number
		 	System.out.println ("PRESS ENTER");
		 	System.out.println (custinf.nextLine ());   // print stops cust needs to press enter to continue
					
			I3 = Math.pow(intrst3 + 1,-term3);         // determine monthly payment using math power of formula
	   		R13 = intrst3 * pnum3;
	   		R23 = 1 - I3;
	   		monthpmt3 = R13/R23;
	   		
	  
	   					
	   			
	   		
				System.out.println(" ");
				System.out.println("The monthly payment is "+ decFor.format (monthpmt3) + "."); 
				
	 			  double finAmt3= 420174.00;
				  double monpy3 = 1167.15;
				  double intr3 = 0.0048;
				  double amount3 = 0;
				  double curBal3;
									 
					for (int intpaid=1; intpaid<90; intpaid++) {
						
						amount = pnum3 * Math.pow (1 + intrst3, intpaid) - pnum3; 
						curBal3 =finAmt3 - (monpy3 * intpaid);
						
					System.out.println ("Payment number= " + intpaid + "  Interest paid= " + decFor.format(amount3) + "  Balance= " + decFor.format(curBal3)); }
				  	System.out.println ("PRESS ENTER");
				 	System.out.println (custinf.nextLine ());   // print stops cust needs to press enter to continue
					 	 	
					for (int intpaid=91; intpaid<=180 ;intpaid++)  {                       //show next 90 payments
						
						double amountx = 106278.66;
						double prnc2 = pnum3 - amountx;
						amount = prnc2 * Math.pow(1 + intr3, intpaid) - prnc2;
						curBal3 = finAmt3 - (monpy3 * intpaid);
						System.out.println ("Payment number= " + intpaid + "  Interest paid= " + decFor.format(amount) + "  Balance= " + decFor.format(curBal3));}
			        	System.out.println ("PRESS ENTER");
			        	System.out.println (custinf.nextLine ());             //cust must press enter to continue
					 
				for (int intpaid=181; intpaid<=270; intpaid++)  {                        //show next 90 payments
					
					double amounty = 128185.78;
					double prnc3 = amounty - 93721.34;
					amount = prnc3 * Math.pow(1 + intr3, intpaid) - prnc3;
					curBal3 = finAmt3 - (monpy3 * intpaid);
					System.out.println ("Payment number= " + intpaid + "  Interest paid= " + decFor.format(amount) + "  Balance= " + decFor.format(curBal3)); }
			     	System.out.println ("PRESS ENTER");
					System.out.println (custinf.nextLine ());              //cust must press enter to continue
				 
				for (int intpaid=271; intpaid<360; intpaid++) {                           //show next 90 payments
					
					 double amountz = 61643.27;
					double prnc4 = amountz - 34464.44;
					amount = prnc4 * Math.pow(1 + intr, intpaid)- prnc4;
					curBal3 = finAmt3 - (monpy3 * intpaid);
					System.out.println ("Payment number= " + intpaid + "  Interest paid= " + decFor.format(amount)); }
					System.out.println ("PRESS ENTER");
					System.out.println (custinf.nextLine ());             //cust must press enter to continue
			 				
					curBal3 = finAmt3 - (monpy3 * 360);
				 	System.out.println("This is the last of your payment information!" +  " Total interest paid = " + decFor.format (totint) + "  Balance= " + decFor.format(curBal));}

		
	}

