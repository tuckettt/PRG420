package edu.uop.troytuckett.examples;

import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    
    public static void main(String args[]) {
	
	MyArrayList mal = new MyArrayList();
	/*mal.addElement(new SimpleClass(000));
	mal.addElement(new SimpleClass(1));
	mal.addElement(new SimpleClass(2));
	mal.addElement(new SimpleClass(3));
	mal.addElement(new SimpleClass(4));
	mal.addElement(new SimpleClass(5));
	mal.addElement(new SimpleClass(6));
	mal.addElement(new SimpleClass(7));
	mal.addElement(new SimpleClass(8));
	mal.addElement(new SimpleClass(9));
	mal.addElement(new SimpleClass(10));
	mal.addElement(new SimpleClass(11));
	mal.addElement(new SimpleClass(12));
	mal.addElement(new SimpleClass(13));
	mal.addElement(5,new SimpleClass(55));
	mal.addElement(20, new SimpleClass(14));
	mal.addElement(new SimpleClass(15));
	mal.addElement(new SimpleClass(16));
	mal.removeElement(20);*/
	
	System.out.println("Start1");
	for (int c=0;c<100000;c++) {
	    mal.addElement(new SimpleClass(c));
	}
	System.out.println("Done1");
	
	ArrayList al = new ArrayList();
	
	System.out.println("Start2");
	for (int c=0;c<100000;c++) {
	    al.add(new SimpleClass(c));
	}
	System.out.println("Done2");
	
/*
	for (int c=0;c<mal.getLength();c++) {
	    System.out.println(mal.getElement(c));
	}*/
    }
}