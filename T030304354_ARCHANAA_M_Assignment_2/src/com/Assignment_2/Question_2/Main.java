package com.Assignment_2.Question_2;

public class Main {
	    public static void main(String[] args) {
	        // Creating a Student object
	        Student student = new Student();

	        // Creating a Commission object
	        Commission commissionObj = new Commission();

	        // Accepting sales employee details
	        commissionObj.acceptDetails();

	        // Calculating commission
	        commissionObj.calculateCommission();

	        // Displaying the details
	        commissionObj.displayDetails();
	    }
	}

