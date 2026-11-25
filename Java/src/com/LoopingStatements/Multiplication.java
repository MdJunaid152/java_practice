package com.LoopingStatements;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number to multiply :  ");
		int num = sc.nextInt();

		for (int p = 1; p <= 10; p++) {
			System.out.println(num + " X " + p + " = " + (num * p));

		}
	}

}
