package com.javaguru.student_ivan_shulga.lesson_6.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    FizzBuzz victim = new FizzBuzz();
    
    @Test
    public void shouldReturnFizzBuzz() {
        String actual = victim.detect(15);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void shouldReturnFizz() {
        String actual = victim.detect(3);
        assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzz() {
        String actual = victim.detect(5);
        assertEquals("Buzz", actual);
    }

}