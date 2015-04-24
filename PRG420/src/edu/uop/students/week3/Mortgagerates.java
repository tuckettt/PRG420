package edu.uop.students.week3;

/**Mortgagerates
*Created on December 31, 2011
*The base of this program is used with permission of the author Troy Tuckett. Portion of this program’s structure is used with permission from
*Mike Magruder II, team member
*The ‘try’ and ‘catch’ objects are derived from 
*http://www.java2s.com/Code/Java/Threads/Threadsleepandinterrupt.htm
*@author Jennifer Komlos 
*/
import java.text.DecimalFormat;		//library needed for the calculation
/*This creates the class of Mortgagerates and declares the variables needed. This class is used to determine the interest paid, and the balance of the loan for each monthly payment.*/

public class Mortgagerates
{
  	int    loanterm;		/*length of the loan*/
  	double loanrate;	/*interest divided by the months in a year*/
  	double payment;		/*monthly payment*/
  	double intpaid;		/*amtdue * loanrate*/
  	double amtdue;		/*balance of the loan*/
  	DecimalFormat df;	/*formatting decimals*/
/*This class sets the instances of Mortgagerates and divides it into 2 separate subclasses. Payment and payarray, plus the addition of the Interrupted class which is used with the try and catch commands.*/
	public static void main(String[] args)
	{
	 Mortgagerates Mortgagerates = new Mortgagerates();
	 Mortgagerates.payment();
	 Mortgagerates.payarray();
	 Mortgagerates Interrupted;
	 }
/*This class defines the values of the variables declared*/	 
	 public Mortgagerates()
	 {
	 loanterm = 360;		/*sets loan term to 360*/
	 loanrate = (0.0575/12);	/*figures interest by month*/
        payment = 0.0;		/*sets payment equal to 0*/
	  intpaid = 0.0;		/*interest paid is 0*/	
	   amtdue = 200000.0;	/*amount due or loan amount*/
	       df = new DecimalFormat("$0.00"); 
                                         /*sets the format to currency*/
	  }
/*The payment subclass area calculates the monthly payment*/
	 public void payment()
	 	{
		payment = amtdue * (Math.pow((1+loanrate),loanterm) 
               * loanrate)/(Math.pow(1+loanrate, loanterm)-1);
		}
		
	public void payarray()
	{		
/*the for loop iterates through based on the m increasing by one each time
until m=360, which is the last payment of the loan. After each iteration the loop displays a print out containing the month, balance, interest paid, and monthly payment. The output is formatted to the currency format. Because the output goes past the screen a sleep thread is added to display 30 lines at a time.*/	
		for (int m = 1; m <= 360; m++)
		{			 
 		 amtdue = amtdue;	/*this resets the amtdue to the new value*/
		intpaid = amtdue * loanrate;  /*this figures the interest paid                      	       amtdue = amtdue - (payment - intpaid);
                                     /*the new amount due on the mortgage*/	 	
			System.out.println("Month " + m + " Balance "   
                   + df.format(amtdue) + " Mortgage Paid "  
                   + df.format(payment) + " Interest Paid " 
                   +  df.format(intpaid));	
/*this is the display line that tells the user the month, balance, mortgage payment and interest payment*/
									
		if ( m % 30 == 0)	
/*this places a restriction on m to only pause when m is divisible by 30. This particular argument is saying the remainder of m divided by 30 is 0*/
		  {
			 try	
                     {
/*This causes the loop to pause for 1200 milliseconds before continuing
the outerloop*/						
			   Thread.sleep(1200);	
			   }
                    catch (InterruptedException ie)  
                       {
/*this throws an exception into the try clause by saying that if m is not divisible by 30 then end the try*/
			    }	
		   } /*end of if loop*/
		      
	     }/*End of for loop*/
     }/*End of method payarray*/
}/*End of program*/	
