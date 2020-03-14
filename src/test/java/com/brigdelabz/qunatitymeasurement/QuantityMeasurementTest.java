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
    public void forOneFeetAndAnotherFeet_ShouldReturnEqual() {
        {
            boolean check = feet.calculateFeet(0, 0);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void checkForNULL_ShouldReturnEqual() {
        {
            boolean check = feet.checkNull("null");
            Assert.assertTrue(check);
        }
    }

    @Test
    public void checkForNRef_ShouldReturnEqual() {
        {
            boolean check = feet.checkRef(feet);
            Assert.assertTrue(check);
        }
    }

    @Test
    public void checkForType_ShouldReturnEqual() {
        {
            boolean check = feet.checkType(feet);
            Assert.assertTrue(check);
        }
    }
}
