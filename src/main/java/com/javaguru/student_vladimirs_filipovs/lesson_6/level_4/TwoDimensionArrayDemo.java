package com.javaguru.student_vladimirs_filipovs.lesson_6.level_4;

import java.util.Arrays;

class TwoDimensionArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] newArray = twoDimensionalArray.createArray(3);
        System.out.println(Arrays.deepToString(newArray));

        twoDimensionalArray.fillArrayWithRandomNumbers(newArray);
        System.out.println(Arrays.deepToString(newArray));

        int sumArrayNumbers = twoDimensionalArray.sumAllArrayNumbers(newArray);
        System.out.println(sumArrayNumbers);
    }
}
