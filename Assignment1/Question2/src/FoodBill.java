import java.util.Scanner;

public class FoodBill {

	public static void main(String[] args) {
	
		int choice;
		int quantity;
		double totalOrder = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---------------------");
			System.out.println("Food Menu");
			System.out.println("0. Exit");
			System.out.println("1. Pohe");
			System.out.println("2. Misal Pav");
			System.out.println("3. Thalipeeth");
			System.out.println("4. Upma");
			System.out.println("5. Idli");			
			System.out.println("---------------------");
			
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			 System.out.println("Enter Quantity ");
			    quantity = sc.nextInt();
			
				switch(choice) 
				{
				
				
				case 1: 
					totalOrder = 25*quantity;
					
					System.out.println("Total Order = "+totalOrder);
					break;
				
				case 2: 
					totalOrder = 70*quantity;
					
					System.out.println("Total Order = "+totalOrder);
					break;
				case 3: 
					totalOrder = 50*quantity;
					
					System.out.println("Total Order = "+totalOrder);
					break;
				case 4: 
					totalOrder = 30*quantity;
					System.out.println("Total Order = "+totalOrder);
					break;
				case 5: 
					totalOrder = 40*quantity;
					
					System.out.println("Total Order = "+totalOrder);
					break;
				default: 				
					System.out.println("Invalid Choice............ ");
				}
			
		}while (choice !=0);
		
	}
}
