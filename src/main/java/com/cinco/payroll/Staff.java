package com.cinco.payroll;

public  class Staff extends HourlyEmployee {

	double taxRate = 0.15;
	
	public Staff(String id, String firstName, String lastName, String title, double hourlyPayRate, double hoursWorked) {
		super (id, firstName, lastName, title, hourlyPayRate, hoursWorked);
	}
	
	@Override
	public double getTaxes() {
		return getGrossPay() * taxRate;
	}

	
}