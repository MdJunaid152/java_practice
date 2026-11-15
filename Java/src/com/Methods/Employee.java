package com.Methods;

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 300+ methods with 15+ classes
		// iii) With return type & NO Parameters
		// WAP to print Employee Total salary which include all aspects.

		Employee e = new Employee();

		double bs = e.getBasicSalary();
		double hra = e.getHouseRentAllowance();
		double t = e.getTravelAllowance();

		double total_salary = bs + hra + t;
		System.out.println("Total salary is :" + total_salary);

	}

	double getBasicSalary() {
		System.out.println("Enter your Basic salary:");
		double basicsalary = sc.nextDouble();
		return basicsalary;
	}

	double getHouseRentAllowance() {
		System.out.println("Enter your HRA:");
		double hra = sc.nextDouble();
		return hra;
	}

	double getTravelAllowance() {
		System.out.println("Enter Travel Allowance:");
		double ta = sc.nextDouble();
		return ta;
	}
}
