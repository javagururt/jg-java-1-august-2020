package com.javaguru.student_igors_jurkovs.lesson_10.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    private KelvinConverter victim = new KelvinConverter();

    @Test
    public void convert() {
        double expected = 0;
        double result = victim.convert(-273.15);
        assertEquals(expected, result, 0.01);
    }
}