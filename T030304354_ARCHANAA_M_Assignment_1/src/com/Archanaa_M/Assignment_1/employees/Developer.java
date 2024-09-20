package com.Archanaa_M.Assignment_1.employees;

/*
  This class represents a Developer, which is a type of Employee.
 */
public class Developer extends Employee {
	    private String programmingLanguage;

	    // Constructor
	    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    // Getter and Setter for programmingLanguage
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	}

