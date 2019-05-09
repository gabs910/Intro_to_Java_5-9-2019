package com.stock;

public class Customer {

	private String customerName;
	private double acctBal;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAcctBal() {
		return acctBal;
	}
	public void setAcctBal(double acctBal) {
		this.acctBal = acctBal;
	}
	
	public void PrintAcctDetail(){
		System.out.println("Your account details:/n");
		System.out.println("Name: " + customerName);
		System.out.println("Account Balance: " + acctBal);


		
	}
}
