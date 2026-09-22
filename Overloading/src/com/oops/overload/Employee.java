package com.oops.overload;

public class Employee {

	String EmployeeNmae;
	int EmpId;
	String Dept;
	String City;
	

	public Employee() {
		super();
	}


	public Employee(String employeeNmae) {
		super();
		EmployeeNmae = employeeNmae;
	}


	public Employee(String employeeNmae, int empId, String dept) {
		super();
		EmployeeNmae = employeeNmae;
		EmpId = empId;
		Dept = dept;
	}


	void getDetails() {
		if(EmployeeNmae !=null)
			System.out.println("name:"+EmployeeNmae);
		if(EmpId >0)
			System.out.println("EmpId:"+EmpId);
		if(Dept != null) 
			System.out.println("Dept:"+Dept);
			
		
	}
	
}
