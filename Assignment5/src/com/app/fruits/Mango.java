package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super();
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String toString() {
		return "Mango [getColor()=" + getColor() + ", getWeight()=" + getWeight() + ", getName()=" + getName()
				+ ", isFresh()=" + isFresh() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
