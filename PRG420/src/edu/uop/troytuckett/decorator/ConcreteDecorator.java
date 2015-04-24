package edu.uop.troytuckett.decorator;

public class ConcreteDecorator implements Decorator {

	IComponent component;

	public ConcreteDecorator(IComponent component) {
		super();
		this.component = component;
	}

	public void addedBehavior() {
		System.out.println("Decorator does some stuff too");
	}

	public void doStuff() {
		component.doStuff();
		addedBehavior();
	}
}
