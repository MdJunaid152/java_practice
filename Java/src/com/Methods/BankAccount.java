package com.Methods;
import java.util.Scanner;

public class BankAccount {
	
	String name = "Junaid";
	long accno = 10273;
	double balance = 20000;
	
	/*  1.withdraw
 		2.checkBalance
 		3.deposit
 		4.display details
	 */	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		BankAccount b = new BankAccount();
		b.checkDetails();
		b.checkBalance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much amt to withdraw....");
		double amt = sc.nextDouble();
		b.withdraw(amt);
		
		System.out.println("Enter how much amt to deposit.....");
		double damt = sc.nextDouble();
		b.deposite(damt);
		
		System.out.println("main method ended");

	}
	void checkDetails() {
		System.out.println("Account Holder Name : "+name);
		System.out.println("Account Holder Number : "+accno);
		System.out.println("Current Balance "+balance);
	}
	
	void deposite(double damt) {
		balance = balance +damt;
		checkBalance();
	}
	void withdraw(double wamt) {
		balance = balance - wamt;
		checkBalance();
		
	}
	
	
	void checkBalance() {
		System.out.println("The Current Balance is : "+balance);
	}
	
	
	}


