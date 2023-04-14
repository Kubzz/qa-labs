package com.qa.core;

public class Calculator {
	private int answer;

	public Calculator() {
		this.answer = 0;
	}

	public void calcTwoNumber(String type, int x, int y) {
		if (type.equals("add")) {
			this.answer = x + y;
		} else if (type.equals("subtract")) {
			this.answer = x - y;
		} else if (type.equals("multiply")) {
			this.answer = x * y;
		}
	}

	public int getresult() {
		return this.answer;
	}
}