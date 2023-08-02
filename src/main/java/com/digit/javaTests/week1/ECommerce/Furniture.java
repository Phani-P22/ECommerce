package com.digit.javaTests.week1.ECommerce;

import java.util.Scanner;

public class Furniture {

	public static Product[] Sofa = { new Product("Nilkamal", "Brown 6 Seater Sofa", 32000),
			new Product("Durian", "Black 3 Seater Sofa", 18020), new Product("Furny", "Grey 5 Seater Sofa", 16999),
			new Product("Wooden Street", "Brown 3 Seater Sofa", 12000),
			new Product("Vittoria", "Black 6 Seater Sofa", 35000) };

	public static Product[] Table = { new Product("Wood Buzz", "Brown 1 pcs", 2220),
			new Product("Furinno", "White 1 pcs", 3500), new Product("Bluewud", "Black 2 pcs", 3500),
			new Product("Feather Lite", "Brown 1 pcs", 2500), new Product("Space wood", "Grey 1 pcs", 2500) };

	public static Product[] Bed = { new Product("Wakefit", "White 1 pcs", 15000),
			new Product("Furniture Kart", "Black 1 pcs", 19200), new Product("Nilkamal", "Brown 1 pcs", 25000),
			new Product("Sleep Well", "Grey 1 pcs", 22200), new Product("Kurlon", "Brown 1 pcs", 27000) };

	public static int chooseFurnitureSubCategory() {
		System.out.println("In Furniture");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Sofa\n2. Table\n3. Bed\n");
		System.out.println("Press 9 for Exit");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}