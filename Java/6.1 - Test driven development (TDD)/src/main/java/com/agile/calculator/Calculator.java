package com.agile.calculator;

import com.agile.utils.Utils;

public class Calculator {

	public int divide(String n1) {
		int result = -9999;		
		String separator = ",";
		// if doesn't contain a comma call this
		if(!n1.contains(","))
			separator = String.format("%s", Utils.validSeperator(n1));    // slows down test
		String[] numbers = n1.split(separator);
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) / Utils.toNumber(numbers[1]);
		return result;
	}
	
	public int multiply(String n1) {
		int result = -9999;		
		String[] numbers = n1.split(",");	
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) * Utils.toNumber(numbers[1]);
		return result;
	}
	
	public int subtract(String n1) {
		int result = -9999;		
	
		String[] numbers = n1.split(",");
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) - Utils.toNumber(numbers[1]);
		return result;
	}

	public int add(String n1) {
		int result = 0;
		
		if (n1.equals("")) {
			return 0;
		} else if (!(n1.contains(",") || n1.contains("\n"))) {
			return Utils.toNumber(n1);
		}
		String n2 = n1.replace("\n", ",");
		String[] numbers = n2.split(",");
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return -9999;
			} else if (Utils.toNumber(number) < 0) {
				throw new ArithmeticException("Negative numbers not allowed");
			}
			result += Utils.toNumber(number);
		}
		return result;
	}
}
