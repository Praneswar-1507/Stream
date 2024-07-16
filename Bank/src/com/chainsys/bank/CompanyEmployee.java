package com.chainsys.bank;

import java.util.Scanner;

public class CompanyEmployee {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Enter company name: ");
	        String companyName = scanner.nextLine();
	        System.out.println("Enter number of employees: ");
	        int numEmployees = scanner.nextInt();
	        scanner.nextLine(); 

	       
	        Employee[] employees = new Employee[numEmployees];

	     
	        for (int i = 0; i < numEmployees; i++) {
	            System.out.println("Employee " + (i + 1) + ":");
	            System.out.println("Enter id: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); 
	            System.out.println("Enter name: ");
	            String name = scanner.nextLine();
	            System.out.println("Enter designation: ");
	            String designation = scanner.nextLine();
	            System.out.println("Enter salary: ");
	            double salary = scanner.nextDouble();
	            scanner.nextLine(); 

	        
	            employees[i] = new Employee(id, name, designation, salary);
	        }

	      
	        Company company = new Company(companyName, employees, numEmployees);

	      
	        System.out.println("Average salary: " + company.getAverageSalary());
	        System.out.println("Max salary: " + company.getMaxSalary());

	        String designation = "Engineer";
	        System.out.println("Employees with designation: " + designation);
	        Employee[] engineers = company.getEmployeesByDesignation(designation);
	        for (Employee emp : engineers) {
	            System.out.println(emp.toString());
	        }
	}
}