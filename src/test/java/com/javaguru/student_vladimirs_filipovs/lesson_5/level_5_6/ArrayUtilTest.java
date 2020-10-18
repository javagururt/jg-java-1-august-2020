package com.javaguru.student_vladimirs_filipovs.lesson_5.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class ArrayUtilTest {
    private ArrayUtil victim;

    @Before
    public void setUp() {
    victim = new ArrayUtil();
    }

    @Test
    public void createArray() {
        int[] array = victim.createArray(7);
        int actualResult = array.length;
        assertEquals(7, actualResult);
    }

    @Test
    public void findMaxNumberInArray() {
        int[] array = {2, 4, 9, 1, 5, 21, 18};
        int actualResult = victim.findMaxNumber(array);
        assertEquals(21, actualResult);
    }

    @Test
    public void findMaxNumberInArrayWithNegativeNumbers() {
        int[] array = {-2, -4, -9, -1, -5, -21, -18};
        int actualResult = victim.findMaxNumber(array);
        assertEquals(-1, actualResult);
    }

    @Test
    public void findMinNumberInArray() {
        int[] array = {2, 4, 9, 1, 5, 21, 18};
        int actualResult = victim.findMinNumber(array);
        assertEquals(1, actualResult);
    }

    @Test
    public void findMinNumberInArrayWithNegativeNumbers() {
        int[] array = {-2, -4, -9, -1, -5, -21, -18};
        int actualResult = victim.findMinNumber(array);
        assertEquals(-21, actualResult);
    }

    @Test
    public void findMinNumberInArrayWithAllNumbersEqualsZero() {
        int[] array = {0, -0, 0, -0, 0, 0, 0};
        int actualResult = victim.findMinNumber(array);
        assertEquals(0, actualResult);
    }
}