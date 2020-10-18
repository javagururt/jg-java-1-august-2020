package com.javaguru.student_igors_jurkovs.lesson_6.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArrayTest {

    private final TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
    private final int stringLength = 5;
    private final int columnLength = 4;
    int[][] array = twoDimensionalArray.createTwoDimensionalArray(stringLength, columnLength);
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.createTwoDimensionalArrayTest();
        twoDimensionalArrayTest.fillTwoDimensionalArrayWithRandomNumbersTest();
        twoDimensionalArrayTest.printTwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumOfAllArrayElementsTest();

    }
    void createTwoDimensionalArrayTest() {
        twoDimensionalArray.test(twoDimensionalArrayIsCreated(array), "Two dimensional array");
    }

    void fillTwoDimensionalArrayWithRandomNumbersTest() {
        twoDimensionalArray.fillTwoDimensionalArrayWithRandomNumbers(array);
        twoDimensionalArray.test(twoDimensionalArray.isArrayFull(array), "Two dimensional array isFull");
    }

    void printTwoDimensionalArrayTest() {
        twoDimensionalArray.printTwoDimensionalArray(array);
    }

    void sumOfAllArrayElementsTest() {
        twoDimensionalArray.test(twoDimensionalArray.sumOfAllArrayElements(array) == 20, "Sum of all array elements");
    }

    boolean twoDimensionalArrayIsCreated(int[][] array) {
        return array.length == stringLength && array[0].length == columnLength;
    }
}
