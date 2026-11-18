// WAP to check to check the End User for Voting/Driving

package com.LogicalStatements;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Congratulations, you are eligible for Voting / Driving");

		} else {
			System.out.println("Sorry, you are below age ");

		}
		System.out.println("Have a nice day :) ");

	}

}
