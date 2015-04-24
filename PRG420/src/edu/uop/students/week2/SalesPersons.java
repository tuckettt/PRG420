package edu.uop.students.week2;

/**
*
* @author Owner
*/
import java.util.Scanner;
public class SalesPersons {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       
      double fixedSalary = 51000;
      double commissionRate = .13;
      double annualSales = 0;
      double totalAnnualCompensation = 0;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Annual Sales: ");
      annualSales = input.nextDouble();

      totalAnnualCompensation = 51000 + (annualSales * .13);
      System.out.println("Your Total Annual Compensation is: " + totalAnnualCompensation);              
      
  }
}


/**
*
* @author Shari McCollum
*/
class TotalAnnualComp {
   
   public double totalAnnualCompensation = 51000 + (0 * .13);
   
}

