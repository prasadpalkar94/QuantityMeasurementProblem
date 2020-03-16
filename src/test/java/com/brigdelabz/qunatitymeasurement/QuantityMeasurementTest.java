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
            double check = unit.calculateUnit(LengthType.FEET, 0);
            double check1 = unit.calculateUnit(LengthType.FEET, 0);
            Assert.assertEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenNotEqual_ShouldReturnTrue() {
        {
            double check = unit.calculateUnit(LengthType.FEET, 0);
            double check1 = unit.calculateUnit(LengthType.FEET, 5);
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
            Assert.assertTrue(unit.equals(unit));
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
            double checkValue1 = unit.calculateUnit(LengthType.FEET, 1.1);
            double checkValue2 = unit.calculateUnit(LengthType.FEET, 1.1);
            Assert.assertEquals(checkValue1, checkValue2, 0.0);
        }
    }

    //Inch
    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        {
            double check = unit.calculateUnit(LengthType.INCH, 0);
            double check1 = unit.calculateUnit(LengthType.INCH, 0);
            Assert.assertEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoInchValues_WhenNotEqual_ShouldReturnFalse() {
        {
            double check = unit.calculateUnit(LengthType.INCH, 0);
            double check1 = unit.calculateUnit(LengthType.INCH, 5);
            Assert.assertNotEquals(check1, check, 0.0);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            Assert.assertFalse(unit.equals(null));
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            Assert.assertTrue(unit.equals(unit));
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
            double checkValue1 = unit.calculateUnit(LengthType.INCH, 12);
            double checkValue2 = unit.calculateUnit(LengthType.INCH, 12);

            Assert.assertEquals(checkValue2, checkValue1, 0.0);
        }
    }

    @Test
    public void givenTwoInchAndFeetValues_WhenEqual_ShouldReturnTrue() {
        {
            double check = unit.calculateUnit(LengthType.INCH, 0);
            double check1 = unit.calculateUnit(LengthType.FEET, 0);
            Assert.assertEquals(check1, check, 0.0);
        }

    }

    @Test
    public void givenConversionOfFeetToInch_WhenEqual_ShouldReturnTrue() {
        double check = unit.calculateUnit(LengthType.FEET, 1);
        Assert.assertEquals(12.0, check, 1);

    }

    @Test
    public void givenConversionOfFeetToInch_WhenNotEqual_ShouldReturnFalse() {
        double check = unit.calculateUnit(LengthType.FEET, 1);
        Assert.assertNotEquals(1.0, check, 1);
    }

    @Test
    public void givenConversionOfInchToFeet_WhenEqual_ShouldReturnTrue() {
        double check = unit.calculateUnit(LengthType.INCH, 12);
        Assert.assertEquals(1.0, check, 1);

    }

    @Test
    public void givenConversionOfInchToFeet_WhenNotEqual_ShouldReturnFalse() {
        double check = unit.calculateUnit(LengthType.INCH, 1);
        Assert.assertNotEquals(1, check);
    }
}
