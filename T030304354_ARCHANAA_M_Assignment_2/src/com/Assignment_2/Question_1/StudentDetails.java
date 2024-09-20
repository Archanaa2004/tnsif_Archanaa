package com.Assignment_2.Question_1;

import java.util.Scanner;

public class StudentDetails {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter your full name with Initial: ");
	        String fullName = scanner.nextLine();

	        System.out.print("Enter your roll number: ");
	        String rollNumber = scanner.nextLine();

	        System.out.print("Enter your grade: ");
	        String grade = scanner.nextLine();

	        System.out.print("Enter your percentage: ");
	        String percentage = scanner.nextLine();
            scanner.close();
            
	        // Print the output in the desired format
	        System.out.println(fullName);
	        System.out.println(rollNumber);
	        System.out.println(grade);
	        System.out.println(percentage+"%");
	    }
	}
