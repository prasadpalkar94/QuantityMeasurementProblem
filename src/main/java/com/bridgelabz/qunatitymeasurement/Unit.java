package com.bridgelabz.qunatitymeasurement;
@FunctionalInterface
public interface Unit {
    public Double convertValue(UnitType unit, double valueOfUnit);

    default double addition(double value1, double value2) {
        return value1 + value2;
    }
}
