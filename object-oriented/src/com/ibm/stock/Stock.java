package com.ibm.stock;
public class Stock implements Exchange {

	@Override
	public void get() {
		System.out.println("Get Stock");

	}

	@Override
	public void view() {
		System.out.println("View Stock");

	}

	@Override
	public void set() {
		System.out.println("Set Stock");

	}

}
