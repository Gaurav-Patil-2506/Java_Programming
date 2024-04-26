package tester;
import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nmber of points to plot");
		 Point2D[] points = new Point2D[sc.nextInt()];
		 for (int i=0; i< points.length; i++){ 
				System.out.println("Enter Coordinates x and y");
				double x= sc.nextDouble();
				double y= sc.nextDouble();
				points[i] = new Point2D(x,y);
			}
		 int choice;
		 do {
			 
			 System.out.println("-----------------------");
			 System.out.println("1.Display details of a specific point");
			 System.out.println("2.Display x, y co-ordinates of all points");
			 System.out.println("3.Distance between co-ordinates at the indices");
			 System.out.println("4.Exit");
			 System.out.println("-----------------------");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 
			 switch (choice) {
			case 1:
				System.out.println("Enter the Index");
				int index = sc.nextInt();
				if(index>=0 && index<points.length) {
					System.out.println("Point at index"+index+ ": " +points[index].getDetails());
				}
				else {
					System.out.println("Index not found.......Try Again!!!");
				}				
				break;
				
			case 2:
				for (int i=0; i< points.length; i++){
					System.out.println(points[i].getDetails());				
				}				
				break;
			case 3:
				System.out.println("Enter the Indices");
				int index1= sc.nextInt();
				int index2 = sc.nextInt();
				
				if(index1 >=0 && index1 <points.length && index2 >=0 && index2 < points.length) 
				{
					if(points[index1]== points[index2]) {
					System.out.println("Points are at same Location");
					} 
					else {
					System.out.println("Distance Between Points : "+points[index1].calculateDistance(points[index2]));
					}
				}
				else {
					System.out.println("Index not found.......Try Again!!!");
				}				
				break;
			case 4:
				System.out.println("Exit..");
				break;
			default:
				System.out.println("Invalid Choice......Try Again!!");
				break;
			}
			 			 
		 }while(choice!=4);
		 

				
		
//		for (Point2D element : points) {
//			element.getDetails();
//			System.out.println("------------------");
//		}
		
//		if(p1.isEqual(p2)) {
//			
//		}
//		else {
//			System.out.println("Points are at Different Location");
//			System.out.println("Distance Between Points : "+p1.calculateArea(p2));
//		}
	}

}
