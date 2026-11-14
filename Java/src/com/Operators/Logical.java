package com.Operators;

// Logical Operators : && || ! --> Boolean Expressions
public class Logical {

	public static void main(String[] args) {

		int x = 10;
		int y = 15;
		int z = 20;

		System.out.println("*********Logical AND (&&) ***************");
		System.out.println("true && true : " + (true && true));// true
		System.out.println("true && false : " + (true && false));// false
		System.out.println("false && true : " + (false && true));// false
		System.out.println("false && false : " + (false && false));// false

		System.out.println("-----------------------------------");

		System.out.println(x < y && y < z);// true
		System.out.println(x < y && y > z);// false
		System.out.println(x > y && y < z);// false
		System.out.println(x > y && y > z);// false

		System.out.println("*********Logical OR (||) ***************");
		System.out.println("true || true : " + (true || true));// true
		System.out.println("true || false : " + (true || false));// true
		System.out.println("false || true : " + (false || true));// true
		System.out.println("false || false : " + (false || false));// false

		System.out.println(x < y || y < z);// true
		System.out.println(x < y || y > z);// true
		System.out.println(x > y || y < z);// true
		System.out.println(x > y || y > z);// false

		System.out.println("*********Logical NOT (!) ***************");

		System.out.println(!true);// false
		System.out.println(!false);// true
		System.out.println(!(x < y));// false

		int a = 10;
		System.out.println(++a < 15 && ++a < 15);// true
		System.out.println(a);// 12
		System.out.println(++a > 15 && ++a < 15);// false
		System.out.println(a);// 13

	}

}
