package edu.uop.troytuckett.examples;

public class Constructors {

    public static void main(String args[]) {
	WithConstructors wc1 = new WithConstructors(123);
	WithConstructors wc2 = new WithConstructors();
    }
}

class WithConstructors {
    
    int myNumber;
    
    public WithConstructors(int myNumber) {
	this.myNumber = myNumber;
    }
}