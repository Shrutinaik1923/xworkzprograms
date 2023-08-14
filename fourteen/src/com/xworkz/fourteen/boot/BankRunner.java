package com.xworkz.fourteen.boot;

import com.xworkz.fourteen.app.Bank;
import com.xworkz.fourteen.app.CanaraBank;

public class BankRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in BankRunner");
		Bank bank=new CanaraBank();
		bank.agency();
		bank.close();
		bank.credit();
		bank.depositMoney();
		bank.discount();
		bank.loan();
		bank.open();
		bank.withdraw();
		bank.transfer();
	}

}
