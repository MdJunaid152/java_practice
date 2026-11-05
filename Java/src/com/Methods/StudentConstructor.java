/*Create a Student class with studentId, studentName and marks.
  Initialize all variables using a no-argument constructor. 
  Display student details by calling a method in the main method.*/

package com.Methods;

public class StudentConstructor {
	int StudentId;
	String StudentName;
	int marks;
	
	
	StudentConstructor(){
		System.out.println("no-arg constructor called ");
		StudentId = 10273;
		StudentName = "Mohammed Junaid";
		marks = 98;
	}

	public static void main(String[] args) {
		StudentConstructor s = new StudentConstructor();
		s.student();

	}
	
	
	void student() {
		System.out.println("Student Id : "+StudentId);
		System.out.println("Student Name : "+StudentName);
		System.out.println("Student Marks : "+marks);
	}

}
