import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalMilesPerDay;
		double costPerGallon;
		double mileage;
		double parkingFeesPerDay;
		double tollPerDay;
		double drivingCost;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Total miles driven per day : ");
		totalMilesPerDay = sc.nextDouble();
		
		System.out.print(" Cost per gallon of gasoline. : ");
		costPerGallon = sc.nextDouble();
		
		System.out.print(" Average miles per gallon. : ");
		mileage = sc.nextDouble();
		
		System.out.print(" Parking fees per day. : ");
		parkingFeesPerDay = sc.nextDouble();
		
		System.out.print(" Tolls per day. : ");
		tollPerDay = sc.nextDouble();
		
		drivingCost = (totalMilesPerDay / mileage)*costPerGallon + parkingFeesPerDay + tollPerDay ;
		System.out.println("---------------------------------------------");
		
		System.out.print("Cost Per Day Of Driving To Work : Rs."+drivingCost);
		sc.close();
		


	}

}
