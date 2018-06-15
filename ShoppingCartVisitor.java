package com.bridgelabz.DesignPatterns;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
