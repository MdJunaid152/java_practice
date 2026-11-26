package com.LoopingStatements;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find factor of a given number  : ");
		int factor = sc.nextInt();

		for (int q = 1; q <= factor; q++) {
			if (factor % q == 0) {
				System.out.println(q);

			}
		}

	}
}
