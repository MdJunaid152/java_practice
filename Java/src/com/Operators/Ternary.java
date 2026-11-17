package com.Operators;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {

		int a = 100;
		int b = 20;
		int c = 300;
		int max = (a > b) ? a : b;
		System.out.println("Max value is : " + max);

		int max1 = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Max 1 value is : " + max1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");

		int age = sc.nextInt();
		String isEligible = (age >= 18) ? "YES" : "NO";
		System.out.println("Is the person Eligible for Voting..? " + isEligible);
	}

}
