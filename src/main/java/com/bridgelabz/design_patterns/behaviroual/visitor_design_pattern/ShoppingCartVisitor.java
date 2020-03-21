package com.bridgelabz.design_patterns.behaviroual.visitor_design_pattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
