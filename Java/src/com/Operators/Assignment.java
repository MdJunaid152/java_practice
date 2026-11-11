package com.Operators;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 10;
		System.out.println(a);

		// a =(int) (a + 5.5);
		a += 5.5;
		System.out.println(a);// 15

		// a = a - 3.5;
		a -= 3.5;
		System.out.println(a);// 11

		// a = a * 2.5
		a *= 2.5;
		System.out.println(a);// 27

		// a = a / 2.5
		a /= 2.5;
		System.out.println(a);// 10

		// a = a % 1.5
		a %= 1.5;
		System.out.println(a);// 1

	}

}
