package com.Methods;

public class Without_this_keyword {
	
	
	int id;
	String name;
	int age;
	
	Without_this_keyword(int rno, String naam, int age1){
		
		id = rno;
		name = naam;
		age = age1;
			
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Without_this_keyword t = new Without_this_keyword(152, "Junaid", 22);
		
		
		System.out.println("Roll number  : "+t.id);
		System.out.println("Name  : "+t.name);
		System.out.println("Age  : "+t.age);
		
		
		System.out.println("main method ended");

	}

}
