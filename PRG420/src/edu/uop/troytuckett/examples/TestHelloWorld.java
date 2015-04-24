package edu.uop.troytuckett.examples;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;

public class TestHelloWorld extends TestCase {

	public TestHelloWorld (String name) {
		super(name);
	}
	
	public void testSay() {
		HelloWorld hi = new HelloWorld();
		assertEquals("Hello World!", hi.say());
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestHelloWorld.class);
	}

}
