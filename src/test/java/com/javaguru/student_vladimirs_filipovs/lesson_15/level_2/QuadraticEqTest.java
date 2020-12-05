package com.javaguru.student_vladimirs_filipovs.lesson_15.level_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {
    private QuadraticEq victim;

    @Before
    public void setUp() {
        victim = new QuadraticEq();
    }

//    @Test
//    public void test1DiscriminantShouldMoreZero() {
//        double actual = victim.calculateDiscriminant(2, 3, 1);
//        assertEquals(1, actual, 0.001);
//    }
//
//    @Test
//    public void test2DiscriminantEqualsShouldZero() {
//        double actual = victim.calculateDiscriminant(2.25, 3, 1);
//        assertEquals(0, actual, 0.001);
//    }
//
//    @Test
//    public void test3DiscriminantShouldLessZero() {
//        double actual = victim.calculateDiscriminant(2, 3, 4);
//        assertEquals(-23, actual, 0.001);
//    }
//
//    @Test
//    public void test4ShouldCalculateXIfDiscriminantMoreZero() {
//        String actual = victim.calculateXIfDiscriminantMoreZero(2, 3, 1);
//        assertEquals("x1 = -1.0, x2 = -0.5", actual);
//    }
//
//    @Test
//    public void test5calculateXIfDiscriminantEqualsZero() {
//        String actual = victim.calculateXIfDiscriminantEqualsZero(2.25, 3);
//        assertEquals("x = -0.6666666666666666", actual);
//    }
//
//    @Test
//    public void test6discriminantLessZero() {
//        String actual = victim.ifDiscriminantLessZero();
//        assertEquals("Equation has no roots", actual);
//    }

    @Test
    public void test7MethodCalcIfDiscriminantMoreZero() {
        String actual = victim.calc(2, 3, 1);
        assertEquals("x1 = -1.0, x2 = -0.5", actual);
    }

    @Test
    public void test8MethodCalcIfDiscriminantEqualsZero() {
        String actual = victim.calc(2.25, 3, 1);
        assertEquals("x = -0.6666666666666666", actual);
    }

    @Test
    public void test9MethodCalcIfDiscriminantLessZero() {
        String actual = victim.calc(2, 3, 4);
        assertEquals("Equation has no roots", actual);
    }

}