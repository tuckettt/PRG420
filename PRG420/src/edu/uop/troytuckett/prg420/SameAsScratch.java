package edu.troytuckett.prg420;

import java.util.*;


public class SameAsScratch {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number");
		int answer = input.nextInt();
		
		int myVariable = answer;
		
		Random rand = new Random();
		myVariable = (1+rand.nextInt(10)) * 5;
		
		System.out.println(myVariable);
		
		
	}

}
