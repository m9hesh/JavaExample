package com.javaexamples;

import java.util.Scanner;

public class AreaOfRectangle {
	double length;

	public static void main(String[] args) {
		userInput();

	}

	private static void calculateArea(double length, double width) {
		
		double area = length * width;
		areaOutput(area);
		
	}

	private static void areaOutput(double area) {
		System.out.println(area);
	}

	private static void userInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle:");
		double length = sc.nextDouble();

		System.out.println("Enter the width of the rectangle:");
		double width = sc.nextDouble();
		
		calculateArea(length, width);

	}

}
