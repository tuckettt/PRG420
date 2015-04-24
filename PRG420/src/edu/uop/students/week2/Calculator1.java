package edu.uop.students.week2;

import java.text.DecimalFormat;
 
public class Calculator1

	{
	
	 public static void main(String[] args)

		/*Start to Declare Variables Needed for Calculation*/

	{
		 int L = 200000;                 		/*L stands for Loan Amount*/
		 int Y = 30;					/*Y stands for the number of years on the loan*/
		 int CalendarMonths = 12; 			/*CalendarMonths are how many months in a year*/
		 int M = (Y * CalendarMonths);      	 	/*M stands for the total number of Months*/
		 Double I = .0575;               		/*I stands for the Interest of the Loan*/
		 Double MonthlyPayment = .0;    		/*Stands for NUmber depicting Monthly payment*/
		 Double Mikeponent = Math.pow((1 + I),M);	/*Handles Exponential math for Formula*/	
		 Double Division = .0;


			//Perform Calculation
		
			
			Division = (I * Mikeponent) / (Mikeponent - 1);
			MonthlyPayment = L * Division;

		 
		System.out.println (MonthlyPayment);
		
		double monthlyPayment;
		I = I / 12;
		monthlyPayment = L * Math.pow(1 + I, M) * I / (Math.pow(1 + I, M) - 1);

		System.out.println(monthlyPayment);
	}
	}