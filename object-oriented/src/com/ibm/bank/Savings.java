package com.ibm.bank;
public class Savings extends Accounts {

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Savings(String holder) {
		super(holder, 1000);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void withdraw(double amount) {
		if(amount<(balance-1000))
				balance-=amount;
		else
			System.out.println("Insufficient balance!");
	}
	
	
	
	
}
