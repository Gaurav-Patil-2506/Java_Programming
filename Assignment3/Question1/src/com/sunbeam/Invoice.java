package com.sunbeam;

import java.util.Scanner;

public class Invoice {

		String partNumber;
		String partName;
		int quantity=0; 
		double price;
		double invoiceAmount;
		
		public Invoice() {
			this("","", 0 ,0.00);
		}
		public Invoice(String partNumber, String partName, int quantity, double price) {
			super();
			this.partNumber = partNumber;
			this.partName = partName;
			this.quantity = quantity;
			this.price = price;
		}
		public String getPartNumber() {
			return partNumber;
		}
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public String getPartName() {
			return partName;
		}
		public void setPartName(String partName) {
			this.partName = partName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void accept() 
		{
			Scanner sc  = new Scanner(System.in);
			
			System.out.println("Enter part Number");
			partNumber = sc.next();
			
			System.out.println("Enter part description");
			partName = sc.next();
			
			System.out.println("Enter quantity");
			quantity = sc.nextInt();
			
			System.out.println("Enter price per Item");
			price = sc.nextDouble();			
		}
		
		public void display() 
		{
			if(quantity<0) {
				setQuantity(0);
			}
			else if(price<0) {
				setPrice(0.0);
			}
			invoiceAmount = price * quantity;
			System.out.println("Invoice Amount: "+invoiceAmount  );
			System.out.println("------------------------------------");
		}
		
	}
