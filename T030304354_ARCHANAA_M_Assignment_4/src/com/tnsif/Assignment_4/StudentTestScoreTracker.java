package com.tnsif.Assignment_4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: size of the array
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        // Input: elements of the array
	        int[] scores = new int[n];
	        System.out.println("Enter " + n + " space-separated integers:");
	        for (int i = 0; i < n; i++) {
	            scores[i] = scanner.nextInt();
	        }

	        // Creating an ArrayList and adding elements from the array
	        ArrayList<Integer> scoreList = new ArrayList<>();
	        for (int score : scores) {
	            scoreList.add(score);
	        }

	        // Output: displaying the elements in the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int score : scoreList) {
	            System.out.println(score);
	        }

	        scanner.close();
	    }
	}

