package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2;
		
		System.out.println("Enter the co ordonates of 1st Point");
		x1 = sc.nextDouble();
		y1= sc.nextDouble();
		Point2D p1= new Point2D (x1 ,y1);
		
		System.out.println("Enter the co ordonates of 2st Point");
		x2 = sc.nextDouble();
		y2= sc.nextDouble();
		Point2D p2= new Point2D (x2 ,y2);
		
		System.out.println("Point p1: " +p1.getDetails());
		System.out.println("Point p2: " +p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("points are at the same co-ordinates");
		}
		else {
			System.out.println("points are different co-ordinates");
			System.out.println("Distance between p1 and p2 is : " +p1.calculateArea(p2));
		}		
		sc.close();
	}

}
