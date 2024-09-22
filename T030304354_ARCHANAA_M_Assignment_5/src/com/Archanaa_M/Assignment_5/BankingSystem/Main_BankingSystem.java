package com.Archanaa_M.Assignment_5.BankingSystem;

public class Main_BankingSystem {
	    public static void main(String[] args) {
	        // Creating a BankAccount object
	        BankAccount account = new BankAccount(12345, 1000);

	        // Demonstrating deposit, withdrawal, and exception handling
	        try {
	            account.displayBalance();
	            account.deposit(500); // Valid deposit
	            account.withdraw(300); // Valid withdrawal
	            account.withdraw(1500); // This will cause an InsufficientFundsException
	        } catch (InvalidAmountException | InsufficientFundsException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            System.out.println("Transaction completed.");
	        }

	        // Invalid deposit to trigger InvalidAmountException
	        try {
	            account.deposit(-100); // This will cause an InvalidAmountException
	        } catch (InvalidAmountException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            System.out.println("Transaction completed.");
	        }
	    }
	}

