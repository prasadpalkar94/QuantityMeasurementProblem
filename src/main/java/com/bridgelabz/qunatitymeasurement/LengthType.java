package com.bridgelabz.qunatitymeasurement;

public enum LengthType {
    FEET(1 * 12.0), INCH(1 / 12.0), YARD(1 * 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36), FEET_TO_YARD(1 / 3),YARD_TO_FEET(1 * 3.0),
    INCH_TO_CM(1*2.54), CM_TO_INCH(1 / 2.54);

    public final double unit;

    LengthType(double unit) {
        this.unit = unit;
    }
}
