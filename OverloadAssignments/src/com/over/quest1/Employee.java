package com.over.quest1;

public class Employee {
	String name, designation;
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	
	void calcBonus(double basicAllowance){
	System.out.println("name:"+name);
	System.out.println("Designation:"+designation);
	System.out.println("Allowance:"+basicAllowance);
	System.out.println("****************************************************");
	}
	void calcBonus(double basicAllowance, String gift) {
		System.out.println("name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Allowance:"+basicAllowance);
		System.out.println("Gift:"+gift);
		System.out.println("****************************************************");
	}
	void calcBonus(double basicAllowance, String gift , double 
			houseAllowance) {
		System.out.println("name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Allowance:"+basicAllowance);
		System.out.println("Gift:"+gift);
		System.out.println("House Allowance:"+houseAllowance);
		System.out.println("****************************************************");
		
	}

}
