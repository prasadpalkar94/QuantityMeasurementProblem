package com.brigdelabz.qunatitymeasurement;

import com.bridgelabz.qunatitymeasurement.QuantityMeasurement;
import com.bridgelabz.qunatitymeasurement.QuantityMeasurementException;
import com.bridgelabz.qunatitymeasurement.UnitOfTemperature;
import com.bridgelabz.qunatitymeasurement.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValues_WhenSame_ShouldReturnTrue() {
        QuantityMeasurement feetValue1 = new QuantityMeasurement(0.0, UnitType.FEET);
        QuantityMeasurement feetValue2 = new QuantityMeasurement(0.0, UnitType.FEET);
        Assert.assertEquals(feetValue1,feetValue2);
    }

    @Test
    public void givenTwoFeetValues_WhenNotEqual_ShouldReturnTrue() {
        QuantityMeasurement feetValue1 = new QuantityMeasurement(0.0, UnitType.FEET);
        QuantityMeasurement feetValue2 = new QuantityMeasurement(5.0, UnitType.FEET);
        Assert.assertNotEquals(feetValue1,feetValue2);
    }

    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inchValue1 = new QuantityMeasurement(0.0, UnitType.INCH);
        QuantityMeasurement inchValue2 = new QuantityMeasurement(0.0, UnitType.INCH);
        Assert.assertEquals(inchValue1, inchValue2);
    }

    @Test
    public void givenTwoInchValues_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inchValue1 = new QuantityMeasurement(12.0, UnitType.INCH);
        QuantityMeasurement inchValue2 = new QuantityMeasurement(0.0, UnitType.INCH);
        Assert.assertNotEquals(inchValue1, inchValue2);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnEqual() {
        QuantityMeasurement feetValue = new QuantityMeasurement(0.0, UnitType.FEET);
        QuantityMeasurement inchValue = new QuantityMeasurement(0.0, UnitType.INCH);
        boolean compare = feetValue.compare(inchValue);
        Assert.assertTrue(compare);
    }


    @Test
    public void givenNullObjectReference_WhenEqual_ShouldReturnFalse() {
        QuantityMeasurement inchValue1 = new QuantityMeasurement(12.0, UnitType.INCH);
        QuantityMeasurement inchValue2 = new QuantityMeasurement(0.0, null);
        Assert.assertFalse(inchValue1.equals(inchValue2));
    }

    @Test
    public void givenType_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inchValue = new QuantityMeasurement(12.0, UnitType.INCH);
        QuantityMeasurement gramValue = new QuantityMeasurement(12.0, UnitType.GRAM);
        Assert.assertNotEquals(inchValue, gramValue);
    }

    @Test
    public void givenSameReferenceForSameClass_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inchValue = new QuantityMeasurement(12.0, UnitType.INCH);
        Assert.assertTrue(inchValue.equals(inchValue));
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inchValue = new QuantityMeasurement(1.0, UnitType.INCH);
        QuantityMeasurement feetValue = new QuantityMeasurement(1.0, UnitType.FEET);
        Assert.assertNotEquals(feetValue,inchValue);
    }


    @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(1.0, UnitType.FEET);
        QuantityMeasurement inch = new QuantityMeasurement(12.0, UnitType.INCH);
        boolean compare = feet.compare(inch);
        Assert.assertTrue(compare);
    }


    @Test
    public void given12Inch1Feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(12.0, UnitType.INCH);
        QuantityMeasurement feet = new QuantityMeasurement(1.0, UnitType.FEET);
        boolean compare = inch.compare(feet);
        Assert.assertTrue(compare);
    }


    @Test
    public void given1Feet1Yard_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement yard = new QuantityMeasurement(1.0, UnitType.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(1.0, UnitType.FEET);
        Assert.assertNotEquals(yard, feet);
    }

    @Test
    public void given1Inch1Yard_WhenNotEqual_ShouldReturnFalse() {

        QuantityMeasurement yard = new QuantityMeasurement(1.0, UnitType.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(1.0, UnitType.INCH);
        Assert.assertNotEquals(yard, inch);
    }

    @Test
    public void given1Yard36Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1.0, UnitType.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(36.0, UnitType.INCH);
        boolean compare = yard.compare(inch);
        Assert.assertTrue(compare);
    }

    @Test
    public void given36Inch1Yard_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1.0, UnitType.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(13.0, UnitType.INCH);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void given1Yard3Feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1.0, UnitType.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(13.0, UnitType.FEET);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void given3Feet1Yard_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1.0,UnitType.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(3.0, UnitType.FEET);
        boolean compare = yard.compare(feet);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2Inch5CM_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement centimeter = new QuantityMeasurement(5.0, UnitType.CENTI_METER);
        QuantityMeasurement inch = new QuantityMeasurement(2.0, UnitType.INCH);
        boolean compare = centimeter.compare(inch);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf2InchAnd2Inch_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(2.0, UnitType.INCH);
            QuantityMeasurement inch2 = new QuantityMeasurement(2.0, UnitType.INCH);
            double result = inch1.additionOfTwoUnits(inch2);
            Assert.assertEquals(4.0, result, 0.0);
        }
        catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOf1Feet2Inch_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(2.0, UnitType.INCH);
            QuantityMeasurement feet = new QuantityMeasurement(1.0, UnitType.FEET);
            double result = inch.additionOfTwoUnits(feet);
            Assert.assertEquals(14.0, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOf1Feet1Feet_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(1.0, UnitType.FEET);
            QuantityMeasurement feet = new QuantityMeasurement(1.0, UnitType.FEET);
            double result = inch.additionOfTwoUnits(feet);
            Assert.assertEquals(24.0, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOfInchAndCentimeter_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(2.0, UnitType.INCH);
            QuantityMeasurement centimeter = new QuantityMeasurement(2.5, UnitType.CENTI_METER);
            double result = inch.additionOfTwoUnits(centimeter);
            Assert.assertEquals(3.0, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenGallonAndLitres_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(3.78, UnitType.LITRE);
        QuantityMeasurement gallon = new QuantityMeasurement(1.0, UnitType.GALLON);
        boolean compare = litre.compare(gallon);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(3.78, UnitType.LITRE);
            QuantityMeasurement gallon = new QuantityMeasurement(1.0, UnitType.GALLON);
            double result = gallon.additionOfTwoUnits(litre);
            Assert.assertEquals(7.56, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAdditionOfGallonAndLitre_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(1.0, UnitType.LITRE);
            QuantityMeasurement miliLitire = new QuantityMeasurement(100.0, UnitType.MILLI_LITRE);
            double result = miliLitire.additionOfTwoUnits(litre);
            Assert.assertEquals(1.1, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }


    @Test
    public void givenKGAndGrams_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement kilogram = new QuantityMeasurement(1.0, UnitType.KILOGRAM);
        QuantityMeasurement grams = new QuantityMeasurement(1000.0, UnitType.GRAM);
        boolean compare = kilogram.compare(grams);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenTonneAndKG_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(1.0, UnitType.TONNE);
        QuantityMeasurement kilogram = new QuantityMeasurement(1000.0, UnitType.KILOGRAM);
        boolean compare = kilogram.compare(tonne);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOfTonneAndGrams_WhenEqual_ShouldReturnTrue() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(1.0, UnitType.TONNE);
            QuantityMeasurement grams = new QuantityMeasurement(1000.0, UnitType.GRAM);
            double result = grams.additionOfTwoUnits(tonne);
            Assert.assertEquals(1001.0, result, 0.0);
        } catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(212.0, UnitOfTemperature.FAHRENHEIT);
        QuantityMeasurement celsius = new QuantityMeasurement(100.0, UnitOfTemperature.CELSIUS);
        boolean compare = fahrenheit.compare(celsius);
        Assert.assertTrue(compare);
    }


}


