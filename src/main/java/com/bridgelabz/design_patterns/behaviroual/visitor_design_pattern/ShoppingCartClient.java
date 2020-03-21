package com.bridgelabz.design_patterns.behaviroual.visitor_design_pattern;

import java.util.Scanner;

public class ShoppingCartClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Book Name: ");
		String bookName = scan.next();
		ItemElement[] items = new ItemElement[]{new Book(20, "1234", bookName),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items) {
			System.out.println(item);
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
