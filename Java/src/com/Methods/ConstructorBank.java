package com.Methods;

public class ConstructorBank {
	
	String accno;
	String accholdername;
	double balance;
	
	
	ConstructorBank(String no, String name , double bal){
		accno = no;
		accholdername = name;
		balance = bal;
	}

	public static void main(String[] args) {
		ConstructorBank b = new ConstructorBank("863993", "Junaid", 60000);
		b.checkBalance();
		b.deposite(10000);
		b.withdraw(5000);
		b.details();
	}
	
	
	void deposite(double damt) {
		balance = balance + damt;
		System.out.println("Deposite Balance : "+balance);
	}
	
	void withdraw(double wamt) {
		balance = balance - wamt;
		System.out.println("Withdraw Balance : "+balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is : "+balance);
	}
	
	void details() {
		System.out.println("Account number : "+accno);
		System.out.println("Account Holder name : "+accholdername);
		System.out.println("Current Balance : "+balance);
		
	}

}
