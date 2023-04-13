package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.agile.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@After
	public void clean() {
		calculator = null;
	}

	@Test
	public void subtractTest() {
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract2Test() {
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3Test() {
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divideTest() {
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divide2Test() {
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiplyTest() {
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply2Test() {
		int expected = 600;
		int actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator.divide("10,0");
	}

}
