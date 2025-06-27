package com.cinco.payroll;

public abstract class Employee implements Payable {

	String id;
	String firstName;
	String lastName;
	String title;
	
	public Employee(String id, String firstName, String lastName, String title) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	
	String getId() {
		return this.id;
	}
	
	String getFirstName() {
		return this.firstName;
	}
	
	String getLastName() {
		return this.lastName;
	}
	
	String getTitle() {
		return this.title;
	}
	
	public double getNetPay(){
		return getGrossPay() - getTaxes();
	}
	
	public abstract double getGrossPay();
	
	public abstract double getTaxes();
	
}