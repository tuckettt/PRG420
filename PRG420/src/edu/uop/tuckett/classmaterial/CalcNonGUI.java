package edu.uop.tuckett.classmaterial;

/*
 * CalcNonGUI.java
 * Created on Mar 2, 2007
 * 
 * The following code is the sole property of Troy Tuckett, and
 * contains its proprietary and confidential information.  This code
 * is used under license.  No reproduction of this code may be made
 * in any form without the express written consent of the owner.
 *
 * Copyright (c) 2007, Troy Tuckett, Salt Lake City, UT, U.S.A.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/** This class uses two classes included in this file to illustrate how to 
 *  instantiate and work with other classes.  Class CalcNonGUI asks for two 
 *  numbers and passes them to Class CNumbers.  Then, this class asks 
 *  CNumbers to calculate the product.  This class also uses a separate
 *  utility method in class called MyUtilities to perform the input function. 
 *  
 *  This program illustrates two ways of using other classes.  The first is true
 *  object instantiation.  This is the way you normally use classes.  It is 
 *  illustrated using the CNumbers class.  The second method uses a static 
 *  method called getStringInput() which is part of the MyUtilities class.  
 *  Because it is static, we can access it directly without instantiation.
 */
public class CalcNonGUI {
    
    public static void main(String args[]) {
        CNumbers c = new CNumbers();    //Instantiates CNumbers now we can
                                        //use it through its object, c
        
        boolean done = false;           //Used to determine if done with loop
        
        // loops until the user doesn't want to continue. Until done is true
        while(!done) {
            
            System.out.print("\nEnter a number to multiply ");       
            
            //Gets input from the keyboard and converts the string to a float
            float results = Float.parseFloat(MyUtilities.getStringInput());
            c.setNumberOne(results); //sets the value in CNumbers
           
            System.out.print("\nEnter another number to multiply ");
            
            //Gets input from the keyboard and converts the string to a float
            results = Float.parseFloat(MyUtilities.getStringInput());
            c.setNumberTwo(results); //sets the value in CNumbers
            
            
            //Requests calculated number from CNumbers and displays
            System.out.println("\nThe product of these numbers is " + 
				  c.calculateNumbers());
            
            System.out.print("\nDo you want to try it again? ");
            
            //Gets input from keyboard to decide to continue asking questions
            String checkDone = MyUtilities.getStringInput();
            
            //Determines whether to continue looping
            if (checkDone.equals("N")|| checkDone.equals("No")) 
                done = true; // when done is true, loop stops.
        }
    }
}

/** Calculating engine.  Takes two numbers through its "setter" methods and then
 *  performs multiplication using CalculateNumbers() method
 */
class CNumbers {
    
    private float numberOne;
    private float numberTwo;
    
    public CNumbers() {
	numberOne=0;
	numberTwo=0;
    }

    public void setNumberOne(float numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(float numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public float calculateNumbers() {
        return numberOne * numberTwo;
    }
}

/** A utility class that currently includes one static method to gather input
 *  from the keyboard and return it to the calling program.
 */
class MyUtilities {
    
    // Setting up standard input
    static Scanner stdin = new Scanner(System.in);
       
    public static String getStringInput() {
            return stdin.next();
    }    
}
