package com.abs.quest1;

import java.util.Scanner;

public class DemoAbs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your designation");
		System.out.println("1.Manager");
		System.out.println("2.TeamLead");
		System.out.println("3.Developer");
		int choice = sc.nextInt();
		Employee emp;
		switch(choice) {
		case 1:
			emp=new Manager("Uthsavi",90000.0,9,"Work");
			emp.printDetails();
			emp.calcBonus(1000);
			emp.showProjects();
			Manager manager = (Manager) emp; 
			manager.funClub();
			break;
		case 2:
			 String[] hobbies = {"Reading","Music","Cooking"};
			emp = new Developer("Prathi",100000, 10,hobbies);
			emp.printDetails();
			emp.showCourses();
			emp.showProjects();
			TeamLead teamlead = (TeamLead) emp;
			teamlead.corporateServices();
		case 3: 
			String[] hobbies1 = {"Reading", "Music", "Cooking"};
			 Employee developer = new Developer("Arun",100000,103,hobbies1);

	            developer.printDetails();
	            developer.calcBonus(20000);

	            String[] developerCourses = developer.showCourses();

	            System.out.println("Courses:");

	            for (String course : developerCourses) {
	                System.out.println(course);
	            }

	            developer.showProjects();
	            developer.showRules();

	            Developer d = (Developer) developer;
	            d.corporateServices();
	            d.showHobbies();

	            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();

		

	}

}
