package com.chainsys.bank;

public class EmployeeSalary extends Member {
String specialization,department;
	public EmployeeSalary(String name, String address, int age, String phonenumber, double salary,String department,String specialization) {
		super(name, address, age, phonenumber, salary);
		this.specialization=specialization;
		this.department=department;
		}
	public void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("PhoneNumber:"+phonenumber);
		System.out.println("Address:"+address);
		System.out.println("Specialization:"+specialization);
		System.out.println("Department:"+department);
		System.out.println("Salary:"+salary);
	}
	 
	

}
