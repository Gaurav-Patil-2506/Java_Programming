package tester;

import java.util.Scanner;

import com.sunbeam.Cricketer;
import com.sunbeam.Player;

public class Test {
	
	public static int menu(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Add Cricketer");
		System.out.println("2.Dsiplay Player Details ");
		System.out.println("3.Total Runs");
		System.out.println("4.Total Wickets");
		System.out.println("5.Total MatchesPlayed");
		System.out.println("6.Player Name & Matches Played");
		
		System.out.println("Enter your Choice");
		return sc.nextInt();
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		int choice;
		int counter=0;
		
		int total_runs = 0;
		int total_wickets = 0;
		int total_matches = 0;
		
		Player[] arr = new Player [11];
		while( (choice =menu(sc))!=0) 
		{
			switch(choice) 
			{
			  case 1:
				 if(counter <11) 
				 {
					arr[counter] = new Cricketer();
					arr[counter].accept(sc);
					counter++;
				 }
				 else {
					 System.out.println("11 players is full");
				 }
				 break;
			  case 2:
				 for(Player p : arr) {
					if(p!=null) {
					    System.out.println(p.toString());
						System.out.println("------------------------------------------------------------------------------------------");
						}
					else {
						System.out.println("No details of player...!");
						}
				 }
				 break;
			  
			  case 3:
				 for(Player p:arr){
					if(p!=null) {
						Cricketer c = (Cricketer)p;
						total_runs+=c.getRuns();
					}
				  }
					System.out.println("Total runs = "+total_runs);
					break;		
					
			  case 4:
				 for(Player p:arr) {
					if(p!=null) {
						Cricketer c = (Cricketer)p;
						total_wickets+=c.getWickets();
					}
				 }
					System.out.println("Total wickets = "+total_wickets);
					break;
					
				case 5:
					for(Player p:arr) {
						if(p!=null) {
							total_matches+=p.getMatchesPlayed();
						}
					}
					System.out.println("Total matches played = "+total_matches);

					break;
					
				case 6 :
					for(Player p:arr) {
						if(p!=null) {
							System.out.println("Name = "+p.getName()+"    No.of matches = "+p.getMatchesPlayed());
						}
					}					
					break;
					
				default:
					System.out.println("Invalid choice...!....Try again ");
					break;
			}
		}
		sc.close();
	}

}
