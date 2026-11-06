package com.Methods;

public class Test {
	int x = 10;
	Test(){
		x = 20;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);

	}

}
