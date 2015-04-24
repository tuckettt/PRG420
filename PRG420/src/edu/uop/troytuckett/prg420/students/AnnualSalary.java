package edu.troytuckett.prg420.students;

import java.util.Scanner;


public class AnnualSalary {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
   
   //Create a keyboard scanner for data input  
   Scanner keyboard = new Scanner(System.in);
   SalesSalary mySalesSalary = new SalesSalary();
   
       
   //Prompt user to input current amount of their annual sales
   System.out.print("Please input the amount "
   + "of your current annual sales: ");
   double annualsales = keyboard.nextDouble();
   
   //call the setAnnualSales method and pass the input to annualsales variable
   mySalesSalary.setAnnualSales( annualsales );
   }
   
}

class SalesSalary {
    
    //Declare the variables as double data type
    private double commissionsalary, annualsales, 
            percentcommission, base, totalsalary;

    public void setAnnualSales(double annualsales) {
/*calculate the total amount of commission they will recieve using 
 *the user input of annual sales from main class
 */
    percentcommission = 0.13;
    commissionsalary = percentcommission * annualsales;
    
    //display the calculated commission
    System.out.println("Your total commission is: $" + commissionsalary);
    
    //set value of $51,000 the fixed base salary to base variable and display it      
    base = 51000.00;
    
    System.out.println("Your fixed base salary is: $" + base);
    
    //Calculate total salary base + commission and display it
    totalsalary = base + commissionsalary;
    
    System.out.println("Your total base salary is: $" + totalsalary);        
    }
    
}

