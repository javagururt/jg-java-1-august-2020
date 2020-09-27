package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import java.util.Arrays;

class CopyNumbersInRangeDemo {

    CopyNumbersInRange copyNumbersInRange = new CopyNumbersInRange();

    public static void main(String[] args) {

        CopyNumbersInRangeDemo copyNumbersInRangeDemo = new CopyNumbersInRangeDemo();
        copyNumbersInRangeDemo.shouldCopyFrom5To10();
        copyNumbersInRangeDemo.shouldCopyFrom0To1();
        copyNumbersInRangeDemo.shouldNotCopyAnything();


    }

    void shouldCopyFrom5To10() {
        int[] expected = {5, 7, 8, 10};
        int[] result = copyNumbersInRange.copyInRange(new int[]{1, 5, 7, 8, 10, 15, 25}, 5, 10);
        copyNumbersInRange.test(Arrays.equals(expected, result), "Copy in range from 5 to 10");
    }

    void shouldCopyFrom0To1() {
        int[] expected = {0};
        int[] result = copyNumbersInRange.copyInRange(new int[]{0, 3, 6}, 0, 1);
        copyNumbersInRange.test(Arrays.equals(expected, result), "Copy in range from 0 to 1");
    }

    void shouldNotCopyAnything() {
        int[] expected = {};
        int[] result = copyNumbersInRange.copyInRange(new int[]{0, 3, 6}, 7, 10);
        copyNumbersInRange.test(Arrays.equals(expected, result), "Nothing to copy");
    }
}
