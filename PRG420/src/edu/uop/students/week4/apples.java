package edu.uop.students.week4;

import java.util.Scanner;

class apples {

public static void main(String args []) {
		Scanner mortgage = new Scanner (System.in);
		double pnum, intrst, term, monthpmt, I, R1, R2,R ;
	 
		System.out.println ("Enter interest rate ");
		intrst = mortgage.nextDouble ();
		intrst = intrst / 100 / 12;		
		System.out.println ("Enter term in years ");
		term = mortgage.nextDouble ();
		term = term * 12;
		System.out.println ("Enter principle amount ");
		pnum = mortgage.nextDouble  ();			
		I = (1 + intrst) * term;
		R1 = intrst * I;
		R2 = I - 1;
		R = R1 / R2;
		monthpmt = pnum * R;
				System.out.print ("The monthly payment is ");
		System.out.println (monthpmt);
		
			
	}

}

