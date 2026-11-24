// 1.Write a Java program to print all even numbers between 1 and 50.
package com.LoopingStatements;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.Write a Java program to print all even numbers between 1 and 50.

		System.out.println("Even number from 1 to 50 ");

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i + " ");
			}
		}
	}
}
