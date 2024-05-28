package com.javaexamples;

import java.util.Scanner;
//
//2)the program prompts the user to enter the lengths of the three sides of a triangle. Based on this input, it determines the type of triangle:
//
//If all three sides are equal, it's an equilateral triangle.
//If two sides are equal, it's an isosceles triangle.
//If all three sides are different, it's a scalene triangle.

public class ThreeSidesOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side3 of the Triangle: ");
		int side1 = sc.nextInt();
		System.out.println("Enter side1 of the Triangle: ");
		int side2 = sc.nextInt();
		System.out.println("Enter side2 of the Triangle: ");
		int side3 = sc.nextInt();
		
		if(side1 == side2 && side1 == side3 && side2 == side3) {
			System.err.println("3");
		}else if(side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("2");
		}else {
			System.out.println("1");
		}
		

	}

}
