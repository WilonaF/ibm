package com.ibm.emp;
public class Executive extends Employee {

	private double incentives;
	
	public Executive() {
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentives;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentives: "+incentives);
	}
	
	

	
	
	
}
