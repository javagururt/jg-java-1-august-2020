package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    private FahrenheitConverter target = new FahrenheitConverter();

    @Test
    public void convert() {
        double expected = 50;
        double actual = target.convert(10);
        assertEquals(expected, actual, 0.1);
    }

}