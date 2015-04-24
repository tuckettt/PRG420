package edu.uop.troytuckett.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Week4 {

    /*  •	The application will now compare the total annual compensation of at least two salespersons.
    •	It will calculate the additional amount of sales that each salesperson must achieve to match or exceed the higher of the two earners.
    •	The application should ask for the name of each salesperson being compared. */

    public static void main(String args[]) {

	final int arraySize = 2;

	//Add sales persons and total compensation to array
	ArrayList <Salesperson> myArray = new ArrayList();
	Scanner input = new Scanner(System.in);

	System.out.println("Please enter information for two sales people");
	for(int c=0;c<arraySize;c++) {
	    String tempName="";
	    double tempSales=0;

	    System.out.print("Enter sales person name: ");
	    tempName = input.next();

	    System.out.print("Enter annual sales: ");
	    tempSales = input.nextDouble();

	    myArray.add(new Salesperson(tempName,tempSales));	
	}    

	//Find highest
	Collections.sort(myArray);
	double highestSales = myArray.get(myArray.size()).annualSales;

	//calculate    
	Calculations calc = new Calculations();
	for(int c=0;c<(arraySize-1);c++) {
	    
	    System.out.println("The amount of sales that");


	}



    }
}

class Salesperson implements Comparable <Salesperson> {
    
    String name;
    double annualSales;
    
    public Salesperson (String name, double annualSales) {
	this.name = name;
	this.annualSales = annualSales;
    }
    
    public int compareTo(Salesperson anotherInstance) {
	return (int)((this.annualSales - anotherInstance.annualSales)*100);
    }

}

class Calculations {
    
    
    public double determineAdditionalSalesAmount(double Sales1, double Sales2) {
	return double;
    }
    
}


