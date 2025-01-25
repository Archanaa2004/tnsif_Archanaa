package com.Archanaa_M.Assignment_6.SimplifiedBanking;

public class Transaction implements Runnable {
	    private BankAccount account;
	    private double amount;
	    private boolean deposit;  // true for deposit, false for withdraw

	    public Transaction(BankAccount account, double amount, boolean deposit) {
	        this.account = account;
	        this.amount = amount;
	        this.deposit = deposit;
	    }

	    @Override
	    public void run() {
	        if (deposit) {
	            account.deposit(amount);
	        } else {
	            account.withdraw(amount);
	        }
	    }
	}


