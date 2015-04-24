package edu.uop.troytuckett.decorator;

public class Client {
	public static void main(String[] args) {
		IComponent comp = new Component();
		Decorator decorator = new ConcreteDecorator(comp);
		decorator.doStuff();
	}
}
