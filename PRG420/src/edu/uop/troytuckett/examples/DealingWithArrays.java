package edu.uop.troytuckett.examples;

public class DealingWithArrays {
	
	int larray[] = {1,2,3,4,5,6};
	
	public static void main(String args[]) {
	
		int narray[] = new int[6];
	
		narray[0] = 1;
		narray[1] = 2;
		narray[2] = 3;
		narray[3] = 4;
		narray[4] = 5;		
		narray[5] = 6;
		
		for(int index=0; index<6; index++)
			narray[index] = index+1;
		
		for(int index=0; index<6; index++)
			System.out.println(narray[index]);
	}

}
