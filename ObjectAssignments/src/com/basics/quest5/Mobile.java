package com.basics.quest5;

public class Mobile {
	String model;
	String brand;
	int price;
	
	public Mobile(String model, String brand, int price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Brand:"+brand+" model:"+model+" Price:"+price);
	}

}
