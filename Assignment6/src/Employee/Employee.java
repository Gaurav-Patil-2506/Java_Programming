package Employee;

import java.util.Scanner;

public abstract class Employee {
 
	private String First_Name;
	private String Last_Name;
	private final int SSN;
	private static int generateempid=1000;
	
	{
		SSN=++generateempid;
	}
	
	public Employee() {
		
	}

	public abstract void totalSalary();
	
	public Employee(String first_Name, String last_Name) {
		First_Name = first_Name;
		Last_Name = last_Name;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter FirstName");
		First_Name = sc.next();
		System.out.println("Enter LastName");
		Last_Name = sc.next();
	}
	
	public void display() {
		System.out.println("Empid :"+SSN);
		System.out.println("FirstName :"+First_Name+" LastName :"+Last_Name);
	}
}
