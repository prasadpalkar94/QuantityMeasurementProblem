package com.bridgelabz.qunatitymeasurement;

public enum UnitType {
    FEET_TO_INCH(1 * 12.0), INCH_TO_FEET(1 / 12.0), YARD(1 * 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36), FEET_TO_YARD(1 / 3), YARD_TO_FEET(1 * 3.0),
    INCH_TO_CM(1 * 2.54), CM_TO_INCH(1 / 2.54),
    INCH(1), GALLON_TO_LITRE(1 * 3.785), LITRE(1),
    LITRE_TO_ML(1 * 1000.0), MILLILITRE_TO_LTR(1 / 1000.0),
    KG_TO_GRAMS(1 * 1000.0), TONNE_TO_KG(1 * 1000), GRAMS_TO_KG(1 / 1000.0),
    FAHRENHEIT_TO_CELSIUS(0.4717);

    public final double unit;

    UnitType(double unit) {
        this.unit = unit;
    }
}

