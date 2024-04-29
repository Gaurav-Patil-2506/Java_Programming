package Employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private double wages;
	private int hours;
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double wages, int hours) {
		super();
		this.wages = wages;
		this.hours = hours;
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter Wages :");
		wages = sc.nextDouble();
		System.out.println("Enter Hours :");
		hours = sc.nextInt();
	}
	
	public void display() {
		super.display();
		
	}
public void totalSalary() {
		
	if(hours > 40)
	{
		wages *= ((hours * (hours - 40)) + (hours - 40)*1.5);
		System.out.println("Wages : " + wages);
	}
	else
	{
		System.out.println("Wages :" + wages * hours );
	}
	}
}
