package com.javaBean;

import java.util.Scanner;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	

	public Student() {
		super();
	}


	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

//
//	void Main() {
//		
//		
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students :");
		int c1=sc.nextInt();
		
		for(int i=0;i<c1;i++) {
			System.out.println("Enter the Roll Number :");
			int c2=sc.nextInt();
			
			System.out.println("Enter the Name :");
			String c3=sc.next();
			
			System.out.println("Enter the marks :");
			int c4=sc.nextInt();
			
			
			Student c5=new Student();
			c5.rollNumber = c2;
			c5.studentName = c3;
			c5.marks = c4;
			
			System.out.println("Enter the Roll Number :"+c5.rollNumber);
			System.out.println("Enter the Name :"+c5.studentName);
			System.out.println("Enter the marks :"+c5.marks);
		}

	}

}
