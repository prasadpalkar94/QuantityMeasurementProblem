package com.brigdelabz.qunatitymeasurement;

import com.bridgelabz.qunatitymeasurement.CalculateUnit;
import com.bridgelabz.qunatitymeasurement.LengthType;
import com.bridgelabz.qunatitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    CalculateUnit unit;
    QuantityMeasurement obj;

    @Before
    public void setUp() {
        unit = new CalculateUnit();
        obj = new QuantityMeasurement();
    }

    @Test
    public void givenTwoFeetValues_WhenSame_ShouldReturnTrue() {
        {
            double check = obj.calculateUnit(LengthType.FEET, 0);
            double check1 = obj.calculateUnit(LengthType.FEET, 0);
            Assert.assertEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenNotEqual_ShouldReturnTrue() {
        {
            double check = obj.calculateUnit(LengthType.FEET, 0);
            double check1 = obj.calculateUnit(LengthType.FEET, 5);
            Assert.assertNotEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            Assert.assertFalse(unit.equals(null));
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            Assert.assertTrue(obj.equals(obj));
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForType_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
        }
    }


    @Test
    public void givenTwoFeetValues_WhenCheckForValue_ShouldReturnTrue() {
        {
            double checkValue1 = obj.calculateUnit(LengthType.FEET, 1.1);
            double checkValue2 = obj.calculateUnit(LengthType.FEET, 1.1);
            Assert.assertEquals(checkValue1, checkValue2, 0.0);
        }
    }

    //Inch
    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        {
            double check = obj.calculateUnit(LengthType.INCH, 0);
            double check1 = obj.calculateUnit(LengthType.INCH, 0);
            Assert.assertEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoInchValues_WhenNotEqual_ShouldReturnFalse() {
        {
            double check = obj.calculateUnit(LengthType.INCH, 0);
            double check1 = obj.calculateUnit(LengthType.INCH, 5);
            Assert.assertNotEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForNull_ShouldReturnFalse() {
        {
            Assert.assertFalse(unit.equals(null));
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            Assert.assertTrue(obj.equals(obj));
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForType_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForValue_ShouldReturnTrue() {
        {
            double checkValue1 = obj.calculateUnit(LengthType.INCH, 12);
            double checkValue2 = obj.calculateUnit(LengthType.INCH, 12);
            Assert.assertEquals(checkValue2, checkValue1, 0.0);
        }
    }

    @Test
    public void givenTwoInchAndFeetValues_WhenEqual_ShouldReturnTrue() {
        {
            double check = obj.calculateUnit(LengthType.INCH, 0);
            double check1 = obj.calculateUnit(LengthType.FEET, 0);
            Assert.assertEquals(check1, check, 0.0);
        }

    }

    @Test
    public void givenConversionOfFeetToInch_WhenEqual_ShouldReturnTrue() {
        double check = obj.calculateUnit(LengthType.FEET, 1);
        Assert.assertEquals(12.0, check, 1);

    }

    @Test
    public void givenConversionOfFeetToInch_WhenNotEqual_ShouldReturnFalse() {
        double check = obj.calculateUnit(LengthType.FEET, 1);
        Assert.assertNotEquals(1.0, check, 1);
    }

    @Test
    public void givenConversionOfInchToFeet_WhenEqual_ShouldReturnTrue() {
        double check = obj.calculateUnit(LengthType.INCH, 12);
        Assert.assertEquals(1.0, check, 0.0);

    }

    @Test
    public void givenConversionOfInchToFeet_WhenNotEqual_ShouldReturnFalse() {
        double check = obj.calculateUnit(LengthType.INCH, 1);
        Assert.assertNotEquals(1, check);
    }

    @Test
    public void givenThreeFeet_WhenEqualsToOneYard_ShouldReturnTrue() {
        double feet = obj.calculateUnit(LengthType.FEET_TO_YARD, 3);
        Assert.assertEquals(1.0, feet, 1);
    }

    @Test
    public void givenConversionOfFeetToYard_WhenSameValue_ShouldReturnFalse() {
        double feet = obj.calculateUnit(LengthType.FEET, 1);
        double inch = obj.calculateUnit(LengthType.YARD, 1);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void givenConversionOfInchToYard_WhenSameValue_ShouldReturnFalse() {
        double inch = obj.calculateUnit(LengthType.INCH, 1);
        double yard = obj.calculateUnit(LengthType.YARD, 1);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

    @Test
    public void givenConversionOfOneYardToInch_WhenEqualsTo36Inch_ShouldReturnTrue() {
        double yard = obj.calculateUnit(LengthType.YARD_TO_INCH, 1);
        Assert.assertEquals(36.0, yard, 0.0);
    }

    @Test
    public void givenConversionOfOneInchToYard_WhenEqualsTo36Yard_ShouldReturnTrue() {
        double yard = obj.calculateUnit(LengthType.INCH_TO_YARD, 36);
        Assert.assertEquals(1, yard, 0.0);
    }

    @Test
    public void givenOneYard_WhenEqualsToThreeFeet_ShouldReturnTrue() {
        double feet = obj.calculateUnit(LengthType.YARD_TO_FEET, 1);
        Assert.assertEquals(3.0, feet, 1);
    }

    @Test
    public void givenInchToCmConversion_whenProper_ShouldReturnTrue() {
        double cm = obj.calculateUnit(LengthType.INCH_TO_CM, 2);
        Assert.assertEquals(5, cm, 1);
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInches() {
        double inch1 = obj.calculateUnit(LengthType.INCH_TO_INCH, 2);
        Assert.assertEquals(4, (inch1 + inch1), 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        double inch1 = obj.calculateUnit(LengthType.FEET, 1.0);
        double inch2 = obj.calculateUnit(LengthType.INCH_TO_INCH, 2.0);
        Assert.assertEquals(14.0, (inch1 + inch2), 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        double inch1 = obj.calculateUnit(LengthType.FEET, 1.0);
        Assert.assertEquals(24.0, (inch1 + inch1), 0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenEqualTo3Inch_ShouldReturnTrue() {
        double inch1 = obj.calculateUnit(LengthType.INCH_TO_INCH, 2.0);
        double inch2 = obj.calculateUnit(LengthType.CM_TO_INCH, 2.5);
        Assert.assertEquals(3.0, (inch1 + inch2), 1);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqual_ShouldReturnTrue() {
        double gallon = obj.calculateUnit(LengthType.GALLON, 1.0);
        double litre = obj.calculateUnit(LengthType.LITRE, 3.785);
        Assert.assertEquals(gallon, litre, 1);
    }
    @Test
    public void given1LitreAnd1000Millilitre_WhenEqual_ShouldReturnTrue() {
        double litre = obj.calculateUnit(LengthType.LITRE_TO_ML, 1.0);
        double millilitre = obj.calculateUnit(LengthType.MILLILITRE, 1000.0);
        Assert.assertEquals(litre, millilitre, 0.0);
    }
}

