package com.bridgelabz.design_patterns.behaviroual.visitor_design_pattern;

public class Book implements ItemElement {
	private int price;
	private String isbnNumber;
	private String bookName;
	
	public Book(int cost, String isbn, String bookNames) {
		this.price=cost;
		this.isbnNumber=isbn;
		this.bookName = bookNames;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}
	
	public String getBookName() {
		return bookName;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
