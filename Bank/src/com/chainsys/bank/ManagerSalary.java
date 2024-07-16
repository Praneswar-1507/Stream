package com.chainsys.bank;

public class ManagerSalary extends Member {
String department,specialization;
	public ManagerSalary(String name, String address, int age,String phonenumber, double salary,String department,String specialization) {
		super(name, address, age, phonenumber, salary);
		this.department=department;
		this.specialization=specialization;
		
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
	 public static void main(String[] args) {
         
         EmployeeSalary employee = new EmployeeSalary("pranesh","dindigul", 22, "9942613241", 20000, "it","Fullstack");
         ManagerSalary manager = new ManagerSalary("chandru", "dindigul", 10, "9942613240", 10000,"management","Fullstack");
         manager.print();
         manager.printSalary();
         employee.print();
         employee.printSalary();
       
                   
     }
	

}
