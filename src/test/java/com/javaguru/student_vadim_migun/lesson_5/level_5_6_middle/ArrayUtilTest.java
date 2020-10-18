package com.javaguru.student_vadim_migun.lesson_5.level_5_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    ArrayUtil victim = new ArrayUtil();

    @Test
    public void findMaxNumber() {
        int[] array = {1, 3, 5, -5, 7, -2, 6};
        int actual = victim.findMaxNumber(array);
        assertEquals(7,actual);

    }
    @Test
    public void findMinNumber() {
        int[] array = {1, 3, 5, -5, 7, -2, 6};
        int actual = victim.findMinNumber(array);
        assertEquals(-5,actual);

    }

}