package com.agile.calculator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

	private Calculator calc;

	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}

	@AfterEach
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
		int res = calc.subtract("3,h");
		assertEquals(-9999, res);
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
		int res = calc.divide("h,2");
		assertEquals(-9999, res);
	}

	@Test
	public void divisionTest4() {
		assertThrows(
			Exception.class,	
			() -> calc.divide("2,0"),
			"Should throw excpetio for division by zero"
		);
	}
}
