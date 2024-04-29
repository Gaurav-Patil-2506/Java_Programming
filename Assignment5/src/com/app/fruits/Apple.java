package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super();
	}

	public Apple(String color, String name, double weight, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste()
	{
		return "sweet n sour";
		
	}
	
	

}
