package com.Methods;

public class Mobile {
	String model;
	int price;
	String colour;
	
	Mobile(String model_, int price_, String colour_){
		model = model_ ;
		price = price_;
		colour = colour_;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Mobile m = new Mobile("Oneplus", 37000, "Black");
		m.mobileInfo();
		
		System.out.println("main method ended   ");
		
	}
	
	void mobileInfo() {
		System.out.println("Model of the Mobile : "+model);
		System.out.println("Price of the Mobile : "+price);
		System.out.println("Colour of the Mobile : "+colour);
	}

}
