package edu.uop.troytuckett.examples;

public class StaticvsFinal {

    public static void main(String args[]) {
	
	Constants constantsObj1 = new Constants(234);
	constantsObj1.classVariable = 123;
	Constants constantsObj2 = new Constants(345);
	Constants constantsObj3 = new Constants(456);
	
	System.out.println("Object 1, class variable " + constantsObj1.classVariable);
	System.out.println("Object 2, obj constant " + constantsObj2.OBJCONSTANT);
	System.out.println("Object 3, obj constant " + constantsObj3.OBJCONSTANT);
	System.out.println("Object 3, class variable " + constantsObj3.classVariable);	
    }
}

class Constants {
    final int OBJCONSTANT;		//can be initialized later
    static int classVariable; 	
    
    public Constants(int objConstant) {
	OBJCONSTANT = objConstant;
    }
}
