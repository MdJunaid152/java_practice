package com.javafundamentals;

import java.util.Scanner;

public class AreaofAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..........Area of a Triangle..........");
		System.out.println("Enter Base : ");
		double b = sc.nextDouble();
		System.out.println("Enter Height : ");
		double h = sc.nextDouble();
		
		double AOT = getAreaOfTriangle(b,h);
		System.out.println("Area of Triangle : "+AOT);
		System.out.println("");
		
		
		System.out.println("..........Area of Square..........");
		System.out.println("Enter side : ");
		double s = sc.nextDouble();
		
		double AOS = getAreaOfSquare(s);
		System.out.println("Area of Square : "+AOS);
		System.out.println("");
		
		System.out.println("..........Area of Rectangle..........");
		System.out.println("Enter Length : ");
		double len = sc.nextDouble();
		System.out.println("Enter Breadth : ");
		double bd = sc.nextDouble();
		
		double AOR = getAreaOfRectangle(len,bd);
		System.out.println("Area of Rectangle : "+AOR);
		System.out.println("");
		
		System.out.println("..........Area of Circle..........");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		
		double AOC = getAreaOfCircle(r);
		System.out.println("Area of Circle : "+AOC);
		System.out.println("");
		
 				

	}
	
	static double getAreaOfTriangle(double base, double height){
		return 0.5 * base * height;
	}
		
	static double getAreaOfSquare(double side) {
		return side * side;
	}
	
	static double getAreaOfRectangle(double length, double breadth) {
		return length * breadth;
	}
	
	static double  getAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}
		
	

}
