package com.qa.testing.easymock;

public class Main {
    static IncomeCalculator cal = new IncomeCalculator();
    static ICalcMethod mock = new ICalcMock();

    public static void main(String[] args) {
        System.out.println(cal.calc(mock, Position.SURFER));
    }
}
