package com.LoopingStatements;

import java.util.Scanner;

public class IsPerfect {

	static boolean isPerfect(int n) {
		boolean value = false;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			value = true;
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean value = isPerfect(n);

		if (value) {
			System.out.println("The given number is a perfect number ");

		} else {
			System.out.println("The given number is not a perfect number");
		}

	}

}
