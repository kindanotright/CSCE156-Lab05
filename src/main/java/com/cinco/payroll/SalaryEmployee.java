package com.cinco.payroll;

public class SalaryEmployee extends Employee{
	
	double annualSalary;
	
	public SalaryEmployee(String id, String firstName, String lastName, String title, double annualSalary) {
		super(id, firstName, lastName, title);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public double getGrossPay() {
		return annualSalary/52;
	}
	
	@Override
	public double getTaxes() {
		return getGrossPay()*.2;
	}
	
	@Override
	public double getNetPay() {
		System.out.println(getGrossPay());
		System.out.println(getTaxes());
		System.out.println(getGrossPay()-getTaxes());
		return getGrossPay()-getTaxes()+100;
	}

}