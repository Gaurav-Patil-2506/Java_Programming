package Office;

import java.util.Scanner;

import Employee.*;

public class Company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Employees :");
		int var = sc.nextInt();
		Employee[] employees = new Employee[var];
		int choice, counter = 0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Enter Salaried Employee");
			System.out.println("2.Enter Hourly Employee");
			System.out.println("3.Enter Commission Employee");
			System.out.println("4.Enter Base Salaried commission Employee");
			System.out.println("5.Display All Employees");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.exit(1);
				break;
			case 1:
				if (counter > var - 1) {
					System.out.println("Employee List is Full");
				} else {
					employees[counter] = new SalariedEmployee();
					employees[counter].accept(sc);
					counter++;
				}
				break;
			case 2:
				if (counter > var - 1) {
					System.out.println("Employee List is Full");
				} else {
					employees[counter] = new HourlyEmployee();
					employees[counter].accept(sc);
					counter++;
				}

				break;
			case 3:
				if (counter > var - 1) {
					System.out.println("Employee List is Full");
				} else {
					employees[counter] = new CommissionEmployee();
					employees[counter].accept(sc);
					counter++;
				}

				break;
			case 4:
				if (counter > var - 1) {
					System.out.println("Employee List is Full");
				} else {
					employees[counter] = new BaseSalariedCommEmployee();
					employees[counter].accept(sc);
					counter++;
				}
				break;
			case 5:
				for (int i = 0; i < counter; i++) {
					employees[i].display();
					employees[i].totalSalary();
				}
			}
		} while (choice != 0);

	}

}
