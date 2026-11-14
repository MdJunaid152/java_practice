package com.Operators;

//Bitwise : & | ^ ~

public class Bitwise_AND_OR{

	public static void main(String[] args) {
		System.out.println("********* Bitwise AND (&) ***************");
		System.out.println("true & true : " + (true & true));// true
		System.out.println("true & false : " + (true & false));// false
		System.out.println("false & true : " + (false & true));// false
		System.out.println("false & false : " + (false & false));// false

		System.out.println("-------------------");

		System.out.println(1 & 1);// 1
		System.out.println(1 & 0);// 0
		System.out.println(0 & 1);// 0
		System.out.println(0 & 0);// 0

		System.out.println("-------------------");

		System.out.println(73 & 27);//9
		System.out.println(82 & 15);//2
		System.out.println(95 & 62);//30
		System.out.println(89 & 22);//16
		
		System.out.println("********* Bitwise OR (|) ***************");
		System.out.println("true | true : " + (true | true));// true
		System.out.println("true | false : " + (true | false));// true
		System.out.println("false | true : " + (false | true));// true
		System.out.println("false | false : " + (false | false));// false

		System.out.println("-------------------");

		System.out.println(1 | 1);// 1
		System.out.println(1 | 0);// 1
		System.out.println(0 | 1);// 1
		System.out.println(0 | 0);// 0

		System.out.println("-------------------");

		System.out.println(73 | 27);//91
		System.out.println(82 | 15);//95
		System.out.println(95 | 62);//127
		System.out.println(89 | 22);//95
		
		
	}

}
