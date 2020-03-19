package com.bridgelabz.qunatitymeasurement;

public enum UnitType implements Unit {
    INCH(1), FEET(12), YARD(36), CENTI_METER(0.4),

    KILOGRAM(1.0), GRAM(0.001), TONNE(1000.0),

    GALLON(3.78), LITRE(1.0), MILLI_LITRE(0.001);
    public final double value;

    UnitType(double value) {
        this.value = value;
    }

    @Override
    public Double convertValue(Double unit) {
        return this.value * unit;
    }

}