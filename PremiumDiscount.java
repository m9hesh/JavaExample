package com.javaexamples;

import java.util.Scanner;

//4) the program prompts the user to enter their membership status (premium or non-premium) and their total purchase amount. Based on this input, it determines if the person is eligible for any discounts:
//
//Premium members get a 20% discount for purchases over 1000.
//Non-premium members get a 15% discount for purchases over 2000.
public class PremiumDiscount {

	public static void main(String[] args) {
		boolean premiumMem;
		double purchase;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have Premium Membership?true/false :");
		premiumMem = sc.nextBoolean();
		
		System.out.println("Enter Your Total Purchase: ");
		purchase = sc.nextDouble();
		
		if(premiumMem) {
			total = purchase + (purchase * 0.20);
		}else {
			total = purchase + (purchase * 0.15);
		}
		System.out.println(total);
		
		

	}

}
