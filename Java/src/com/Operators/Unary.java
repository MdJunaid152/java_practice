package com.Operators;

public class Unary {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		System.out.println(+a); // 5

		System.out.println(-b); // -6

		System.out.println(a++); // 5 --> 6
		System.out.println(++a); // 7

		System.out.println(--b); // 5 
		System.out.println(b--); // 5
		System.out.println(b); // 4
		
		
		System.out.println(++a + ++b + --a + --b);
		//                   8 +   5 +   7 +   4  = 24
	}

}
