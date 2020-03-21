package com.bridgelabz.design_patterns.behaviroual.visitor_design_pattern;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
