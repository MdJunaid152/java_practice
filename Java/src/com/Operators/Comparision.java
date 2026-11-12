package com.Operators;

public class Comparision {

	public static void main(String[] args) {

		String s1 = new String("Junaid");
		String s2 = new String("junaid");

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true

		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == c);// true
		System.out.println(a != c);// false

		System.out.println(a > b);// false
		System.out.println(a >= b);// false

		System.out.println(a < b);// true
		System.out.println(a <= c);// true

		System.out.println(a < c);// false
	}

}
