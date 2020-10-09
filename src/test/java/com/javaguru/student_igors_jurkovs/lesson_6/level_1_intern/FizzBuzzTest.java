package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz victim = new FizzBuzz();

    @Test
    public void detect() {
        String expected = "FizzBuzz";
        String result = victim.detect(15);
        assertEquals(expected, result);
    }

    @Test
    public void detect2() {
        String expected = "Fizz";
        String result = victim.detect(9);
        assertEquals(expected, result);
    }

    @Test
    public void detect3() {
        String expected = "Buzz";
        String result = victim.detect(10);
        assertEquals(expected, result);
    }

    @Test
    public void detect4() {
        String expected = "13";
        String result = victim.detect(13);
        assertEquals(expected, result);
    }

    @Test
    public void detect5() {
        String expected = "FizzBuzz";
        String result = victim.detect(0);
        assertEquals(expected, result);
    }

}