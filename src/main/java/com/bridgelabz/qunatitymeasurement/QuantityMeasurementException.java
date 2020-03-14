package com.bridgelabz.qunatitymeasurement;

public class QuantityMeasurementException extends RuntimeException {
    enum ExceptionType {
        NULL_CHECK, REF_CHECK, TYPE_CHECK, VALUE_CHECK
    }

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
