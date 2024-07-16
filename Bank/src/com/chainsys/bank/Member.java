package com.chainsys.bank;

public class Member {
String name,address;
int age;
String phonenumber;
double salary;

public Member(String name, String address, int age, String phonenumber, double salary) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
	this.phonenumber = phonenumber;
	this.salary = salary;
}
public void printSalary() {
    System.out.println("Salary:" + salary);
}

}
