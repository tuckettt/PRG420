package edu.uop.troytuckett.examples;

class JustData {
	
	private int myData;
	
	JustData (int myData) {	// this is called a constructor.
		this.myData = myData;
	}
	
	private int getMyData() { // this is only accessible within the class.
		return myData;
	}
	
	public int showMyData() { // this one is accessible outside the class.
		return myData;
	}
}

public class PrivateAndPublic {

	public static void main(String args[]) {
		
		JustData justData = new JustData(123); // justData is an object that I have
											   // created from the JustData class.
		
		// System.out.println(justData.getMyData());  -- This generates a compile-time error
		
		System.out.println(justData.showMyData()); //-- This one works fine.
	}	
}
