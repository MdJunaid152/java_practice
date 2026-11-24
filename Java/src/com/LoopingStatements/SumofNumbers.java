// Write a Java program to find the sum of numbers from 1 to 100.


package com.LoopingStatements;

public class SumofNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 100; x++) {
			sum = sum + x;
		}
		System.out.println("Sum of the numbers from 1 to 100 :  " + sum);

	}

}
