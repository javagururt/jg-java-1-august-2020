package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyNumbersInRangeTest {

    private final CopyNumbersInRange victim = new CopyNumbersInRange();
    private final int[] numberArray = new int[]{1, 5, 7, 8, 10, 15, 25};
    private final int[] numberArray2 = new int[]{1, 5, 7, 8, 10, 15, 25, 10, 15};
    private final int[] numberArray3 = new int[]{1, 1, 1, 1, 1};

    @Test
    public void copyInRange() {
        int[] expected = {5, 7, 8, 10};
        int[] result = victim.copyInRange(numberArray, 5, 10);
        assertArrayEquals(expected, result);
    }

    @Test
    public void copyInRange2() {
        int[] expected = {};
        int[] result = victim.copyInRange(numberArray, 40, 50);
        assertArrayEquals(expected, result);
    }

    @Test
    public void copyInRange3() {
        int[] expected = {5, 7, 8, 10, 15, 10, 15};
        int[] result = victim.copyInRange(numberArray2, 5, 15);
        assertArrayEquals(expected, result);
    }

    @Test
    public void copyInRange4() {
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = victim.copyInRange(numberArray3, 1, 1);
        assertArrayEquals(expected, result);
    }
}