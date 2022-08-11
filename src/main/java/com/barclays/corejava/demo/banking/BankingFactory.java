package com.barclays.corejava.demo.banking;

public class BankingFactory {

	public static Bank genInstance(String bankName) {
		switch (bankName) {
		case "Barclays":
			return new Barclays();
		case "Citi":
			return new Citi();
		case "Deutsche":
			return new Deutsche();
		default:
			return null;
		}
	}
}

