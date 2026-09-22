package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		 Mobile mobile1 = new Mobile("iPhone 16", "Apple", 89900);
	     Mobile mobile2 = new Mobile("Galaxy S25", "Samsung", 69999);
	     Mobile mobile3 = new Mobile("OnePlus 13", "OnePlus", 69999);
	     Mobile mobile4 = new Mobile("Galaxy A56", "Samsung", 41999);
	     Mobile mobile5 = new Mobile("Redmi Note 14", "Xiaomi", 18999);
		Mobile[] mobileArray = new Mobile[5]; 
		mobileArray[0]=mobile1; 
		mobileArray[1]=mobile2; 
		mobileArray[2]=mobile3; 
		mobileArray[3]=mobile4; 
		mobileArray[4]=mobile5; 
		 System.out.println("All Mobile Details:");

	        for (int i = 0; i < mobileArray.length; i++) {
	            mobileArray[i].getDetails();
	        }
	        System.out.println("Samsung Mobiles:");

	        for (int i = 0; i < mobileArray.length; i++) {
	            if (mobileArray[i].brand.equals("Samsung")) {
	                mobileArray[i].getDetails();
	            }
	        }

	}

}
