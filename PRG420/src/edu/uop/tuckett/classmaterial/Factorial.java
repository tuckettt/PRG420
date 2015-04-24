package edu.uop.tuckett.classmaterial;

/*
 * Factorial.java
 *
 * Created on September 11, 2003
 * 
 * @author  Troy Tuckett
 * 
 */

/** Factorial provides four methods of performing the factorial calculation.
 *  These include using a Do/While loop, a For loop, a While loop, and
 *  recursion.*/
public class Factorial {
    
    /** main demonstrates the use of the Factorial methods */
    public static void main(String args[]) {
        Factorial f = new Factorial();
        
        System.out.println(f.factorialByDo(10));
        System.out.println(f.factorialByRecursion(10));
        System.out.println(f.factorialByFor(10));
        System.out.println(f.factorialByWhile(10));
    }
    
    /** Uses a Do/While loop to perform the factorial calculation.  Receives 
     *  a parameter which is the highest number in the product.  It returns
     *  the resulting calculation */
    int factorialByDo(int num) {
        int compute = 1;
        do {
            compute *= num;
            num--;           
        } while (num > 0);
        return compute;
    }
    
    /** Uses a While loop to perform the factorial calculation.  Receives 
     *  a parameter which is the highest number in the product.  It returns
     *  the resulting calculation */
    int factorialByWhile(int num) {
        int compute = 1;
        while (num > 0) {
            compute *= num;
            num--;
        }
        return compute;
    }
    
    /** Uses a For loop to perform the factorial calculation.  Receives 
     *  a parameter which is the highest number in the product.  It returns
     *  the resulting calculation */
    int factorialByFor(int num) {
        int compute = 1;
        for (;num>0;num--) 
            compute *= num;
        return compute;
    }
    
    /** Uses a Recursion to perform the factorial calculation.  Receives 
     *  a parameter which is the highest number in the product.  It returns
     *  the resulting calculation */
    int factorialByRecursion(int num) {
        if (num <=0) return 1;
        else return num * factorialByRecursion(num - 1);
    }
}
