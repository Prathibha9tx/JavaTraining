package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] employee =new Employee[5];
		System.out.println("=== Enter Details for 5 Employees ===");
		for(int i=0;i<5;i++) {
		System.out.println("Enter employee name "+(i+1));
		String name = sc.nextLine();
		System.out.println("Enter the Designation");
		System.out.println("1. Manager");
		System.out.println("2. Programmer");
		System.out.println("3. Director");
		
		int choice = sc.nextInt();
		sc.nextLine();
		String designation;
		switch(choice){
		case 1:
			designation = "Manager";
			break;
		case 2:
			designation = "Programmer";
			break;
		case 3:
			designation = "Director";
			break;
		default:
            designation = "Invalid Choice";
            System.out.println("Invalid selection!");
            break;
		}
		employee[i] = new Employee(name,designation);
		}
		
		for(Employee emp:employee) {
			String desig = emp.getDesignation();
			if(desig.equalsIgnoreCase("manager")) {
				emp.calcBonus(1000.00);
			}else if(desig.equalsIgnoreCase("Programmer")) {
				emp.calcBonus(1000.00,"iPhone");
			}else if(desig.equalsIgnoreCase("Director")) {
				emp.calcBonus(1000.00,"iPhone",200000);	
			}
			sc.close();
			
		}
	}

}
