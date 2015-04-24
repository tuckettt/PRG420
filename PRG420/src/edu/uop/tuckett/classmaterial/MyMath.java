package edu.uop.tuckett.classmaterial;

/*
 * MyMath.java
 *
 * Created on September 11, 2003, 9:01 PM
 *
 * @author  Troy Tuckett
 */

/** This class sets two numbers in its main method and then calls add, subtract,
 *  multiply, and divide methods to perform calculations.  It then prints the
 *  results.
 */
public class MyMath {                           // remember everything in java is in 
                                                // class(object)
    
    /** Creates a new instance of MyMath */
    public static void main(String args[]) {    // main is the method that is
                                                // automatically called when the
                                                // program is run
        
        int firstNumber  = 20;                  // we declare and set values
        int secondNumber = 10;                  // dido
        
        MyMath m = new MyMath();                // We must first create a MyMath
                                                // object to use to call the methods
                                                // and make calculations (this
                                                // creation is called instantiation)
        
        /* the next 4 lines of code print out our calculations.  They call each
         * of the different methods, pass in our first and second number
         * variables, and print the resulting number that is returned */
        System.out.println(firstNumber + " + " + secondNumber + " = " + 
                m.addNumbers(firstNumber, secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + 
                m.subtractNumbers(firstNumber, secondNumber));
        System.out.println(firstNumber + " X " + secondNumber + " = " + 
                m.multiplyNumbers(firstNumber, secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                m.divideNumbers(firstNumber, secondNumber));
    }
    
    /** This method adds two numbers together that were passed as parameters*/
    int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    
    /** This method subtracts two numbers that were passed as parameters*/
    int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    /** This method multiplies two numbers that were passed as parameters*/
    int multiplyNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    
    /** This method divides two numbers that were passed as parameters*/
    int divideNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }   
 } 