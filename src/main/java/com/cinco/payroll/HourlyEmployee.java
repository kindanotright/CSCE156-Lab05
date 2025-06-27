package com.cinco.payroll;

public abstract class HourlyEmployee extends Employee {

	double hourlyPayRate;
	double hoursWorked;

	public HourlyEmployee(String id, String firstName, String lastName, String title, double hourlyPayRate,
			double hoursWorked) {
		super (id, firstName, lastName, title);
		this.hourlyPayRate = hourlyPayRate;
		this.hoursWorked = hoursWorked;
	}

	double getHourlyPayRate() {
		return this.hourlyPayRate;
	}
	
	double getHoursWorked() {
		return this.hoursWorked;
	}
	
	public double getGrossPay(){
		return getHourlyPayRate()*getHoursWorked();
	}

}