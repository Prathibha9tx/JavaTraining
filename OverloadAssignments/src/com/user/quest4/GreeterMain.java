package com.user.quest4;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new Greeter("Uthsavi");
		String[] names= {"Prathi","Uthsavi","Raj"};
		String[] messages = {
	            "Welcome to the platform!",
	            "Your order has been shipped.",
	            "Password reset request received.",
	            "System maintenance scheduled for 11 PM."
	        };
		greeter.greetUser(messages);
		greeter.sayHello(names);
	}

}
