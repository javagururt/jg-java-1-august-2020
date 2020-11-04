package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_13;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.sortTest();
    }

    ArrayUtil numbers = new ArrayUtil();

    void sortTest() {
        int[] actual = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        numbers.sort(actual);
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }

}
