package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    Copy victim = new Copy();

    @Test
    public void test1CopyInRange() {
        int[] expected = {5, 6, 7};
        int[] actual = victim.copyInRange(new int[]{4, 5, 6, 7, 8},5,7);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void test2CopyInRange() {
        int[] expected = {56, 77, 85};
        int[] actual = victim.copyInRange(new int[]{2, 23, 36, 56, 77, 85, 92, 121},50,90);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void test3CopyInRange() {
        int[] expected = {23, 35, 47};
        int[] actual = victim.copyInRange(new int[]{23, 13, 0, -5, 35, 99, 47, 122},20,50);
        assertArrayEquals(expected,actual);
    }

}