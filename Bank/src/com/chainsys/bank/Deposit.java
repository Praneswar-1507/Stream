package com.chainsys.bank;

import java.util.Scanner;

public class Deposit {

	public static void main(String[] args) {
		BankA banka=new BankA();
		BankB bankb=new BankB();
		BankC bankc=new BankC();
		Scanner deposit=new Scanner(System.in);
		
		System.out.println("Enter the bank option to view the current balance 1.BankA 2.BankB 3.Bankc");
		String option=deposit.next();
		switch(option)
		{
		case "BankA" :
			System.out.println(banka.getBalance());
			break;
		case "BankB" :	
			System.out.println(bankb.getBalance());
			break;
		case "BankC" :
			System.out.println(bankc.getBalance());
			break;
		}

	}

}
