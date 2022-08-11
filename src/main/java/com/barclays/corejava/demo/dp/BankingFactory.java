package com.barclays.corejava.demo.dp;

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

interface Bank {

	public abstract void service();

}

class Barclays implements Bank {

	@Override
	public void service() {
		System.out.println("Welcome to Barclays");
	}

}

class Deutsche implements Bank {

	@Override
	public void service() {
		System.out.println("Welcome to Deutsche");
	}

}

class Citi implements Bank {

	@Override
	public void service() {
		System.out.println("Welcome to Citi");
	}

}
