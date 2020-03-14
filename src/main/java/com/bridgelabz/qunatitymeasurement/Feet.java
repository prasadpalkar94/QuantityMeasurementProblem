package com.bridgelabz.qunatitymeasurement;

import java.util.Objects;

public class Feet {

    public int value;

    public Feet() {

    }

    public Feet(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

    public boolean calculateFeet(int i, int i1) {
        if (i == i1) {
            return true;
        }
        return false;
    }

    public boolean checkNull(Object object) {
        if (object == null ) {
            return false;
        }
        return true;
    }

    public boolean checkRef(Object object) {
        if (object == this) {
            return true;
        }
        return false;
    }

    public boolean checkType(Object object) {
        if (object.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }
}
