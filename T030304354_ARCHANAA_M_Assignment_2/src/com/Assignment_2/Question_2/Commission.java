package com.Assignment_2.Question_2;

import java.util.Scanner;

class Commission {
	    // Data Members
	    String Name;
	    String Address;
	    String Phone;
	    double Sales_amount;
	    double commission;

	    // Method to accept details of the sales employee
	   public void acceptDetails() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        Name = scanner.nextLine();

	        System.out.print("Enter Address: ");
	        Address = scanner.nextLine();

	        System.out.print("Enter Phone: ");
	        Phone = scanner.nextLine();

	        System.out.print("Enter Sales Amount: ");
	        Sales_amount = scanner.nextDouble();
	        scanner.close();
	    }

	    // Method to calculate the commission based on the sales amount
	   public void calculateCommission() {
	        if (Sales_amount >= 100000) {
	            commission = Sales_amount * 0.10;
	        } else if (Sales_amount >= 50000) {
	            commission = Sales_amount * 0.05;
	        } else if (Sales_amount >= 30000) {
	            commission = Sales_amount * 0.03;
	        } else {
	            commission = 0;
	        }
	    }

	    // Method to display the details
	   public void displayDetails() {
	        System.out.println("Name: " + Name);
	        System.out.println("Address: " + Address);
	        System.out.println("Phone: " + Phone);
	        System.out.println("Sales Amount: " + Sales_amount);
	        System.out.println("Commission: " + commission);
	    }
	}

