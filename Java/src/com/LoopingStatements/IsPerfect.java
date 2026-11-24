package com.LoopingStatements;

import java.util.Scanner;

public class IsPerfect {

	static boolean isPerfect(int num) {
		if (num <= 1) {
			return false;
		}
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) { 
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which perfect number you want (e.g., 1, 2, 3...) : ");
		int n = sc.nextInt();

		int count = 0;
		int currentNumber = 1;

		while (count < n) {
			currentNumber++;
			if (isPerfect(currentNumber)) {
				count++;
			}
		}

		System.out.println("The " + n + "th perfect number is: " + currentNumber);
		sc.close();
	}
}