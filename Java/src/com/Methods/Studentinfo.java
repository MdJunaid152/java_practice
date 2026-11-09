package com.Methods;

import java.util.Scanner;

public class Studentinfo {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		
		System.out.println("Enter Student Number : ");
		String  num = sc.next();

		studentAge(age);
		studentname(name);
		studentNumber(num);
		
		
		System.out.println("main method ended ");
		
	}
	
	static void studentNumber(String  num) {
		System.out.println("Student Number is : "+num);
		System.out.println("*************************");

	}
	
	static void studentAge(int age) {
		System.out.println("Student Age is : "+age);
	}
	
	static void studentname(String name) {
		System.out.println("Student Name is : "+name);

	}

}
