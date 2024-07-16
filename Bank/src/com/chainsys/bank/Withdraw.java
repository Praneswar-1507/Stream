package com.chainsys.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Withdraw {

	public static void main(String[] args) {
		String name,ifsc;
		String accountNum;
		int existingBalance=5000,withdraw,newBalance,deposit;
		Scanner amount=new Scanner(System.in);
		ArrayList<String> list =new ArrayList<>();
		list.add("pranesh");
		ArrayList<String> accNumList =new ArrayList<>();
		accNumList.add("123456789012");
		ArrayList<String> ifscList =new ArrayList<>();
		ifscList.add("ASDF0123456");
		System.out.println("Enter name:");
		name=amount.next();
		while(!name.matches("^[A-Za-z]{5,}$"))
		{
			System.err.println("Enter valid name");
			System.out.println("Enter name:");
			name=amount.next();
		}
		while(!list.contains(name)) {
			System.err.println("name doesnt exist");
			System.out.println("Enter name:");
			name=amount.next();
		}
		System.out.println("Enter Account Number:");
		accountNum=amount.next();
		while(!accountNum.matches("[1-9][0-9]{11}"))
		{
			System.err.println("Enter valid accountnum");
			System.out.println("Enter Account Number:");
			accountNum=amount.next();
		}
		while(!accNumList.contains(accountNum)) {
			System.err.println("account number doesnt exist");
			System.out.println("Enter name:");
			name=amount.next();
		}
		System.out.println("Enter Ifsc:");
		ifsc=amount.next();
		while(!ifsc.matches("^[A-Z]{4}+[0]+[0-9]{6}$"))
		{
			System.err.println("Enter valid Ifsc");
			System.out.println("Enter Ifsc:");
			ifsc=amount.next();
		}
		while(!ifscList.contains(ifsc)) {
			System.err.println("ifsc doesnt exist");
			System.out.println("Enter name:");
			name=amount.next();
		}
		while(true)
		{
			System.out.println("1.Withdraw 2.Deposit 3.Exit");
			String option=amount.next();
		if(option.equals("withdraw"))
		{
		System.out.println("Enter Amount to Withdraw:");
		withdraw=amount.nextInt();
		while(withdraw<=0)
		{
			System.out.println("Enter valid data");
			System.out.println("Enter Amount to Withdraw:");
			withdraw=amount.nextInt();
		}
		if(withdraw> existingBalance)
		{
			System.out.println("Insufficient Balance");
		}
		newBalance=existingBalance-withdraw;
		System.out.println("newbalance:"+newBalance);
		existingBalance=newBalance;
	}
	else if(option.equals("deposit")){
		
		System.out.println("Enter Amount to Deposit:");
		deposit=amount.nextInt();
		while(deposit<=0)
		{
			System.err.println("Enter valid data");
			System.out.println("Enter Amount to Withdraw:");
			withdraw=amount.nextInt();
		}
		newBalance=existingBalance+deposit;
		System.out.println("newbalance:"+newBalance);
		existingBalance=newBalance;
		
																								
	}
	else if(option.equals("exit")) {
		System.out.println("exited successfully");
		return ;
	}
	else
	{
		System.err.println("Enter valid Data");
	}
		}
}
	}

