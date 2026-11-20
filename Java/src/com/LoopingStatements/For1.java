// WAP to print n numbers 

package com.LoopingStatements;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n value :  " );
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.print(" " + i);
		}

	}

}
