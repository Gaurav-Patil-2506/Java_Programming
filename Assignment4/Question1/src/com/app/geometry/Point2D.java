package com.app.geometry;

public class Point2D {

	private double X;
	private double Y;
	
	public Point2D(double x, double y) {
		X = x;
		Y = y;
	}
	
	public String getDetails()
	{
		return "Point ("+X+","+Y+")";
	}
	
	public boolean isEqual(Point2D p) {
		return this.X==p.X && this.Y == p.Y;
	}
	
	public double calculateDistance(Point2D p) {
		return Math.sqrt(Math.pow((this.X-p.X), 2)+ Math.pow((this.Y-p.Y), 2));
	}
}
