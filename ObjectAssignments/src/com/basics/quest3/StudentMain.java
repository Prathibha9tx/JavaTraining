package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your name");
		   String name1 = sc.nextLine();
		   System.out.println("Enter your Department");
		   String dept1 = sc.nextLine();
		   System.out.println("Enter your Id");
		   int id1 = sc.nextInt();
		   Student student1= new Student(name1,dept1,id1);		   
		   int[] marks1 = new int[5];
		   System.out.println("Enter your marks");
		   for(int i=0;i<marks1.length;i++) {
			   marks1[i] =sc.nextInt();
		   }
		   student1.printdetails();
		   System.out.println(student1.getGrades(marks1));
		   
		   sc.nextLine();
		   System.out.println("Enter details of 2nd student");
		   System.out.println("Enter your name");
		   String name2 = sc.nextLine();
		   System.out.println("Enter your Id");
		   int id2 = sc.nextInt();
		   System.out.println("Enter your Department");
		   String dept2 = sc.nextLine();
		   int[] marks2 = new int[5];
		   System.out.println("Enter your marks");
		   for(int i=0;i<marks2.length;i++) {
			   marks2[i] =sc.nextInt();
		   }
		   Student student2= new Student(name2,dept2,id2);
		   student2.printdetails();
		   System.out.println(student2.getGrades(marks2));
	
		   
		   
		sc.close();	
			
	}

}
