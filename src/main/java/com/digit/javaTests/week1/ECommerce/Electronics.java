package com.digit.javaTests.week1.ECommerce;

import java.util.Scanner;

public class Electronics {

	public static Product[] laptopProducts = { new Product("Dell", "i5 10th gen 8 GB RAM", 48000),
			new Product("Lenovo", "i5 10th gen 8 GB RAM", 39000),
			new Product("HP", "i5 10th gen 8 GB RAM", 45000),
			new Product("Acer", "i7 11th gen 8 GB RAM", 62000),
			new Product("Asus", "i7 12th gen 16 GB RAM", 65000) };
	public static Product[] mobileProducts = { new Product("Oppo", "6 GB RAM 6000mAh Battery", 27999),
			new Product("Samsung", "4 GB RAM 5000mAh Battery", 19000),
			new Product("RealMe", "6 GB RAM 5000mAh Battery", 19000),
			new Product("OnePlus", "8 GB RAM 8000mAh Battery", 40000),
			new Product("Vivo", "6 GB RAM 5000mAh Battery", 28000) };
	public static Product[] Wearables = { new Product("Fire Boltt", "Black Circle Voice Control", 1800),
			new Product("Noise", "Brown Square Call Function", 1300),
			new Product("Boat", "White Rectangle Call Function", 1300),
			new Product("Fastrack", "Black Square Voice Control", 2100),
			new Product("Fossil", "Green Round Inbuilt Games", 1220) };

	public static int chooseElectronicsSubCategory() {
		System.out.println("In Electronics");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Laptops\n2. Mobiles\n3. Wearables\n");
		System.out.println("Press 9 for Exit");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
