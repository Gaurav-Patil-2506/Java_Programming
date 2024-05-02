package com.Question1;

import java.util.Scanner;

import Question1.Tester.Invalidexception;

public class Readstring {
	
	String stringName = null ;
	Scanner  sc = new Scanner(System.in);
	
	
 public	void accept() {
	System.out.println("Enter the string : ");
	stringName = sc.nextLine();
	
	}

	public void cheak() throws Invalidexception {
		if( stringName.length() < 80 ) {
			throw new Invalidexception("string is less tha 80");
		}
		else {
			System.out.println( "STRING NAME  IS :"+stringName);
		}
			
	}

	

}
