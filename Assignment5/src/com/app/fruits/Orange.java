package com.app.fruits;

public class Orange extends Fruit {
		

	public Orange(String color, String name, double weight, boolean isFresh) {
		super(color, weight, name, isFresh);

	}

	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste()
	{
		return " sour";
		
	}
	

}
