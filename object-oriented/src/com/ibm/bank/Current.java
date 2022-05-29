package com.ibm.bank;
public class Current extends Accounts {

	private double overdraft;
	
	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
		overdraft = 10000;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		
	}

	@Override
	public void withdraw(double amount) {
	}
}
