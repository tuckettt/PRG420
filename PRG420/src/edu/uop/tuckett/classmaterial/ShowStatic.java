package edu.uop.tuckett.classmaterial;

public class ShowStatic {
    
   public static void main(String args[]) {
       
       MyStatic static1 = new MyStatic();
       System.out.println(static1);
       
       MyStatic static2 = new MyStatic();
       System.out.println(static1);
       System.out.println(static2);
       
       MyStatic static3 = new MyStatic();
       System.out.println(static1);
       System.out.println(static2);       
       System.out.println(static3);       
   }
}

class MyStatic {
    
    static int myStaticNumber = 0;
    
    public MyStatic() {
	myStaticNumber++;
    }
    
    public String toString() {
	return "myStaticNumber=" + Integer.toString(myStaticNumber);
    }
}
