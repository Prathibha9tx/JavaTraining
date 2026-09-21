package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Bank bank = new Bank(1000);
		System.out.println("----ATM MENU----");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter amount to withdraw: ");
			double withdrawAmount = sc.nextDouble();
			bank.withdraw(withdrawAmount);
			System.out.println("Current Balance "+bank.getBalance());
			
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			double depositAmount = sc.nextDouble();
			bank.deposit(depositAmount);
			System.out.println("Current Balance "+bank.getBalance());
			break;
			
		default:
			System.out.println("Invalid choice");
		}
		sc.close();
		

	}

}
