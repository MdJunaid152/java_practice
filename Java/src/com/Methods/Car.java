package com.Methods;

public class Car {
	
	String model;
	String brand;
	double price;
	String colour;
	
	Car(){
		System.out.println("no - arg method called");
		model = "Unknown";
		brand = "Unknown";
		price = 100000;
		colour = "Unknown";
	}
	
	Car(String model, String brand, double price, String colour){
		System.out.println("parametarised method called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		Car c = new Car();
		c.carinfo();
		
		Car c1 = new Car("Venue", "Hyndai", 980000, "White" );
		c1.carinfo();
		System.out.println("main method ended");


	}
	void carinfo() {
		System.out.println("Model of the Car : "+model);
		System.out.println("Brand of the Car : "+brand);
		System.out.println("Price of the Car : "+price);
		System.out.println("Colour of the Car : "+colour);
		System.out.println("******************************");

	}

}
