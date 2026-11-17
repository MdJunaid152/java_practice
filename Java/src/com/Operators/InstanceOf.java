package com.Operators;

class A {

}

class B extends A {

}

public class InstanceOf {

	public static void main(String[] args) {
		Integer i = 10;
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true
		System.out.println(i instanceof Object);// true
		// System.out.println(i instanceof String);//CE
		System.out.println(null instanceof Integer);// false

		B b = new B();
		A a = new A();
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
	}

}
