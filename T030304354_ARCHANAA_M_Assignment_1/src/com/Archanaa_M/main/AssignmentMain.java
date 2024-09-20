package com.Archanaa_M.main;

import com.Archanaa_M.Assignment_1.employees.Manager;
import com.Archanaa_M.Assignment_1.employees.Developer;
import com.Archanaa_M.Assignment_1.utilities.EmployeeUtilities;

public class AssignmentMain {

     public static void main(String[] args) {
	        // Create instances of Manager and Developer
	        Manager manager = new Manager("ARCHANAA", "T030304354", 200000, 10);
	        Developer developer = new Developer("AMMU", "21EC012", 100000, "Java");

	        // Use EmployeeUtilities to print details
	        EmployeeUtilities.printManagerDetails(manager);
	        EmployeeUtilities.printDeveloperDetails(developer);
	    }
	}

