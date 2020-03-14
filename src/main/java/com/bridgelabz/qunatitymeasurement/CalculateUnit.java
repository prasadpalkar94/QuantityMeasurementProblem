package com.bridgelabz.qunatitymeasurement;

import java.util.Objects;

public class CalculateUnit {

    public double unit;

    public double calculateUnit(LengthType type, double unit) {
         if(type.equals(LengthType.FEET)){
         unit = unit*12;
        }
        if(type.equals(LengthType.INCH)){
            unit = unit/12;
        }
    return unit;
      }

    public boolean calculateFeet(int i, int i1) {
        if (i == i1) {
            return true;
        }
        return false;
    }

    public boolean calculateInch(int i, int i1) {
        if (i == i1) {
            return true;
        }
        return false;
    }
}
