package com.ibm.stock;

public class StockSingleton {
	
	private static Stock s;

	public static Stock getStock() {
		if(s == null)
			s = new Stock();
		
		return s;
	}
}
