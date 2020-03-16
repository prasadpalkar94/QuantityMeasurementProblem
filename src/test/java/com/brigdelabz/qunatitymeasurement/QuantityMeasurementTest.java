package com.brigdelabz.qunatitymeasurement;

import com.bridgelabz.qunatitymeasurement.UnitType;
import com.bridgelabz.qunatitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenTwoFeetValues_WhenSame_ShouldReturnTrue() {
        double feetValue1 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 0);
        double feetValue2 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 0);
        Assert.assertEquals(feetValue2, feetValue1, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenNotEqual_ShouldReturnTrue() {
        double feetValue1 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 0);
        double feetValue2 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 5);
        Assert.assertNotEquals(feetValue2, feetValue1, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForNull_ShouldReturnTrue() {

        boolean checkForNull = quantityMeasurement.equals(null);
        Assert.assertTrue(checkForNull);
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForReference_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForType_ShouldReturnTrue() {
        boolean checkForType = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(checkForType);
    }


    @Test
    public void givenTwoFeetValues_WhenCheckForValue_ShouldReturnTrue() {
        double checkValue1 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1.1);
        double checkValue2 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1.1);
        Assert.assertEquals(checkValue1, checkValue2, 0.0);
    }

    //Inch
    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        double check = quantityMeasurement.calculateUnit(UnitType.INCH, 0);
        double check1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0);
        Assert.assertEquals(check1, check, 0.0);
    }

    @Test
    public void givenTwoInchValues_WhenNotEqual_ShouldReturnFalse() {
        double inchValue1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0);
        double inchValue2 = quantityMeasurement.calculateUnit(UnitType.INCH, 5);
        Assert.assertNotEquals(inchValue2, inchValue1, 0.0);
    }

    @Test
    public void givenTwoInchValues_WhenCheckForNull_ShouldReturnTrue() {
        boolean checkForNull = quantityMeasurement.equals(null);
        Assert.assertTrue(checkForNull);
    }

    @Test
    public void givenTwoInchValues_WhenCheckForReference_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoInchValues_WhenCheckForType_ShouldReturnTrue() {
        boolean checkForType = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(checkForType);
    }

    @Test
    public void givenTwoInchValues_WhenCheckForValue_ShouldReturnTrue() {
        double checkValue1 = quantityMeasurement.calculateUnit(UnitType.INCH, 12);
        double checkValue2 = quantityMeasurement.calculateUnit(UnitType.INCH, 12);
        Assert.assertEquals(checkValue2, checkValue1, 0.0);
    }

    @Test
    public void givenTwoInchAndFeetValues_WhenEqual_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.calculateUnit(UnitType.INCH, 0);
        double feetValue = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 0);
        Assert.assertEquals(feetValue, inchValue, 0.0);
    }

    @Test
    public void givenConversionOfFeetToInch_WhenEqual_ShouldReturnTrue() {
        double checkValue = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1);
        Assert.assertEquals(12.0, checkValue, 1);
    }

    @Test
    public void givenConversionOfFeetToInch_WhenNotEquals_ShouldReturnFalse() {
        double checkValue = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1);
        Assert.assertNotEquals(1.0, checkValue, 1);
    }

    @Test
    public void givenConversionOfInchToFeet_WhenEqual_ShouldReturnTrue() {
        double checkValue = quantityMeasurement.calculateUnit(UnitType.INCH, 12);
        Assert.assertEquals(1.0, checkValue, 0.0);

    }

    @Test
    public void givenConversionOfInchToFeet_WhenNotEqual_ShouldReturnFalse() {
        double checkValue = quantityMeasurement.calculateUnit(UnitType.INCH, 1);
        Assert.assertNotEquals(1, checkValue);
    }

    @Test
    public void givenThreeFeet_WhenEqualsToOneYard_ShouldReturnTrue() {
        double yard = quantityMeasurement.calculateUnit(UnitType.FEET_TO_YARD, 3);
        Assert.assertEquals(1.0, yard, 1);
    }

    @Test
    public void givenConversionOfFeetToYard_WhenSameValue_ShouldReturnFalse() {
        double feetValue = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1);
        double inchValue = quantityMeasurement.calculateUnit(UnitType.YARD, 1);
        Assert.assertNotEquals(feetValue, inchValue, 0.0);
    }

    @Test
    public void givenConversionOfInchToYard_WhenSameValue_ShouldReturnFalse() {
        double inchValue = quantityMeasurement.calculateUnit(UnitType.INCH, 1);
        double yardValue = quantityMeasurement.calculateUnit(UnitType.YARD, 1);
        Assert.assertNotEquals(inchValue, yardValue, 0.0);
    }

    @Test
    public void givenConversionOfOneYardToInch_WhenEqualsTo36Inch_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.calculateUnit(UnitType.YARD_TO_INCH, 1);
        Assert.assertEquals(36.0, inchValue, 0.0);
    }

    @Test
    public void givenConversionOfOneInchToYard_WhenEqualsTo36Yard_ShouldReturnTrue() {
        double yard = quantityMeasurement.calculateUnit(UnitType.INCH_TO_YARD, 36);
        Assert.assertEquals(1, yard, 0.0);
    }

    @Test
    public void givenOneYard_WhenEqualsToThreeFeet_ShouldReturnTrue() {
        double feet = quantityMeasurement.calculateUnit(UnitType.YARD_TO_FEET, 1);
        Assert.assertEquals(3.0, feet, 1);
    }

    @Test
    public void givenInchToCmConversion_whenProper_ShouldReturnTrue() {
        double cm = quantityMeasurement.calculateUnit(UnitType.INCH_TO_CM, 2);
        Assert.assertEquals(5, cm, 1);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInches() {
        double inch = quantityMeasurement.calculateUnit(UnitType.INCH, 2);
        Assert.assertEquals(4, (inch + inch), 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        double inchValue1 = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1.0);
        double inchValue2 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        Assert.assertEquals(14.0, (inchValue1 + inchValue2), 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        double feetToInch = quantityMeasurement.calculateUnit(UnitType.FEET_TO_INCH, 1.0);
        Assert.assertEquals(24.0, (feetToInch + feetToInch), 0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenEqualTo3Inch_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CM_TO_INCH, 2.5);
        Assert.assertEquals(3.0, (inch1 + inch2), 1);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqual_ShouldReturnTrue() {
        double gallonToLitre = quantityMeasurement.calculateUnit(UnitType.GALLON_TO_LITRE, 1.0);
        double litre = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        Assert.assertEquals(gallonToLitre, litre, 1);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenEqual_ShouldReturnTrue() {
        double litre = quantityMeasurement.calculateUnit(UnitType.LITRE_TO_ML, 1.0);
        Assert.assertEquals(1000.0, litre, 0.0);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqualTo7Point57Litre_ShouldReturnTrue() {
        double gallonToLitre = quantityMeasurement.calculateUnit(UnitType.GALLON_TO_LITRE, 1.0);
        double litre = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        Assert.assertEquals(7.57, (gallonToLitre + litre), 0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenEqualTo2Litre_ShouldReturnTrue() {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE_TO_LTR, 1000.0);
        Assert.assertEquals(2.0, (litre1 + litre2), 0.0);
    }

    @Test
    public void given1KgAnd1000Grams_WhenEqual_ShouldReturnTrue() {
        double kgToGram = quantityMeasurement.calculateUnit(UnitType.KG_TO_GRAMS, 1.0);
        Assert.assertEquals(1000, kgToGram, 0.0);
    }

    @Test
    public void given1TonnesAnd1000Kgs_WhenEqual_ShouldReturnTrue() {
        double tonneToKg = quantityMeasurement.calculateUnit(UnitType.TONNE_TO_KG, 1.0);
        Assert.assertEquals(1000, tonneToKg, 0.0);
    }

    @Test
    public void given1TonneAnd1000Grams_WhenEqualTo1001Kg_ShouldReturnTrue() {
        double tonneToKg = quantityMeasurement.calculateUnit(UnitType.TONNE_TO_KG, 1.0);       //1000
        double gramsToKg = quantityMeasurement.calculateUnit(UnitType.GRAMS_TO_KG, 1000.0);       //1
        Assert.assertEquals(1001, (tonneToKg + gramsToKg), 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenEqual_ShouldReturnTrue() {
        double temperature = quantityMeasurement.calculateUnit(UnitType.FAHRENHEIT_TO_CELSIUS, 212.0);
        Assert.assertEquals(100.0, temperature, 1);
    }
}


