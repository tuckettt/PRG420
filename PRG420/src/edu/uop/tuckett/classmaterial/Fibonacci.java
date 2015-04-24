package edu.uop.tuckett.classmaterial;

/*
 * Fibonacci.java
 *
 * Created on September 11, 2003
 *
 * @author  Troy Tuckett
 */

/** This class calculates and displays the fibonacci numbers less than a number 
  * specified */
public class Fibonacci {
    
    /** The main method declares and defines the maximum fibonacci number.  It
      * then uses the fibonacci class to call the calculate method that computes
      * and prints the fibonacci numbers.*/
    public static void main(String args[]) {  // this is the method that is
                                              // automatically called when the 
                                              // program is run

        int maxNumber = 1000;                 // we determine the variable name and type
                                              // and the value of the maximum number in the
                                              // list of fibonacci numbers
        
        Fibonacci f = new Fibonacci();        // We must create a Fibonacci object to use to
                                              // call its methods to generate the numbers and
                                              // to print (again, this is called instantiation)
        
        f.calculateFibonacci(maxNumber);      // Call the calculate method that will 
                                              // calculate the numbers and print
        
        System.out.println(f.fibonacciRecur(7));
    }

    /** This method calculates the fibonacci numbers and calls the print method to print each*/
    void calculateFibonacci(int maxNumber) {
       int firstNumber  = 0;                  // delares and initializes the first fibonacci number
       int secondNumber = 1;                  // delares and initializes the second fibonacci number
       int answer = 0;                        // delares and initializes the answer variable
       
       /* print the first two numbers */
       printFibonacci(firstNumber);          
       printFibonacci(secondNumber);
              
       do  {          
           answer = firstNumber + secondNumber; // the new answer is the sum of the first two
           
           firstNumber = secondNumber;          // we now set the new first two moving up the
           secondNumber = answer;               // line to the next two numbers
            
           if (answer > maxNumber)              // we check to see of we have reached our max
               break;                           // of so, we exit the do loop
            
           printFibonacci(answer);              // if we are still in range, we print the number
       } while(true);                           // this is an endless do/while loop.  It will run
    }                                           // forever.
    
    /** This is a separate method that calculates fibonacci numbers using recursion.  
     *  It will provide the element at the position specified.
     */
    int fibonacciRecur(int number) {
	System.out.println(number);
	if(number==0)
	    return 0;
	else
	    if(number==1)
		return 1;
	    else
		return fibonacciRecur(number - 1) + fibonacciRecur(number - 2);
    }

    /** This method prints each fibonacci number
     */
    void printFibonacci(int printNumber) {
        System.out.println(printNumber);        
    }
}