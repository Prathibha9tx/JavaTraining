package com.basics.quest3;

public class Student {
  String name;
  String dept;
  int id;
  
  public Student(String name, String dept, int id) {
	this.name = name;
	this.dept = dept;
	this.id = id;
	
}
  void printdetails() {
	  System.out.println("Name:"+name);
	  System.out.println("Id:"+id);
	  System.out.println("Department:"+dept);
  }
  String getGrades(int[] marks) {
	  int sum=0;	  
		  for(int mark:marks) {
			 sum += mark;
		  } 
	  
	  
	  double average = (double)sum/marks.length;
	  String grade;
	  int range =(int)(average/10);
	  switch(range) {
	  case 10:
	  case 9:
		  grade="A";
		  break;
	  case 8:
		  grade="B";
		  break;
	  case 7:
		  grade="C";
		  break;
	  case 6:
		  grade="D";
		  break;
	  case 5:
		  grade="E";
	      break;
	   default:
		   grade="Fail";
		   break;
	  }
	  return grade;
  }
}
