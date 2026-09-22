package com.inher.quest2;

public class Savings extends Account {

	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount){
		if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Savings: Withdrawn $" + amount + " successfully");
        } else {
            System.out.println("Savings Error: Must maintain a minimum balance of $500");
        }
	} 
	
	@Override
	void deposit(double amount){
		if (amount > 0) {
            balance += amount;
            System.out.println("Savings: Deposited $" + amount + " successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
	} 
	
}
