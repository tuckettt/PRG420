package edu.uop.troytuckett.examples;

import java.util.ArrayList;

public class TryArrayList {

    public static void main(String args[]) {
	
	ArrayList<Integer> array = new ArrayList();
		
	array.add(new Integer(123));
	array.add(new Integer(456));	
	array.add(new Integer(789));
	array.remove(1);
	
	for(int c=0;c<array.size();c++) {
	    System.out.println(array.get(c));
	}
    }    
}
