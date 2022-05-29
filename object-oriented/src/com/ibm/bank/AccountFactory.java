package com.ibm.bank;

public class AccountFactory {

	public Savings openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public Current openCurrentAccount(String holder) {
		
	}
}
