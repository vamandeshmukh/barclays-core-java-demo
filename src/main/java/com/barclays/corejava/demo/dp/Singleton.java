package com.barclays.corejava.demo.dp;

public class Singleton {

	private static Singleton obj = new Singleton();

	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		return obj;
	}

}
