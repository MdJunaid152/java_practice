
//WAP to print BankAccount details and Operations ?
//checkBalance();
//deposit();
//withdraw();

package com.Methods;

import java.util.Scanner;

public class BankAccount1 {
	double balance = 2000;

	public static void main(String[] args) {
		System.out.println("main method is started");
		BankAccount b = new BankAccount();
		b.checkBalance();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much you want deposit : ");
		double damount = sc.nextDouble();
		b.deposite(damount);

		System.out.println("Enter how much You want withdraw : ");
		double wamount = sc.nextDouble();
		b.withdraw(wamount);
		System.out.println("main method is ended");

	}

	void checkBalance() {
		System.out.println("The current balance is : " + balance);

	}

	void deposit(double damount) {

		if (damount > 500) {
			balance = balance + damount;
		} else {
			System.out.println("you must need to Deposit above 500/-");
		}

		checkBalance();
	}

	void withdraw(double wamount) {

		if (wamount <= balance) {
			balance = balance - wamount;
		} else {
			System.out.println("Insufficient funds : ");
		}

		checkBalance();
	}

}