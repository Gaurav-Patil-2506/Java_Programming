package Employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double WeeklySalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(double weeklySalary) {
		super();
		WeeklySalary = weeklySalary;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter weekly Salary pay");
		WeeklySalary = sc.nextDouble();
	}

	public void display() {
		super.display();
	}

	public void totalSalary() {
		
		System.out.println("Weekly Salary : " + WeeklySalary);
	}
}
