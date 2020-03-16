package com.bridgelabz.qunatitymeasurement;

public class QuantityMeasurement {
    public int value;

    public double calculateUnit(UnitType type, double unit) {
        return unit * type.unit;
    }

    public QuantityMeasurement() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null)
            return true;
        if (getClass() != o.getClass())
            return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return value == that.value;
    }
}
