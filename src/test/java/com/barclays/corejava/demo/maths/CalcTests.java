package com.barclays.corejava.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalcTests {

	private static Calc calc;

	@BeforeAll
	public static void setUp() {
		System.out.println("setUp");
		calc = new Calc();
	}

	@AfterAll
	public static void finish() {
		System.out.println("finish");
		calc = null;
	}

	@BeforeEach
	public void runEveryTime() {
		System.out.println("once before each test case");
	}

	@AfterEach
	public void runEveryTimeAfterwards() {
		System.out.println("once after each test case");
	}

	@Test
	public void addNumsTest() {
		int expected = 30;
		int actual = calc.addNums(10, 20);
		assertEquals(expected, actual);
//		assertEquals(30, calc.addNums(10, 20));
	}

	@Test
	public void addNumsTest2() {
		int unexpected = 31;
		int actual = calc.addNums(10, 20);
		assertNotEquals(unexpected, actual);
	}

//	@Disabled
	@Test
	public void subNumsTest() {
		int expected = 5;
		int actual = calc.subNums(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void subNumsTest2() {
		int unexpected = 6;
		int actual = calc.subNums(10, 5);
		assertNotEquals(unexpected, actual);
	}

	@Disabled
	@Test
	@Timeout(value = 3000, unit = TimeUnit.MILLISECONDS)
	public void piValueTest() {
		assertEquals(3.142, calc.piValue());

	}

	@Test
	public void divNumsTest() {
		assertThrows(ArithmeticException.class, () -> calc.divNums(10, 0));
//		assertThrows(NumberFormatException.class, () -> calc.divNums(10, 0));
	}

}
