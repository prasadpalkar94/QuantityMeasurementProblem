package com.bridgelabz.qunatitymeasurement;

public class QuantityMeasurement implements Unit{

    private double value;

    @Override
    public Double convertValue(UnitType unit, double valueOfUnit) {

        if (unit == UnitType.FAHRENHEIT) {
            return (valueOfUnit - unit.returnValue()) * 5 / 9;
        }
        return valueOfUnit * unit.returnValue();
    }

    public boolean compare(double value1, double value2) {
        return Double.compare(value1, value2) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;         //ref check
        if (o == null || getClass() != o.getClass()) return false;      //null n type
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;  //converting obj param to type of QM
        return this.compare(quantityMeasurement.value, value);      //value check
    }
}

