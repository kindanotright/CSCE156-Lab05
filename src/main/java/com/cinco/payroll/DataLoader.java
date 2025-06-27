package com.cinco.payroll;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader {

	public static final String FILE_PATH = "data/employee.csv";

	public static List<Employee> loadEmployees() {

		List<Employee> result = new ArrayList<Employee>();
		
		String line = null;

		try (Scanner s = new Scanner(new File(FILE_PATH))) {

			int numRecords = Integer.parseInt(s.nextLine());
			for (int i = 0; i < numRecords; i++) {

				line = s.nextLine();
				if (!line.trim().isEmpty()) {
					Employee e = null;
					String tokens[] = line.split(",");
					String id = tokens[1];
					String lastName = tokens[2];
					String firstName = tokens[3];
					String title = tokens[4];
					double annualSalary = 0.0, hourlyPayRate = 0.0, hoursWorked = 0.0;
					if (tokens.length == 7) {
						hourlyPayRate = Double.parseDouble(tokens[5]);
						hoursWorked = Double.parseDouble(tokens[6]);
					} else if (tokens.length == 6) {
						annualSalary = Double.parseDouble(tokens[5]);
					}

					if (tokens[0].equals("E")) {
						// TODO: modify this to create a SalaryEmployee 
						// I believe this is completed
						e = new SalaryEmployee(id, lastName, firstName, title, annualSalary);
					} else if (tokens[0].equals("S")) {
						// TODO: modify this to create a Staff employee
						// I believe this is completed
						e = new Staff(id, lastName, firstName, title, hourlyPayRate, hoursWorked);
					} else if (tokens[0].equals("T")) {
						// TODO: modify this to create a Temporary employee
						// I believe this is completed
						e = new Temporary(id, firstName, lastName, title, hourlyPayRate,
								hoursWorked) ;
					}

					result.add(e);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Encountered Error on line " + line, e);
		}

		return result;
	}
}
