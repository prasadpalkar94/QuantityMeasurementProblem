package com.brigdelabz.qunatitymeasurement;

import com.bridgelabz.qunatitymeasurement.QuantityMeasurement;
import com.bridgelabz.qunatitymeasurement.QuantityMeasurementException;
import com.bridgelabz.qunatitymeasurement.UnitType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    //var declaration
    double feetValue1,feetValue2,inchValue1,inchValue2,feetValue, inchValue,gramValue,celsius,
            kilogram,grams,yard,inch,tonne,centimeter,litre,gallon,miliLitire;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenTwoFeetValues_WhenSame_ShouldReturnTrue() {
        feetValue1 = quantityMeasurement.convertValue(UnitType.FEET, 0.0);
        feetValue2 = quantityMeasurement.convertValue(UnitType.FEET, 0.0);
        Assert.assertEquals(feetValue1, feetValue2, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenNotEqual_ShouldReturnTrue() {
        feetValue1 = quantityMeasurement.convertValue(UnitType.FEET, 0.0);
        feetValue2 = quantityMeasurement.convertValue(UnitType.FEET, 5.0);
        Assert.assertNotEquals(feetValue1, feetValue2);
    }

    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        inchValue1 = quantityMeasurement.convertValue(UnitType.INCH, 0.0);
        inchValue2 = quantityMeasurement.convertValue(UnitType.INCH, 0.0);
        Assert.assertEquals(inchValue1, inchValue2, 0.0);
    }

    @Test
    public void givenTwoInchValues_WhenNotEqual_ShouldReturnFalse() {
        inchValue1 = quantityMeasurement.convertValue(UnitType.INCH, 0.0);
        inchValue2 = quantityMeasurement.convertValue(UnitType.INCH, 5.0);
        Assert.assertNotEquals(inchValue1, inchValue2);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnEqual() {
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 0.0);
        inchValue = quantityMeasurement.convertValue(UnitType.INCH, 0.0);
        boolean compare = quantityMeasurement.compare(inchValue, feetValue);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenNullObjectReference_WhenEqual_ShouldReturnFalse() {
        try {
            boolean checkNull = quantityMeasurement.equals(null);
            Assert.assertFalse( checkNull);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenType_WhenNotEqual_ShouldReturnFalse() {
        inchValue = quantityMeasurement.convertValue(UnitType.INCH, 12.0);
        gramValue = quantityMeasurement.convertValue(UnitType.GRAM, 12.0);
        Assert.assertNotEquals(inchValue, gramValue);
    }

    @Test
    public void givenSameReferenceForSameClass_WhenEqual_ShouldReturnTrue() {
        boolean checkEqual = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(checkEqual);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        inchValue = quantityMeasurement.convertValue(UnitType.INCH, 1.0);
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
        Assert.assertNotEquals(feetValue, inchValue);
    }

    @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
        inchValue = quantityMeasurement.convertValue(UnitType.INCH, 12.0);
        boolean compare = quantityMeasurement.compare(feetValue, inchValue);
        Assert.assertTrue(compare);
    }

    @Test
    public void given12Inch1Feet_WhenEqual_ShouldReturnTrue() {
        inchValue = quantityMeasurement.convertValue(UnitType.INCH, 12.0);
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
        boolean compare = quantityMeasurement.compare(inchValue, feetValue);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1Feet1Yard_WhenNotEqual_ShouldReturnFalse() {
        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
        Assert.assertNotEquals(yard, feetValue);
    }

    @Test
    public void given1Inch1Yard_WhenNotEqual_ShouldReturnFalse() {

        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        inch = quantityMeasurement.convertValue(UnitType.INCH, 1.0);
        Assert.assertNotEquals(yard, inch);
    }

    @Test
    public void given1Yard36Inch_WhenEqual_ShouldReturnTrue() {
        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        inch = quantityMeasurement.convertValue(UnitType.INCH, 36.0);
        boolean compare = quantityMeasurement.compare(yard, inch);
        Assert.assertTrue(compare);
    }

    @Test
    public void given36Inch1Yard_WhenEqual_ShouldReturnTrue() {
        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        inch = quantityMeasurement.convertValue(UnitType.INCH, 1.0);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void given1Yard3Feet_WhenEqual_ShouldReturnTrue() {
        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 13.0);
        Assert.assertNotEquals(feetValue, yard);
    }

    @Test
    public void given3Feet1Yard_WhenEqual_ShouldReturnTrue() {
        yard = quantityMeasurement.convertValue(UnitType.YARD, 1.0);
        feetValue = quantityMeasurement.convertValue(UnitType.FEET, 3.0);
        boolean compare = quantityMeasurement.compare(yard, feetValue);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2Inch5CM_WhenEqual_ShouldReturnTrue() {
        centimeter = quantityMeasurement.convertValue(UnitType.CENTI_METER, 5.0);
        inch = quantityMeasurement.convertValue(UnitType.INCH, 2.0);
        boolean compare = quantityMeasurement.compare(inch, centimeter);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf2InchAnd2Inch_WhenEqual_ShouldReturnTrue() {
        try {
            double inch1 = quantityMeasurement.convertValue(UnitType.INCH, 2.0);
            double inch2 = quantityMeasurement.convertValue(UnitType.INCH, 2.0);
            double result = quantityMeasurement.addition(inch1, inch2);
            Assert.assertEquals(4.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOf1Feet2Inch_WhenEqual_ShouldReturnTrue() {
        try {
            inchValue = quantityMeasurement.convertValue(UnitType.INCH, 2.0);
            feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
            double result = quantityMeasurement.addition(inchValue, feetValue);
            Assert.assertEquals(14.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOf1Feet1Feet_WhenEqual_ShouldReturnTrue() {
        try {
            inchValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
            feetValue = quantityMeasurement.convertValue(UnitType.FEET, 1.0);
            double result = quantityMeasurement.addition(inchValue, feetValue);
            Assert.assertEquals(24.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOfInchAndCentimeter_WhenEqual_ShouldReturnTrue() {
        try {
            inchValue = quantityMeasurement.convertValue(UnitType.INCH, 2.0);
            centimeter = quantityMeasurement.convertValue(UnitType.CENTI_METER, 2.5);
            double result = quantityMeasurement.addition(inchValue, centimeter);
            Assert.assertEquals(3.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenGallonAndLitres_WhenEqual_ShouldReturnTrue() {
        litre = quantityMeasurement.convertValue(UnitType.LITRE, 3.78);
        gallon = quantityMeasurement.convertValue(UnitType.GALLON, 1.0);
        boolean compare = quantityMeasurement.compare(litre, gallon);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEqual_ShouldReturnTrue() {
        try {
            litre = quantityMeasurement.convertValue(UnitType.LITRE, 3.78);
            gallon = quantityMeasurement.convertValue(UnitType.GALLON, 1.0);
            double result = quantityMeasurement.addition(gallon, litre);
            Assert.assertEquals(7.56, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOfGallonAndLitre_WhenEqual_ShouldReturnTrue() {
        try {
            litre = quantityMeasurement.convertValue(UnitType.LITRE, 1.0);
            miliLitire = quantityMeasurement.convertValue(UnitType.MILLI_LITRE, 100.0);
            double result = quantityMeasurement.addition(litre, miliLitire);
            Assert.assertEquals(1.1, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenKGAndGrams_WhenEqual_ShouldReturnTrue() {
        kilogram = quantityMeasurement.convertValue(UnitType.KILOGRAM, 1.0);
        grams = quantityMeasurement.convertValue(UnitType.GRAM, 1000.0);
        boolean compare = quantityMeasurement.compare(kilogram, grams);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenTonneAndKG_WhenEqual_ShouldReturnTrue() {
        tonne = quantityMeasurement.convertValue(UnitType.TONNE, 1.0);
        kilogram = quantityMeasurement.convertValue(UnitType.KILOGRAM, 1000.0);
        boolean compare = quantityMeasurement.compare(kilogram, tonne);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOfTonneAndGrams_WhenEqual_ShouldReturnTrue() {
        try {
            tonne = quantityMeasurement.convertValue(UnitType.TONNE, 1.0);
            grams = quantityMeasurement.convertValue(UnitType.GRAM, 1000.0);
            double result = quantityMeasurement.addition(tonne, grams);
            Assert.assertEquals(1001.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenEqual_ShouldReturnTrue() {

        celsius = quantityMeasurement.convertValue(UnitType.FAHRENHEIT, 212.0);
        Assert.assertEquals(100, celsius, 0.0);
    }

}


