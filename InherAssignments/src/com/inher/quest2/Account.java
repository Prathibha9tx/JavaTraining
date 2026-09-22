package com.inher.quest2;

public class Account {
	double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	void withdraw(double amount){
		if(amount<balance) {
			balance=balance-amount;
			System.out.println("Withdrawn successfully");
		}else {
			System.out.println("insufficient balance");
		}
	} 
	
	void deposit(double amount){
		balance=balance+amount;
		System.out.println("Deposited");
	} 
	double getBalance(){
		return balance;
	} 
}
