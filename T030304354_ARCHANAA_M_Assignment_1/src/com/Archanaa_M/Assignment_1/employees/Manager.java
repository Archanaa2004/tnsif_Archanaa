package com.Archanaa_M.Assignment_1.employees;

/*
  This class represents a Manager, which is a type of Employee.
 */
public class Manager extends Employee {
	    private int teamSize;

	    // Constructor
	    public Manager(String name, String employeeId, double salary, int teamSize) {
	        super(name, employeeId, salary);
	        this.teamSize = teamSize;
	    }

	    // Getter and Setter for teamSize
	    public int getTeamSize() {
	        return teamSize;
	    }

	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }
	}
