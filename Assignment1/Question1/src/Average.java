import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double Average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("Enter Valid First number");
			sc.next();
		}
		num1= sc.nextDouble();
		
		System.out.println("Enter Second Number");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("Enter Valid Second number");
			sc.next();

		}
		num2= sc.nextDouble();
		
		Average = (num1+num2)/2;
		
		System.out.println("Average = "+Average);

	}

}
