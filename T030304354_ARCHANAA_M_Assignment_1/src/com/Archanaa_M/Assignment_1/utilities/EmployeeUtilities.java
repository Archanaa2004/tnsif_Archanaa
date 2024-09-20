package com.Archanaa_M.Assignment_1.utilities;

import com.Archanaa_M.Assignment_1.employees.Employee;
import com.Archanaa_M.Assignment_1.employees.Manager;
import com.Archanaa_M.Assignment_1.employees.Developer;

/*
  This class contains utility methods for handling Employee-related operations.
 */
public class EmployeeUtilities {
	    /*
	      Prints basic information about the employee.
	     */
	    public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    /*
	      Prints details specific to the Manager.
	     */
	    public static void printManagerDetails(Manager manager) {
	        printEmployeeDetails(manager);
	        System.out.println("Team Size: " + manager.getTeamSize());
	    }

	    /*
	      Prints details specific to the Developer.
	     */
	    public static void printDeveloperDetails(Developer developer) {
	        printEmployeeDetails(developer);
	        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
	    }
	}

