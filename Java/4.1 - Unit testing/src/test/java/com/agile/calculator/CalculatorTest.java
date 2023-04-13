package com.agile.calculator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	@Before
	public void setup() {
		calc = new Calculator();
	}

	@After
	public void tearDown() {
		calc = null;
	}

	@Test
	public void subtractionTest1() {
		int res = calc.subtract("3,2");
		assertEquals(1, res);
	}
	
	@Test
	public void subtractionTest2() {
		int res = calc.subtract("2,3");
		assertEquals(-1, res);
	}

	@Test
	public void subtractionTest3() {
		int res = calc.subtract("3,0");
		assertEquals(3, res);
	}

	@Test
	public void subtractionTest4() {
		int res = calc.subtract("3,h");
		assertEquals(-9999, res);
	}

	@Test
	public void subtractionTest5() {
		assertThrows(Exception.class,() -> calc.subtract("3"));
	}

	@Test
	public void multiplicationTest1() {
		int res = calc.multiply("3,2");
		assertEquals(6, res);
	}

	@Test
	public void multiplicationTest2() {
		int res = calc.multiply("-3,2");
		assertEquals(-6, res);
	}

	@Test
	public void multiplicationTest3() {
		int res = calc.multiply("3,0");
		assertEquals(0, res);
	}

	@Test
	public void multiplicationTest4() {
		int res = calc.multiply("h,2");
		assertEquals(-9999, res);
	}

	@Test
	public void multiplicationTest5() {
		assertThrows(Exception.class,() -> calc.multiply("3"));

	}

	@Test
	public void divisionTest1() {
		int res = calc.divide("6,2");
		assertEquals(3, res);
	}

	@Test
	public void divisionTest2() {
		int res = calc.divide("-6,2");
		assertEquals(-3, res);
	}

	@Test
	public void divisionTest3() {
		int res = calc.divide("2 2");
		assertEquals(1, res);
	}

	@Test
	public void divisionTest4() {
		int res = calc.divide("h,2");
		assertEquals(-9999, res);
	}

	@Test
	public void divisionTest5() {
		assertThrows(Exception.class, () -> calc.divide("2,0"));
	}
}
