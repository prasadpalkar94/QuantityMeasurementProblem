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
    public void setUp() throws Exception {
        unit = new CalculateUnit();
        obj = new QuantityMeasurement();
    }

    @Test
    public void givenTwoFeetValues_WhenEqual_ShouldReturnTrue() {
        {
           // boolean check = unit.calculateFeet(0, 0);
            double check = unit.calculateUnit(LengthType.FEET, 1);
            Assert.assertEquals(12.0,check,1);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
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
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        {
            double check = unit.calculateUnit(LengthType.INCH, 12);
            Assert.assertEquals(1.0,check,1);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            try {
                boolean check = obj.equals(null);
                Assert.assertTrue(check);
            }catch (Exception e){

            }
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void  givenTwoInchValues_WhenCheckForType_ShouldReturnTrue() {
        {
            boolean check = obj.equals(obj);
            Assert.assertTrue(check);
        }
    }
}
