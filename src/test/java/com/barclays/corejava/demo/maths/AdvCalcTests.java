package com.barclays.corejava.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AdvCalcTests {

	@Test
	public void addNumsTest() {
		AdvCalc ac = new AdvCalc();
		assertEquals(60, ac.addNumsWithGst(10, 20, 30));
	}

	@Test
	public void addNumsTest2() {
		AdvCalc ac = new AdvCalc();
		assertNotEquals(61, ac.addNumsWithGst(10, 20, 30));

	}
}
