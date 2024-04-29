package Employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	private int grossSales;
	private double commRate;

	public CommissionEmployee() {

	}

	public CommissionEmployee(int grossSales, double commRate) {
		super();
		this.grossSales = grossSales;
		this.commRate = commRate;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter GrossSales :");
		grossSales = sc.nextInt();
		System.out.println("Enter Commission Rate :");
		commRate = sc.nextDouble();
	}

	public double getComm() {
		return commRate * grossSales;
	}

	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}

	public void display() {
		super.display();
	}

	public void totalSalary() {

		System.out.println("Gross Sales :" + grossSales + "Commission Rate:" + commRate);
		System.out.println("Commisioned Pay :" + grossSales * commRate);
	}
}
