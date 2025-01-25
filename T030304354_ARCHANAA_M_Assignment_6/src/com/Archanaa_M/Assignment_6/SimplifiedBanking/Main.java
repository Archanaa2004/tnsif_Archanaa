package com.Archanaa_M.Assignment_6.SimplifiedBanking;

public class Main {
	
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000.0);

	        // Creating threads for concurrent transactions
	        Thread t1 = new Thread(new Transaction(account, 500.0, true), "Customer-1");
	        Thread t2 = new Thread(new Transaction(account, 200.0, false), "Customer-2");
	        Thread t3 = new Thread(new Transaction(account, 300.0, true), "Customer-3");
	        Thread t4 = new Thread(new Transaction(account, 400.0, false), "Customer-4");

	        // Starting the threads
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	    }
	}
