package edu.uop.troytuckett.examples;

import java.util.*;

/**
 * @author a510143
 *
 */
class MyClass {
	
	private String myString;
	
	/** 
	 * @param myString
	 */
	public MyClass(String myString) {
		this.myString = myString; 
	}
	
	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	public String getMyString() {
		return this.myString;
	}	
	
	public String toString() {
		return this.myString;
	}
}

public class WorkingWithArrays {
	
	public static void main(String args[]) {
	
		int myArray[] = {1,2,3,4,5};
		String myOtherArray[] = {"one","two","three","four","five"};
		
		for (int x: myArray)
			System.out.println(x);
		
		for (String x: myOtherArray)
			System.out.println(x);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		
		for (String x: al)
			System.out.println(x);
		
		
		ArrayList<MyClass> mc = new ArrayList<MyClass>();
		
		mc.add(new MyClass("111"));
		mc.add(new MyClass("222"));
		mc.add(new MyClass("333"));
		mc.add(new MyClass("444"));
		mc.add(new MyClass("555"));
		
		for (MyClass x: mc)
			System.out.println(x);
		
	
	}

}
