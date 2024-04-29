package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super();
	}

	public Mango(String color, String name, double weight, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste()
	{
		return "sweet ";
		
	}
	
		

}
