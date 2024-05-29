package com.javaexamples;
//1)the program prompts the user to enter their age and the time of the movie. Based on this input, it determines the price of the movie ticket.

//
//The conditions are as follows:
//
//Children under 5 and senior citizens (age 60 and above) get a free ticket.
//Matinee price is 250 for shows before noon.
//Evening price is 300 for shows between 5 PM and 9 PM.
//Regular price is 200 for all other times.

import java.util.Scanner;

public class MoviePrice {

	public static void main(String[] args) {
		int age;
		int time = 0;
		int PRICE = 200;
		boolean seniorSetizen = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age: ");
		age = sc.nextInt();
		
		System.out.println("Enter Your Movie Time: ");
		time = sc.nextInt();
		
		if (age <= 5 || age >= 60) {
			System.out.println("You are a Senior Setizen So you are eligible for free Ticket");
		}else if (time <= 4) {
			PRICE += 50;
			System.out.println("Pay " + PRICE + " For Your movie ticket.");
		} else if (time >= 5 && time <= 9) {
			PRICE += 100;
			System.out.println("Pay " + PRICE + " For Your movie ticket.");
		}
		

	}

}
