/* Write a Java program to perform addition, subtraction, multiplication, and division using four separate user-defined methods.
   Each method should accept two integer parameters. 
   Call only one method from the main() method.
   display all four results.*/

package com.javafundamentals;
import java.util.Scanner;

public class MathematicalOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int value1 = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int value2 = sc.nextInt();
		
		
		addition(value1,value2);

	}
	
	static int addition(int value1, int value2) {
		int sum = value1 + value2;
		System.out.println("Addition : "+sum);
		
		subtraction(value1,value2);
		
		return sum;
		
	}
	
	static int subtraction(int value1, int value2) {
		int sub = value1 - value2;
		System.out.println("Subtraction : "+sub);
		
		multiplication(value1,value2);
		
		return sub;
	}
	
	static int multiplication(int value1, int value2) {
		int mul = value1 * value2;
		System.out.println("Multiplicaion : "+mul);
		
		division(value1,value2);
		
		return mul;
	}
	
	static int division(int value1, int value2) {
		int div = value1 / value2;
		System.out.println("Division : "+div);
		return div;
	}

}
