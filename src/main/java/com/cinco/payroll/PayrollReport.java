package com.cinco.payroll;

import java.util.List;

/**
 * This is the main driver program that parses the payroll
 * data file and produces a payroll report.
 *
 */
public class PayrollReport {
	
	public static void main(String args[]) {

		List<Employee> payroll = DataLoader.loadEmployees();

		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%-8s %-20s %-30s %9s %9s %9s\n", 
				"ID", "Name", "Title", "Gross", "Taxes", "Net"));

		//for each employee
		for(Employee e : payroll) {
			//format their information
			String id = e.getId();
			String name = e.getFirstName() + " " + e.getLastName();
			String title = e.getTitle();
			double grossPay = e.getGrossPay();
			double taxes = e.getTaxes();
			double netPay = e.getNetPay();
			sb.append(String.format("%-8s %-20s %-30s $%8.2f $%8.2f $%8.2f\n", 
					id, name, title, grossPay, taxes, netPay));
			
//			String id = e.getId();
//		    String name = e.getFirstName() + " " + e.getLastName();  // No getName() method in Employee, so we build it here
//		    String title = e.getTitle();
//		    double gross = e.getGrossPay();
//		    double taxes = e.getTaxes();
//		    double netPay = e.getNetPay();
//			sb.append(String.format("%-8s %-20s %-30s $%8.2f $%8.2f $%8.2f\n", 
//					id, name, title, grossPay, taxes, netPay; //TODO: replace these with the appropriate method calls
		}
		
		System.out.println(sb);
	}
	
}
