package com.basics.quest2;

public class Bank {
 double balance;

 public Bank(double balance) {
	this.balance = balance;
 }
 
 void withdraw(double amount) {
	 if(amount<balance) {
		 balance= balance-amount;
		 System.out.println("Amount withdrawn successfully");
	 }else {
		 System.out.println("Insufficient balance");
	 }
	 
	 
 }
 void deposit(double amount) {
	 balance=balance+amount;
 }
 double getBalance() {
	 return balance;
 }
 

}
