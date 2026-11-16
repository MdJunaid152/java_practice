package com.Operators;

public class Bitwise_XOR_TILT {

	public static void main(String[] args) {
		System.out.println("********* Bitwise XOR (^) ***************");
		System.out.println("true & true : " + (true ^ true));// false
		System.out.println("true & false : " + (true ^ false));// true
		System.out.println("false & true : " + (false ^ true));// true
		System.out.println("false & false : " + (false ^ false));// false

		System.out.println("-------------------");

		System.out.println(1 ^ 1);// 0
		System.out.println(1 ^ 0);// 1
		System.out.println(0 ^ 1);// 1
		System.out.println(0 ^ 0);// 0

		System.out.println("-------------------");

		System.out.println(73 ^ 27);// 82
		System.out.println(82 ^ 15);// 93
		System.out.println(95 ^ 62);// 97
		System.out.println(89 ^ 22);// 79

		System.out.println("********* Bitwise TILT (~) ***************");
		System.out.println(~10);//           -11
		System.out.println(~(-10));//-(n+1)    9

	}

}
