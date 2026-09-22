package com.abs.quest1;

public abstract class Employee {
	
	 String empName;
	 double salary;
	 int empId; 
	 final String COMPANYNAME=""; 
	 public Employee(String empName, double salary, int empId) {
				this.empName = empName;
				this.salary = salary;
				this.empId = empId;
	  }	  
	 
	  void printDetails(){
	  System.out.println("Employee Name:"+empName);
	  System.out.println("Salary:"+salary);
	  System.out.println("Id:"+empId);
	  } 
	 
	  abstract  void calcBonus(double amount); 
      String[] showCourses(){
		return new String[] {"C","C++","Java"};
	  } 
      
	  abstract  void showProjects(); 
	  final void showRules(){ 
	      officeHours();   // call the private method 
	      System.out.println("leave policies"); 
	      System.out.println("od policies"); 
	  }
	  
	  private void officeHours(){ 
	  System.out.println("14 hours per day"); 
	  }

	 
}
