package com.sunbeam;

import java.util.Scanner;

public abstract class Player {
	int id;
	String name;
	int age;
	int matchesPlayed;
	
	public Player() {
		this(0,"",0,0);
	}
	
	public Player(int id, String name, int age, int matchesPlayed) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public void accept(Scanner sc) {
			
		System.out.println("Enter id");
		id = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter matchesPlayed");
		matchesPlayed = sc.nextInt();		
	}

	
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
	
	
	
	
	
	
	

}
