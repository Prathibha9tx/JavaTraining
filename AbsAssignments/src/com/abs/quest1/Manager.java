package com.abs.quest1;

public class Manager extends Employee {
	
	String activity; 
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void calcBonus(double amount) {
		 System.out.println("Manager Bonus : " + amount);
	}

	@Override
	void showProjects() {
		System.out.println("Manager Project : Banking Application");
	}
	
	@Override
    String[] showCourses() {
        return new String[] { "Leadership", "Management", "Java" };
    }
	
	 void funClub(){ 
	   System.out.println("Activity "+activity); 
	 }



}
