package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("The Alchemist","Paulo Coelho",502,"Fiction");
		Book book2 = new Book("Atomic Habits","James Clear",179,"Selfhelp");
		System.out.println("**********Book1**********");		
		book1.getDetails();
		book1.checkBookType();
		System.out.println(" ");
		System.out.println("**********Book2**********");
		book2.getDetails();
		book2.checkBookType();
		

	}

}
