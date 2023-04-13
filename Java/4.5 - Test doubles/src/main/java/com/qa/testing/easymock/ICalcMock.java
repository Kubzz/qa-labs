package com.qa.testing.easymock;

public class ICalcMock implements ICalcMethod{
    public double calc(Position position) {
        if (position == Position.BOSS) {
            return 100;
        } else if (position == Position.PROGRAMMER) {
            return 50;
        } else if (position == Position.SURFER) {
            return 25;
        }
        return 0;
    }
}
