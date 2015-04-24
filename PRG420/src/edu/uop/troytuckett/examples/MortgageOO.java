package edu.uop.troytuckett.examples;

import java.text.*;

class AData {
	
	int term;
	double interest;
	double principle;
	double balance;

}

public class MortgageOO {
	
	double principle;
	double rate;
	int term;
	
	public static void main(String args[]) {
		
		MortgageOO mort = new MortgageOO();
		mort.printAmortArray(mort.buildAmortArray(200000, 5.75, 30));
		
	}
	
	public void printAmortArray(AData[] array) {
		
		DecimalFormat nf = new DecimalFormat("000");
		DecimalFormat df = new DecimalFormat("$0.00");
		
		
		System.out.println("Term\tPrinciple\tInterest\tBalance");
		
		for (int c = 0;c < array.length; c++) {
			System.out.println(nf.format(array[c].term)+'\t'+df.format(array[c].principle)+"\t\t"+df.format(array[c].interest)+"\t\t"+df.format(array[c].balance));
		}		
	}
	
	public AData[] buildAmortArray(double principle,double rate, int term) {
		
		double tempRate = rate*.01/12;
		int tempTerm = term * 12;
		
		double balance = principle;
		AData[] array = new AData[tempTerm];
		
		for (int t=0; t < tempTerm; t++) {
			
			array[t] = new AData();
			
			array[t].term = t;
			array[t].interest = balance * tempRate;
			array[t].principle = calcPayment(principle,tempRate,tempTerm) - array[t].interest;			
			array[t].balance = balance;
			
			balance -= array[t].principle;		
			
			//System.out.println(array[t].term);
			//System.out.println(array[t].interest);
			//System.out.println(array[t].principle);
			//System.out.println(array[t].balance);
			
		}
		
		return array;				
	}
	
	public double calcPayment(double principle,double rate, int term) {
		return principle * (Math.pow((1+rate), term) * rate)/(Math.pow(1+rate, term)-1);
	}
}