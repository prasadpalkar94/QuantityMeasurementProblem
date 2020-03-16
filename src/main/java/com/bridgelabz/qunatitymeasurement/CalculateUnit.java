package com.bridgelabz.qunatitymeasurement;

public class CalculateUnit {

    public double calculateUnit(LengthType type, double unit) {
        if (type.equals(LengthType.FEET)) {
            unit = unit * 12;
            return unit;
        }
        if (type.equals(LengthType.INCH)) {
            unit = unit / 12;
            return unit;

        }
        return unit;
    }
}
