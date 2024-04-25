import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accNumber;
		int pendingBalance;
		int totalItemsChargerd ;
		int totalCredit;
		int allowedCreditLimit;
		int newBalance;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account number ");
		accNumber = sc.nextInt();
		
		System.out.println("Enter the Pending Balance at the beginning of the month");
		pendingBalance = sc.nextInt();
		
		System.out.println("Enter the Total Items charged by customer ");
		totalItemsChargerd = sc.nextInt();
		
		System.out.println("Ente  Total credit applied for this month ");
		totalCredit = sc.nextInt();	
		
		System.out.println("Allowed credit limit : ");
		allowedCreditLimit = sc.nextInt();
		
		newBalance= pendingBalance + totalItemsChargerd-totalCredit;
		System.out.println("New Balance : ");
		if(newBalance>allowedCreditLimit) {
			System.out.println("credit Limit Exceeded ");
		}			

	}

}
