package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first trainer");
		String trainer1 = sc.nextLine();
		System.out.println("Enter second trainer");
		String trainer2 = sc.nextLine();
		Training training = new Training();
		System.out.println("Trainer details");
		training.showTrainers(trainer1,trainer2);
		System.out.println("Courses are:");
	    String[] courses = training.showCourses();
	    for(String course:courses) {
	    	System.out.println(course);
	    }
		sc.close();

	}

}