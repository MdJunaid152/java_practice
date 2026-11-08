package com.Methods;

class Product{
	
	String model;
	double price;
	String brand;
	String colour;
	
	Product(){
		System.out.println("no arg - constructor called from Product");

		}
	
	Product(String model, String brand){
		this.model = model;
		this.brand = brand;
	}
	
	public static void main(System[] args) {
		System.out.println("main method started from Product");
		
		System.out.println("main method ended ");

	}
	
}
// Mobile is a Product 
public class Super_using_Mobile extends Product {
	
	Super_using_Mobile(){
		super();
		System.out.println("no arg - constructor called from Mobile");
	}
	
	Super_using_Mobile(String model, double price, String brand, String colour){
		super.model = model;
		super.price = price;
		super.brand = brand;
		super.colour = colour;
	}
	
	Super_using_Mobile(String model, String brand){
		super(model, brand); 	
	}
	



	public static void main(String[] args) {
		System.out.println("main method started from Mobile");
		
		Super_using_Mobile m = new Super_using_Mobile();
		m.mobileInfo();
		
		Super_using_Mobile m1 = new Super_using_Mobile("11R", 37000.00, "Oneplus", "Black ");
		m1.mobileInfo();

		Super_using_Mobile m2 = new Super_using_Mobile("V11 Pro" ,"Vivo");
		m2.mobileInfo();


	}
	void mobileInfo() {
		System.out.println("Mobile Model : "+model);
		System.out.println("Mobile Price : "+price);
		System.out.println("Mobile Brand : "+brand);
		System.out.println("Mobile colour : "+colour);
		System.out.println("****************************");

	}

}
