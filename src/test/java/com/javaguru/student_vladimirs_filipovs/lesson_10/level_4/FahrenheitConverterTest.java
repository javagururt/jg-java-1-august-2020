package com.javaguru.student_vladimirs_filipovs.lesson_10.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {
    private FahrenheitConverter victim;

    @Before
    public void setUp() {
        victim = new FahrenheitConverter();
    }

    @Test
    public void shouldConvertFahrenheitFromZero(){
        double actual = victim.convert(0);
        assertEquals(32,actual,0.001);
    }

    @Test
    public void shouldConvertFahrenheitFromPositive(){
        double actual = victim.convert(10);
        assertEquals(50,actual,0.001);
    }

    @Test
    public void shouldConvertFahrenheitFromNegative(){
        double actual = victim.convert(-10);
        assertEquals(14,actual,0.001);
    }
}