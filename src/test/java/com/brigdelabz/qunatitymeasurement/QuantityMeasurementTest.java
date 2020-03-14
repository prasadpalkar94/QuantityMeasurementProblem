package com.brigdelabz.qunatitymeasurement;

import com.bridgelabz.qunatitymeasurement.Feet;
import com.bridgelabz.qunatitymeasurement.QuantityMeasurementException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class QuantityMeasurementTest {
    Feet feet;

    @Before
    public void setUp() throws Exception {
        feet = new Feet();
    }

    @Test
    public void givenTwoFeetValues_WhenEqual_ShouldReturnTrue() {
        {
            boolean check = feet.calculateFeet(0, 0);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            boolean check = feet.checkNull("null");
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            boolean check = feet.checkRef(feet);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoFeetValues_WhenCheckForType_ShouldReturnTrue() {
        {
            boolean check = feet.checkType(feet);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoInchValues_WhenEqual_ShouldReturnTrue() {
        {
            boolean check = feet.calculateInch(0, 0);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForNull_ShouldReturnTrue() {
        {
            boolean check = feet.checkNull("null");
            Assert.assertTrue(check);
        }
    }

    @Test
    public void givenTwoInchValues_WhenCheckForReference_ShouldReturnTrue() {
        {
            boolean check = feet.checkRef(feet);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void  givenTwoInchValues_WhenCheckForType_ShouldReturnTrue() {
        {
            boolean check = feet.checkType(feet);
            Assert.assertTrue(check);
        }
    }
}
