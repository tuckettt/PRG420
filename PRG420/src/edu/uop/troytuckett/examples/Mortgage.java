package edu.uop.troytuckett.examples;

public class Mortgage {
		
	public static void main (String args[]) {
	
		double principle = 200000.00;
		double rate[] = {5.35,5.5,5.75};
		int term[] = {7,15,30};

		for (int index=0;index<rate.length;index++) {
			
			double lRate = (rate[index]*.01)/12;
			int lTerm = term[index]*12;
			
			System.out.println("Principle="+principle);
			System.out.println("Rate="+rate[index]);
			System.out.println("Term="+term[index]);
			System.out.println("Payment="+calcPayment(principle,lRate,lTerm));
						
		}		
	}
	
	public static double calcPayment(double principle,double rate, double term) {
		return principle * (Math.pow((1+rate), term) * rate)/(Math.pow(1+rate, term)-1);
	}	
}
