package edu.uop.students.week4;

import java.io.*;    //This is the Java API Library Input/Output package (Data streams, Filesystem, Serialization)
import java.util.*;  //This is the Java API Library Utilities package (Collections, Event model, Date/time, International support)
import java.text.*;  //This is the Java API Library Text Utitilies package (Text, Dates, Numbers, Messages)


public class MFCalculatorCR2  //This begins the Calculator class. Public and class are keywords, while MFCalculatorCR2 is the identifier.
{
	public static void main(String[] args)  //Defines the method of the main class.
	{

		//This declares the variables and defines the hard coded values.  This also begins the array.
		double principal = 200000.00; 
		double[] rate = {0.0535, 0.055, 0.0575};
		int[] term = {7, 15, 30};									
		DecimalFormat twoDigits = new DecimalFormat("$000.00");


		//This is the first output that displays the loan amount of $200,000
		System.out.println("With the loan amount of " + twoDigits.format(principal));
		System.out.println();		//This creates a blank or new line

		for (int i = 0; i < rate.length; i++)					//Loops through payments
		{


			//This is the second and third outputs that displays the term (in years) and annual interest rate
			System.out.println("for " + term[i] + " years");
			System.out.println("at an annual interest rate of " + rate[i]);


			double payment = (principal*(rate[i]/12))/(1-(Math.pow(1/(1+(rate[i]/12)),(term[i]*12))));//Mathematical calculation


			//This is the fourth output that displays the mortgage payment
			System.out.println("The monthly payment will be " + twoDigits.format(payment));
			System.out.println();		//This creates a blank or new line


		}		//This ends the loop

	}			//This ends the class "main"

}			//This ends the class "MFCalculatorCR2"




