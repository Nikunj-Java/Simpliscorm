package com.simplilearn.constructor;

public class Employee {
	
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Employee() {
		
		empId=1;
		empName="Emp001";
		department="Finance";
		salary=35000;
		
	}
	
	
	//parametrized constructor
	public Employee(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
		
		
	}
	
	//display the employee
	public void display() {
		
		System.out.println("Id:"+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		
	}
	
	//main method
	public static void main(String[] args) {
		
	
		Employee emp1= new Employee();
		Employee emp2= new Employee(12,"Nikunj Soni", "I.T", 45000);
		
		//calling default constructor
		emp1.display();
		
		//calling parametrized constructor
		emp2.display();
		
		
	}

}
