package com.javaguru.student_vladimirs_filipovs.lesson_10.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {
    private KelvinConverter victim;

    @Before
    public void setUp() {
        victim = new KelvinConverter();
    }

    @Test
    public void shouldConvertKelvinFromZero(){
        double actual = victim.convert(0);
        assertEquals(273.15, actual, 0.001);
    }

    @Test
    public void shouldConvertKelvinFromNegative(){
        double actual = victim.convert(-100);
        assertEquals(173.15, actual, 0.001);
    }

    @Test
    public void shouldConvertKelvinFromPositive(){
        double actual = victim.convert(100);
        assertEquals(373.15, actual, 0.001);
    }
}