package com.employee;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
    double salary;
	double netSalary;
	
	
	


	public void calculateNetSalary(int pfPercentage) {
//		Scanner ec=new Scanner(System.in);
		System.out.println("Id "+employeeId);
//		employeeId=ec.nextInt();
		System.out.println("Name "+employeeName);
//		employeeName=ec.next();
		System.out.println("salary "+salary);
//		salary=ec.nextInt();
		double netSalarys=salary-pfPercentage;
		System.out.println("Net Salary "+netSalarys);
		
		
		
		
	}
	
	


	public Employee() {
		super();
	}




	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id ");
		int e1=sc.nextInt();
		
		System.out.println("Enter Name ");
		String e2=sc.next();
		
		System.out.println("Enter salary ");
		  double e3=sc.nextInt();
		
		System.out.println("Enter PF percentage ");
		int e4=sc.nextInt();
		
		Employee e5=new Employee();	
		e5.employeeId=e1;
		e5.employeeName=e2;
		e5.salary=e3;
		e5.netSalary=e4;
		
	     e5.calculateNetSalary(e4);
		

		
	}

}
