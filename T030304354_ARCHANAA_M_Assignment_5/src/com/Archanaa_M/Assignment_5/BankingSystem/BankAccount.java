package com.Archanaa_M.Assignment_5.BankingSystem;

	public class BankAccount {
	    private int accountNumber;
	    private double balance;

	    // Parameterized constructor to initialize account details
	    public BankAccount(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Invalid deposit amount. Amount must be greater than zero.");
	        }
	        balance += amount;
	        System.out.println("Deposit successful. New balance: " + balance);
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Invalid withdrawal amount. Amount must be greater than zero.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds. Your balance is " + balance);
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful. New balance: " + balance);
	    }

	    // Method to display the current balance
	    public void displayBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	}

