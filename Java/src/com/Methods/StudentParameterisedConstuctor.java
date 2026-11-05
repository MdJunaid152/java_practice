/*Create a Student class with studentId, studentName and marks.
  Initialize all variables using a Parameterized constructor. 
  Display student details by calling a method in the main method.*/
package com.Methods;

public class StudentParameterisedConstuctor {
	
	int studentId;
	String studentName;
	int marks;
	
	StudentParameterisedConstuctor(int id, String name, int mark){
		studentId = id;
		studentName = name;
		marks = mark;
	}

	public static void main(String[] args) {
		StudentParameterisedConstuctor s = new StudentParameterisedConstuctor(10273, "Mohammed Junaid", 99);
		s.studentDetails();
		
		StudentParameterisedConstuctor s1 = new StudentParameterisedConstuctor(152, "Shaik Mohammed Junaid", 89);
		s1.studentDetails();

	}
	void studentDetails() {
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Marks : "+marks);
		System.out.println("******************************");
	}

}
