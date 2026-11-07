package com.Methods;

public class Bike {
	
	String model;
	String brand;
	double price;
	String colour;
	
	Bike(){
		System.out.println("no arg constructor called");
		this("RE");
	}
	

	public Bike(String model) {
		this(model,"Hunter 350");
	
	}
	
	
	public Bike(String model, String brand) {
		this(model,brand,185000);
		
	}
	
	
	public Bike(String model, String brand, double price) {
		this(model,brand,price,"Red");
		
	}
	

	public Bike(String model, String brand, double price, String colour) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b = new Bike();
		b.bikeinfo();
		
		Bike b1 = new Bike("Honda", "CB Unicorn", 100000, "Black");
		b1.bikeinfo();
		
		System.out.println("main method ended");

	}
	
	void bikeinfo() {
		System.out.println("Model of the Bike : "+model);
		System.out.println("Brand of the Bike : "+brand);
		System.out.println("Price of the Bike : "+price);
		System.out.println("Colour of the Bike : "+colour);
		System.out.println("******************************");

}
}
