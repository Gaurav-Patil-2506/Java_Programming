package tester;
import java.util.Scanner;
import com.app.fruits.*;


public class FruitBasket {

	public static void main(String[] args) {
		
//		Fruit f1=new Mango("mango","yellow",200,true);
//		System.out.println(f1.toString());
//		
		int choice;
		int count=0;
		System.out.println("Enter the size of Basket :");
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		Fruit[] basket=new Fruit[size];
		
		do{
			System.out.println("0.EXIT");
			System.out.println("1.ADD MONGO");
			System.out.println("2.ADD ORANGE");
			System.out.println("3.ADD APPLE");
			System.out.println("4.DISPLAY ALL FRUITS");
			System.out.println("5.DISPLAY ALL DETAILS");
			System.out.println("6.MARK FRUIT AS STALE");
			System.out.println("7.DISPLAY TASTE OF ALL STALE");
			System.out.println("8.Mark all sour fruits stale");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				if(count<size) {
					basket[count]=new Mango("mango","yellow",1.22,true);
					count++;
				}
				else {
					 System.out.println("Basket Full...!");
				}
				
				break;
			case 2:
				if(count<size) {
					basket[count]=new Orange("Orange","Orange",2.22,true);
					count++;
				}
				else {
					 System.out.println("Basket Full...!");
				}
				
				break;
			case 3:
				if(count<size) {
					basket[count]=new Apple("Apple","red",1.00,true);
					count++;
				}
				else {
					 System.out.println("Basket Full...!");
				}
				
				break;
				
			case 4:
				for (Fruit var :basket)
					  System.out.println(var.getName());
				break;
			case 5:
				for (Fruit var :basket)
				  System.out.println(var.toString());
			break;
			case 6:
				System.out.println("Enter the index to mark fruit as stale");
				int n=sc.nextInt();
				if(n>count) {
				basket[n].setFresh(false);
				System.out.println("setted isFresh = False..!");}
				else {
					System.out.println("Invalid Index..!");
				}
				
				break;
			case 7:
				for(int i=0;i<count;i++)
				{
					boolean isFresh =basket[i].isFresh();
					if(isFresh == false)
					{
	
						System.out.println(basket[i].taste());
					}
				}
			
			break;
			case 8:
				for(int i=0;i<count;i++)
				{
					if(basket[i].taste() == "Sour")
					{
						basket[i].setFresh(false);
						
					}
					
				}
				System.out.println("setted all sour fruits == is not fresh");
				
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}

