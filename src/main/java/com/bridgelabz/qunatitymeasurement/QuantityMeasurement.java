package com.bridgelabz.qunatitymeasurement;

public class QuantityMeasurement {
    public int value;

    public double calculateUnit(LengthType type, double unit) {
        return unit * type.unit;
    }

    public QuantityMeasurement() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (getClass() != o.getClass())
            return false;
        if (o == null)
            return true;
        QuantityMeasurement obj = (QuantityMeasurement) o;
        return Double.compare(obj.value, value) == 0;
    }
}
