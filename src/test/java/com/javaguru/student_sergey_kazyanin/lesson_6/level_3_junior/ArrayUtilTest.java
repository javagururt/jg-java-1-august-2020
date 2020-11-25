package com.javaguru.student_sergey_kazyanin.lesson_6.level_3_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    private ArrayUtil victim = new ArrayUtil();
//    target

    @Test
    public void isNumberInArray() {
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 11;
        boolean actualResult = victim.isNumberInArray(testArray, number);
        assertEquals(false, actualResult);
    }

    @Test
    public void shouldNotArrayNumber() {
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 11;
        boolean actualResult = victim.isNumberInArray(testArray, number);
        assertEquals(false, actualResult);
    }

    @Test
    public void shouldInArrayNumber() {
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 4;
        boolean actualResult = victim.isNumberInArray(testArray, number);
        assertEquals(true, actualResult);
    }

    @Test
    public void shouldZeroCount() {
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 0;
        int actualResult = victim.numberCount(testArray, number);
        assertEquals(0, actualResult);
    }

    @Test
    public void shouldTwoCount() {
        int[] testArray = {2, 4, 6, 8, 4};
        int number = 4;
        int actualResult = victim.numberCount(testArray, number);
        assertEquals(2, actualResult);
    }
}