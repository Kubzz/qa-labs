package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.agile.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@Test
	public void subtractTest() {
		calculator = new Calculator();
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract2Test() {
		calculator = new Calculator();
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3Test() {
		calculator = new Calculator();
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide() {
		calculator = new Calculator();
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divide2() {
		calculator = new Calculator();
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply() {
		calculator = new Calculator();
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply2() {
		calculator = new Calculator();
		int expected = 600;
		int actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator = new Calculator();
		calculator.divide("10,0");
	}

	@Test
	public void emptyStrReturnsZero() {
		calculator = new Calculator();
		int expected = 0;
		int actual = calculator.add("");
		assertEquals(expected, actual);
	}

	@Test
	public void singleNumberReturned() {
		calculator = new Calculator();
		int expected = 1;
		int actual = calculator.add("1");
		assertEquals(expected, actual);
	}

	@Test
	public void twoNumbersAdded() {
		calculator = new Calculator();
		int expected = 5;
		int actual = calculator.add("2,3");
		assertEquals(expected, actual);
	}

	@Test
	public void twoNumbersAddedSeperatedByNewline() {
		calculator = new Calculator();
		int expected = 5;
		int actual = calculator.add("2\n3");
		assertEquals(expected, actual);
	}

	@Test
	public void threeNumbersAdded() {
		calculator = new Calculator();
		int expected = 9;
		int actual = calculator.add("2\n3,4");
		assertEquals(expected, actual);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void negativeNumberThrowsException() {
		calculator = new Calculator();
		calculator.add("-1,4");
	}

}
