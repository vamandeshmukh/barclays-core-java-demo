package com.barclays.corejava.demo.dp;

// factory method design pattern 

public class FactoryDemo {

	public static void main(String[] args) {

		Bank bank1 = BankingFactory.genInstance("Barclays");
		bank1.service();

		Bank bank2 = BankingFactory.genInstance("Citi");
		bank2.service();

		Bank bank3 = BankingFactory.genInstance("Deutsche");
		bank3.service();
	}

}
