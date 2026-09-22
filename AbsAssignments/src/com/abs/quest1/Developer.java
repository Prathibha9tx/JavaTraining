package com.abs.quest1;

public class Developer extends TeamLead {
	 
	  String hobbies[]; 
	  public Developer(String empName, double salary, int empId,String[] hobbies) {
			super(empName, salary, empId);
			this.hobbies = hobbies;
		}
	  
	  @Override
	    String[] showCourses() {
	        return new String[] { "Core Java", "Spring Boot", "React", "Kafka" };
	    }
	  
	  @Override
	  void showProjects() {
		  System.out.println("Developer Project : Full Stack Banking Application");
		
	  }
	  // own method of Developer  
	void showHobbies(){	 
		for(String hobby:hobbies) {
	    System.out.println(hobby+"is hobby"); 
		}
	  }
	 
}
