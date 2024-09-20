package com.Assignment_2.Question_3;

import java.util.Scanner;

public class Circle {
	    // Data Members
	    double radius;
	    String color;

	    // Method to accept the details of the circle
	    public void getInput() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        radius = scanner.nextDouble();
	        scanner.nextLine(); // consume the newline character

	        System.out.print("Enter the color of the circle: ");
	        color = scanner.nextLine();
	        scanner.close();
	    }
	  

	    // Method to calculate the area of the circle
	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("The area of the circle is: " + area);
	    }

	    // Main method to test the Circle class
	    public static void main(String[] args) {
	        Circle circle = new Circle();

	        // Get input from the user
	        circle.getInput();

	        // Calculate and display the area
	        circle.calcArea();
	       
	        }
	}

