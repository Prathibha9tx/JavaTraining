package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Account");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		int typeofAccount = sc.nextInt();
		Account account = new Savings(500);
		Account curaccount = new Current(1000);
		switch(typeofAccount) {
		case 1:
			  Savings Savings = (Savings) account;
			  System.out.println("Savings Account");
			  Savings.deposit(1000);
			  Savings.withdraw(500);
			  System.out.println(account.getBalance());
			  break;
		case 2:
			  Current Current = (Current) curaccount;
			  System.out.println("Current Account");
			  Current.deposit(5000);
			  Current.withdraw(500);
			  System.out.println(curaccount.getBalance());
			  break;
	    default:
	    	System.out.println("Wrong choice");		
			
	}
	}
}
