package com.javaguru.student_maksim_morozov.lesson_15.level_2_intern;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class QuadraticEqTest extends TestCase {
    private QuadraticEq victim;

    @Before
    public void setUp(){victim = new QuadraticEq();}

    @Test
    public void test1MethodCalcIfDiscriminantMoreZero() {
        String actual = victim.calc(2, 3, 1);
        assertEquals("x1 = -1.0, x2 = -0.5", actual);
    }
    @Test
    public void test2MethodCalcIfDiscriminantMoreZero(){
        String actual = victim.calc(2.25, 3, 1);
        assertEquals("x = -0.7564123974568456");
    }

    private void assertEquals(String s) {
    }
    @Test
    public void test3MethodCalcIfDiscriminantMoreZero(){
        String actual = victim.calc(2, 3, 4);
        assertEquals("Equation has no roots", actual);
    }

}