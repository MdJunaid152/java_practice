package com.arrays;

public class Ages {

	public static void main(String[] args) {
		int[] ages;
		ages = new int[5];
		ages[0] = 22;
		ages[1] = 23;
		ages[2] = 21;
		ages[3] = 22;
		ages[4] = 21;

		for (int age : ages) {
			System.out.println(age);
		}

	}

}
