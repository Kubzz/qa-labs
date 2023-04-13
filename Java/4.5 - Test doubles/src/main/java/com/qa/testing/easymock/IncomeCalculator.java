package com.qa.testing.easymock;

public class IncomeCalculator {

    public double calc(ICalcMethod calcMethod, Position position) {
        if (calcMethod == null) {
            throw new RuntimeException("CalcMethod not yet maintained");
        }
        if (position == null) {
            throw new RuntimeException("Position not yet maintained");
        }
        return calcMethod.calc(position);
    }
}
