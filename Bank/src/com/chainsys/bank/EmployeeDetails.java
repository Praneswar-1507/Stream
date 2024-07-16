package com.chainsys.bank;

public class EmployeeDetails {
	      public int employeeId;
	        public String name;
	        public String branch;
	        public double rating;
	        public boolean companyTransport;

	        public EmployeeDetails(int employeeId, String name, String branch, double rating, boolean companyTransport) {
	            this.employeeId = employeeId;
	            this.name = name;
	            this.branch = branch;
	            this.rating = rating;
	            this.companyTransport = companyTransport;
	        }

	        public int getEmployeeId() {
	            return employeeId;
	        }

	        public String getName() {
	            return name;
	        }

	        public String getBranch() {
	            return branch;
	        }

	        public double getRating() {
	            return rating;
	        }

	        public boolean isCompanyTransport() {
	            return companyTransport;
	        }

			
	}

