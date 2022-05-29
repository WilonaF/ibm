package com.ibm.shop;

public class Cart {
	private double total;
	private Product[] products;
	private int idx;
	
	public Cart() {
		products = new Product[5];
	}
	
	public void addToCart(Product p) {
		//Add product to cart and price to total
		products[idx] = p;
		idx++;
		total += p.getPrice();
		System.out.println("Product added to cart");
	}
	
	public void checkout() {
		System.out.println("Your Shopping Cart...");
		for (int i = 0; i < idx; i++) {
			products[i].description();
		}
		System.out.println("Cart Total: "+total);
	}
}
