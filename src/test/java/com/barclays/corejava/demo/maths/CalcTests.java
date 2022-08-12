package com.barclays.corejava.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTests {

	@Test
	public void addNumsTest() {

		Calc calc = new Calc();

		int expected = 30;
		int actual = calc.addNums(10, 20);

		assertEquals(expected, actual);

	}

}
