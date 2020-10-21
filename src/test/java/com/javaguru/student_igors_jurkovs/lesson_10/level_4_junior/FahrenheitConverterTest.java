package com.javaguru.student_igors_jurkovs.lesson_10.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    private FahrenheitConverter victim = new FahrenheitConverter();

    @Test
    public void convert() {
        double expected = 32;
        double result = victim.convert(0);
        assertEquals(expected, result, 0.01);
    }
}