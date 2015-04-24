package edu.uop.students.week4;

/**
This application will calculate the monthly payment of a $200,000 loan over
a 30 year term with 5.75% interest.  No graphical interface is included as the 
* user simply needs to provide the information designated
*/
import java.text.*;
import java.util.*;

public class AmortCalc {

	public static void main (String args[]) {
		
		Scanner scanner;
//class mortgagecalculator.java
/** The program will provide a designated space for the user to include their 
 loan information.  Once this information is given, the output will provide
 the financial information pertaining to their loan and fixed interest rate 
 which is already predetermined in the program.*/

System.out.println("Please include the loan amount in the space provided");
int loanAmount = scanner.nextInt();
double Principal = scanner.nextDouble();
System.out.println("Please include the interest rate, ");
double interestRate = scanner.nextDouble();
System.out.println("How many years will the duration of the loan be?");
int termInYears = scanner.nextInt();
double monthlyrate = interestRate/12;
int exponent = termInYears * 12;
for (int i = 1; i<(termInYears/12); i++){

}
double fden = (interestRate /12);
// System.out.println("balance after payment);
System.out.println("Loan of " + Principal + " with the interest rate of "
        + "5.35, 5.5. and 5.75%, ");
System.out.println( +interestRate + " and " + termInYears + " years to pay,");
System.out.println("The estimated monthly payment is " + Payment + "!");
}

}

/*
Source:
http://www.snippetit.com/2009/07/java-mortgage-payment-calculator/
http://learn-java-by-example.com/2010/java/simple-mortgage-calculator
http://www.troytuckett.info/uop/prg420/PRG%20420%20Video%20Lecture%20supplemental%20materials.doc
*/