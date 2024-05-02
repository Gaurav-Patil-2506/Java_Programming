package com.Question2;

import java.util.Scanner;

public class Point2D {
	
	Scanner sc = new Scanner(System.in);

	int x;
	int y;

	public Point2D(int x, int y) {
	
		this.x = x;
		this.y = y;
	}

	public Point2D() {

	}

	public Point2D(double x2, double y2) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public void accept() {
		
		System.out.println("Enter the X :" );
		setX(sc.nextInt());
		System.out.println("Enter the Y :" );
		setY(sc.nextInt());
		
	}
	
	public String toString() {
	
		return ("("+x+","+y+")");
	}
	
}
