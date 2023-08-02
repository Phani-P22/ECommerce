package com.digit.javaTests.week1.ECommerce;

import java.util.Scanner;

abstract class SubCategory {
	
	abstract int chooseSubCategory();

	static void displaySubCategories(Product[] curProductSubCategories) {
		int len = curProductSubCategories.length;

		for (int i = 0; i < len; i++) {
			System.out.println("Product No. " + (i + 1));
			Product curProduct = curProductSubCategories[i];
			System.out.println("\tProduct Name: " + curProduct.getName());
			System.out.println("\tProduct Description: " + curProduct.getDescription());
			System.out.println("\tPrice: " + curProduct.getPrice());
			System.out.println();
		}
	}

	static Product inputProductsFromUser(Product[] curProductSubCategories) {
		Scanner sc = new Scanner(System.in);
		Product userChosenProduct;

		System.out.println("Choose From Products");

		int choice = sc.nextInt();
		if (choice <= 0 || choice > curProductSubCategories.length) {
			System.out.println("Please Choose from Existing Products");
			return null;
		}
		userChosenProduct = curProductSubCategories[choice - 1];
		System.out.println("You Have Choosen: ");
		System.out.println("\tProduct Name: " + userChosenProduct.getName());
		System.out.println("\tProduct Description: " + userChosenProduct.getDescription());
		System.out.println("\tPrice: " + userChosenProduct.getPrice());
		
		return userChosenProduct;
	}

}
