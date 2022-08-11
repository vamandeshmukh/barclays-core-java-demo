package com.barclays.corejava.demo.banking;

public interface Bank {

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
