package com.inher.quest2;

public class Current extends Account {


	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount){
		if (balance - amount >= -1000) {
            balance -= amount;
            System.out.println("Current: Withdrawn $" + amount + " successfully");
            if (balance < 0) {
                System.out.println("Warning: Your account is in overdraft! Balance: $" + balance);
            }
        } else {
            System.out.println("Current Error: Exceeds overdraft limit of -$1000");
        }
	} 
	
	@Override
	void deposit(double amount){
		if (amount > 0) {
            balance += amount;
            System.out.println("Current: Deposited $" + amount + " successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
	} 

}
