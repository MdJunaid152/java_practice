package com.POC;

import java.util.Scanner;

public class Jewellery {

	public static void main(String[] args) {
		System.out.println("Welcome to Jewellery Shop ");
		Scanner sc = new Scanner(System.in);
		double GoldBill = 0;
		double SilverBill = 0;
		String shopMore = "";

		do {

			System.out.println("Enter which type of Jewellery you need......");
			System.out.println("");
			System.out.println("G --> Gold");
			System.out.println("S --> Silver");

			String type = sc.next();

			switch (type) {
			case "G": {

				String yon = "";
				do {
					System.out.println("Gold List ");

					System.out.println("List Items :  ");
					System.out.println("1 --> Gold Chain  --> rs:60,000");
					System.out.println("2 --> Gold Ring --> rs:27,5000");
					int types = sc.nextInt();
					switch (types) {
					case 1: {
						System.out.println("You Selected Gold Chain ");
						double ChainCost = 60000;
						GoldBill = GoldBill + ChainCost;
						break;
					}
					case 2: {
						System.out.println("You Selected Gold Ring ");
						double RingCost = 27500;
						GoldBill = GoldBill + RingCost;
						break;
					}
					default: {
						System.out.println("No Items listed   ");
					}
					}

					System.out.println("Do you want to continue with gold shopping y or n");
					yon = sc.next();
				} while (yon.equalsIgnoreCase("y"));

				System.out.println("Total Gold Bill : " + GoldBill);

			}
				break;

			case "S": {

				String syon = "";
				do {
					System.out.println("Silver List");

					System.out.println("List Items ");
					System.out.println("1--> Silver Bracelite --> 15500 ");
					System.out.println("2--> Silver Plate --> 22000");
					int stypes = sc.nextInt();
					switch (stypes) {
					case 1: {
						System.out.println("You Selected Silver Bracelite ");
						double BraceliteCost = 15500;
						SilverBill = SilverBill + BraceliteCost;
						break;
					}
					case 2: {
						System.out.println("You Selected Silver Plate ");
						double PlateCost = 22000;
						SilverBill = SilverBill + PlateCost;
						break;
					}
					default: {
						System.out.println("No Items listed");
					}
					}

					System.out.println("Do you want to continue with Silver shopping y or n");
					syon = sc.next();
				} while (syon.equalsIgnoreCase("y"));

				System.out.println("Total Silver Bill : " + SilverBill);
				break;
			}

			default: {
				System.out.println("Entered wrong type ");
				break;
			}
			}
			System.out.println("\nDo you want to shop another category (Gold/Silver)? y or n");
			shopMore = sc.next();
		} while (shopMore.equalsIgnoreCase("y"));
		double grandtotal = GoldBill + SilverBill;
		System.out.println("***********************************************");
		System.out.println("Gold Bill      : " + GoldBill);
		System.out.println("Silver Bill    : " + SilverBill);
		System.out.println("***********************************************");
		System.out.println("Grand Total    : " + grandtotal);
		System.out.println("***********************************************");
		System.out.println("THANKYOU FOR SHOPPING VISIT AGAIN");
	}
}
