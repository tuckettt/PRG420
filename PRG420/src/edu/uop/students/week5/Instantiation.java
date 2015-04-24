package edu.uop.students.week5;

public class Instantiation {
	
	int[] myArray;
	
	public static void main(String args[]) {
		
		Instantiation i = new Instantiation(5);
	}
	
	public Instantiation(int size) {
		
		myArray = new int[size];
		
		for (int c=0;c<size;c++) {
			myArray[c] = size*100;
		}		
		
	}	
}


void myMethod() {
	
	System.out.println("here ha go");		
}
