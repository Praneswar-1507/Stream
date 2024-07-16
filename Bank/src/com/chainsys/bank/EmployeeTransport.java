package com.chainsys.bank;

import java.util.Scanner;

public class EmployeeTransport {

		  public static int findCountOfEmployeesUsingCompTransport(EmployeeDetails[] employees, String branch) {
	            int count = 0;
	            for (EmployeeDetails emp : employees) {
	                if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
	                    count++;
	                }
	            }
	            return count;

	        }

	        public static EmployeeDetails findEmployeeWithSecondHighestRating(EmployeeDetails[] employees) {
	            if (employees.length < 2) {
	                return null;
	            }

	            EmployeeDetails highestEmployee = null;
	            EmployeeDetails secondHighestEmployee = null;

	            for (EmployeeDetails emp : employees) {
	                if (!emp.isCompanyTransport()) {
	                    if (highestEmployee == null || emp.getRating() > highestEmployee.getRating()) {
	                        secondHighestEmployee = highestEmployee;
	                        highestEmployee = emp;
	                    } else if (secondHighestEmployee == null || emp.getRating() > secondHighestEmployee.getRating()) {
	                        secondHighestEmployee = emp;
	                    }
	                }
	            }

	            return secondHighestEmployee;
	        }

	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);
	            int n;
	            System.out.println("Enter the array size:");
	            n = scanner.nextInt();
	            EmployeeDetails[] employees = new EmployeeDetails[n];

	            for (int i = 0; i < n; i++) {
	                System.out.println("Enter your employeeId:");
	                int employeeId = scanner.nextInt();
	                scanner.nextLine();
	                System.out.println("Enter your employee name:");
	                String name = scanner.nextLine();
	                System.out.println("Enter your branch name:");
	                String branch = scanner.nextLine();
	                System.out.println("Enter your rating");
	                double rating = scanner.nextDouble();
	                System.out.println("Are u using transport are not:");
	                boolean companyTransport = scanner.nextBoolean();
	                employees[i] = new EmployeeDetails(employeeId, name, branch, rating, companyTransport);
	            }
	            System.out.println("Enter the branch input:");
	            String branchInput = scanner.next();

	            int count = findCountOfEmployeesUsingCompTransport(employees, branchInput);
	            if (count > 0) {
	                System.out.println(count);
	            } else {
	                System.out.println("no such employees are not used transport for this branch");
	            }
	            EmployeeDetails secondHighestEmployee = findEmployeeWithSecondHighestRating(employees);
	            if (secondHighestEmployee != null) {
	                System.out.println(secondHighestEmployee.getEmployeeId());
	                System.out.println(secondHighestEmployee.getName());
	            } else {
	                System.out.println("Using company transport");
	            }

	          
	        }
	        
}

	

