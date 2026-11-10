/*Write a Java program to create a Student class with fields studentId, studentName, and course. 
Initialize the data using a parameterized constructor and create another object by copying 
the values of the first object using a copy constructor. 
Display the details of both objects.*/


package com.Methods;

public class ConstructorStudent {
	
	int studentId;
	String studentName;
	String course;
	
	ConstructorStudent(int Id, String Name, String corse){
		studentId = Id;
		studentName = Name;
		course = corse;
	}
	
	ConstructorStudent(ConstructorStudent c){
		this.studentId = c.studentId;
		this.studentName = c.studentName;
		this.course = c.course;
		
	}

	public static void main(String[] args) {
		ConstructorStudent s = new ConstructorStudent(152, "Junaid", "JFS");
		s.stuinfo();
		ConstructorStudent s1 = new ConstructorStudent(s);
		s1.studentId = 102;
		s1.stuinfo();
	}
	
	void stuinfo() {
		System.out.println("Student Id  : " +studentId );
		System.out.println("Student Name : " +studentName );
		System.out.println("Student Course : "+course);
		System.out.println("********************************");
	}

}
