package com.bridgelabz.qunatitymeasurement;

public class QuantityMeasurement {
    public int value;

    public QuantityMeasurement() {

    }

    public QuantityMeasurement(int value) {
        this.value = value;
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
