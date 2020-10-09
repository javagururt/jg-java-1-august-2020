package com.javaguru.student_vladimirs_filipovs.lesson_6.level_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {
    private ArrayUtil victim;

    @Before
    public void setUp() {
        victim = new ArrayUtil();
    }

    @Test
    public void shouldReturnCurrentNumberCountWitchReplyFewTimes() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int actualResult = victim.currentNumberCounter(array, 333);
        assertEquals(3, actualResult);
    }

    @Test
    public void shouldReturnCurrentNumberCountWitchReplyOneTime() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int actualResult = victim.currentNumberCounter(array, 46);
        assertEquals(1, actualResult);
    }

    @Test
    public void shouldReturnCurrentNumberCountWitchNotReply() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int actualResult = victim.currentNumberCounter(array, 44);
        assertEquals(0, actualResult);
    }

    @Test
    public void shouldReplaceFirstNumberInArray() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int[] actualResult = victim.replace(array, 110);
        int[] expectedResult = {110, 46, 83, 75, 333, 81, 12, 333, 6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReplaceNumber333To13() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int[] actualResult = victim.replaceAll(array, 333, 13);
        int[] expectedResult = {13, 46, 83, 75, 13, 81, 12, 13, 6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReplaceNumberWhichNotExist() {
        int[] array = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        int[] actualResult = victim.replaceAll(array, 99, 13);
        int[] expectedResult = {333, 46, 83, 75, 333, 81, 12, 333, 6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldOppositeArray() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualResult = victim.oppositeArray(array);
        int[] expectedResult = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSortArray() {
        int[] array = {7, 3, 9, 5, 2, 8, -1, 1, 4, 0, 10, 6};
        int[] actualResult = victim.sortArray(array);
        int[] expectedResult = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expectedResult, actualResult);
    }
}