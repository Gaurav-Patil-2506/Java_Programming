package com.Question2;


public class CIRCLE {
	
	
	private Point2D centerPoint =  null; 
	private double myDiameter = 0;
	
	
	public CIRCLE() {
		this.centerPoint = new Point2D(0, 0);
		this.myDiameter = myDiameter;
		
	}
	public CIRCLE(double x, double y ,double myDiameter) {
		 this.centerPoint =new Point2D(x,y);
		
	}
	
	public void setMyDiameter(double myDiameter) throws Exception{
		
		if(myDiameter < 0) {
			throw new Exception(new Invalidexception("diameter is Negative"));
		}
		this.myDiameter = myDiameter;
		}
	@Override
	public String toString() {
		return "CIRCLE [centerPoint=" + centerPoint.toString() + ", myDiameter=" + myDiameter + "]";
	}
	}
		



	
