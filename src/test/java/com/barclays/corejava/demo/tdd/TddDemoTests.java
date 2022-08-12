package com.barclays.corejava.demo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TddDemoTests {

	// get total income of given employee // 100 + 40 + 20 , 160

	@Test
	public void testGetTotalIncome() {

		TddDemo demo = new TddDemo();

		assertEquals(160, demo.getTotalIncome());

	}

}
