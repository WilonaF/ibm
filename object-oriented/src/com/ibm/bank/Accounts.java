package com.ibm.bank;

public abstract class Accounts implements Bank{

	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	
	public Accounts() {
	}

	public Accounts(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/c No: "+acntNo);
		System.out.println("Holder: "+holder);
		System.out.println("Balance: "+balance);
	}
	
	//Business Login (BL) methods
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public abstract void withdraw(double amount);
	
}
