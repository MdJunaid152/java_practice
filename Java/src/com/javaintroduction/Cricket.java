package com.javaintroduction;

/* Create a Class Name Cricketer 
 * Take instance variables:- cname,jerseyno,highestScore
  		static variables :-  boardName,countryName 

Create 4 objects and using the object reference add 4 cricketers data and print the data*/

public class Cricket {
	
	String cname;
	int jerseyno;
	int highestScore;
	
	static String boardName = "Bcci";
	static String countryName = "India";
	
	

	public static void main(String[] args) {
		Cricket c1 = new Cricket();
		
		c1.cname = "MS Dhoni";
		c1.jerseyno = 7;
		c1.highestScore = 224;
		
		Cricket c2 = new Cricket();
		
		c2.cname = "Rohit Sharma";
		c2.jerseyno = 45;
		c2.highestScore = 264; 
		
		Cricket c3 = new Cricket();
		
		c3.cname = "Jadeja";
		c3.jerseyno = 8;
		c3.highestScore = 175;
		
		Cricket c4 = new Cricket();
		c4.cname = "Sachin Tendulkar";
		c4.jerseyno = 10;
		c4.highestScore = 248;
		
		
		System.out.println("Board Name : "+boardName);
		System.out.println("Country Name : "+countryName);
		
		System.out.println();
		
		System.out.println("..........Cricketer_1 Details..........");
		System.out.println("Cricketer Name : "+c1.cname);
		System.out.println("Jersey Number : "+c1.jerseyno);
		System.out.println("Highest Score : "+c1.highestScore);
		
		System.out.println();
		System.out.println("..........Cricketer_2 Details..........");
		System.out.println("Cricketer Name : "+c2.cname);
		System.out.println("Jersey Number : "+c2.jerseyno);
		System.out.println("Highest Score : "+c2.highestScore);
		
		System.out.println();
		System.out.println("..........Cricketer_3 Details..........");
		System.out.println("Cricketer Name : "+c3.cname);
		System.out.println("Jersey Number : "+c3.jerseyno);
		System.out.println("Highest Score : "+c3.highestScore);

		System.out.println();
		System.out.println("..........Cricketer_4 Details..........");
		System.out.println("Cricketer Name : "+c4.cname);
		System.out.println("Jersey Number : "+c4.jerseyno);
		System.out.println("Highest Score : "+c4.highestScore);

		

	}

}
