package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    private KelvinConverter target = new KelvinConverter();

    @Test
    public void convert() {
        double expected = 300;
        double actual = target.convert(26.85);
        assertEquals(expected, actual, 0.1);
    }

}