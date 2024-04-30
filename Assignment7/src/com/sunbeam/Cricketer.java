package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler{
	
	int wickets, runs;

	public Cricketer() {
		
	}

	public Cricketer(int runs,int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}



	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter wickets");
		wickets =sc.nextInt();
		System.out.println("Enter runs");
		runs = sc.nextInt();
		
	}

	@Override
	public int getWickets() {
		
		return wickets;
	}

	@Override
	public int getRuns() {
		
		return runs;
	}

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", age=" + age
				+ ", matchesPlayed=" + matchesPlayed + "wickets=" + wickets + ", runs=" + runs + "]";
	}
	
	

}
