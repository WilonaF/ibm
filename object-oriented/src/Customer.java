
public class Customer {

	private int custId;
	private String custName;
	private double creditLimit;
	
	private static int autogen = 1001;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, double creditLimit) {
		this.custId = autogen++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	
	public void showDetails() {
		System.out.println("Customer ID: "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("Credit Limit: "+creditLimit);
	}
}
