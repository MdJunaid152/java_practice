package com.LogicalStatements;

import java.util.Scanner;
//Write a Java program to check whether a person is eligible to vote or not.

public class Vote_Eligiblility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for Vote....");
		} else {
			System.out.println("You are not eligible for Vote....");
		}

	}

}
