package com.javaguru.student_vladimirs_filipovs.lesson_4.level_7;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FizzBuzzTest {
    private FizzBuzz victim;

    @Before
    public void setUp() {
        victim = new FizzBuzz();
    }

    @Test
    public void shouldDetectFizz() {
        String actualResult = victim.detect(6);
        assertEquals("Fizz", actualResult);
    }

    @Test
    public void shouldDetectBuzz() {
        String actualResult = victim.detect(10);
        assertEquals("Buzz", actualResult);
    }

    @Test
    public void shouldDetectFizzBuzz() {
        String actualResult = victim.detect(15);
        assertEquals("FizzBuzz", actualResult);
    }

    @Test
    public void shouldNotDetectFizzBuzz() {
        String actualResult = victim.detect(7);
        assertEquals("" + 7, actualResult);
    }

    @Test
    public void shouldNotDetectFizzBuzzWithNegativeNumber() {
        String actualResult = victim.detect(-7);
        assertEquals("" + -7, actualResult);
    }
}