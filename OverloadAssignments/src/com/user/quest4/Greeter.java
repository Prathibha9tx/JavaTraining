package com.user.quest4;

public class Greeter {
	 String name; 
	 
	 public Greeter(String name) {
			this.name = name;
		}

	void greetUser(String... messages){ 
		System.out.println("Hi "+name);
		for(String message:messages) {			
			System.out.println(message);
		}
		
		System.out.println("");
		System.out.println("********************************");
		System.out.println("");
	} 

	void sayHello(String... names){ 
		 for(String name:names) {
			 System.out.println("Welcome "+name);
		 }
		} 
	}
