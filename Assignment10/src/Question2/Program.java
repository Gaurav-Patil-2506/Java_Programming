package Question2;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Product[] arr = 
			{
				new Product(1,"Laptop","Electonics",25000),
				new Product(2,"TV","Electonics",15000),
				new Product(3,"Table","Home",2500),
				new Product(4,"Book","Educational",250),
				new Product(5,"Notebook","School",25000),
				new Product(6,"Bottle","Other",25000),
				new Product(7,"Pen","School",25000),
				new Product(8,"Mobile","Electonics",25000),
				new Product(9,"Pen Drive","Electonics",25000),
				new Product(10,"Hard Disc","Electonics",25000),
			};
		
		Arrays.sort(arr);
		for (Product product : arr) {
			System.out.println(product);		
		}

	}

}
