package com.digit.javaTests.week1.ECommerce;

import java.util.Scanner;

public class Clothing {
	public static Product[] mensWearProducts = { new Product("Ethnic Wear", "Black XXL", 1820),
			new Product("Casuals", "Black XL", 2520), new Product("Formals", "White XL", 1600),
			new Product("Sports Wear", "Red XXL", 1200), new Product("Party Wear", "Black XXL", 2200) };
	public static Product[] womensWearProducts = { new Product("Ethnic Wear", "Blue XL", 1600),
			new Product("Casuals", "Black XXL", 1700), new Product("Formals", "White XL", 1600),
			new Product("Sports Wear", "Red XXL", 1200), new Product("Party Wear", "Black L", 2200) };
	public static Product[] kidsWearProducts = { new Product("Ethnic Wear", "Black L", 420),
			new Product("Casuals", "Black L", 520), new Product("Formals", "White L", 600),
			new Product("Sports Wear", "Red L", 200), new Product("Casuals", "Black L", 700) };

	public int chooseSubCategory() {
		System.out.println("In Clothing");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Men\n2. Women\n3. Kid\n");
		System.out.println("Press 9 for Exit");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
