package com.barclays.corejava.demo.maths;

public class Calc {

	public int addNums(int i, int j) {

		return i + j;

	}

	public int subNums(int i, int j) {

		return i - j;

	}

	public int divNums(int i, int j) {

		return i / j;

	}

	public double piValue() {
		try {
			Thread.sleep(2975);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 3.142;
	}
}
