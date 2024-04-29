package Employee;

import java.util.Scanner;

public class BaseSalariedCommEmployee extends CommissionEmployee {
     private double baseSalary;
     
     public BaseSalariedCommEmployee() {
    	 super();
     }

	public BaseSalariedCommEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}
     public void accept(Scanner sc)
     {
    	 super.accept(sc);
    	 System.out.println("Enter Base salary :");
    	 baseSalary = sc.nextDouble();
     }
     public void display() {
    	 super.display();
     }
     public void totalSalary() {
 		
    	 System.out.println("Base Salary : " + baseSalary);
    	 System.out.println("Rewarded Base Salary :" + baseSalary*1.1+ super.getComm());
 	}
}
