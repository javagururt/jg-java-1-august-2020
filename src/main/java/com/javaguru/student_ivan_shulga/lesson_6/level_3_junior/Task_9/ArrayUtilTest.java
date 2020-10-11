package com.javaguru.student_ivan_shulga.lesson_6.level_3_junior.Task_9;

// основа класса скопирована из задания lesson_5 -> level_5_middle дописаны текущие задачи из lesson_6
// в будущем хорошо бы упростить и оптимизировать, как минимум вывод результатов вынести в отдельный метод

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();                 // из задания lesson_5 -> level_5_middle
        test.shouldFillArrayWithRandomNumbers();  // из задания lesson_5 -> level_5_middle
        test.shouldFindMaxNumber();               // из задания lesson_5 -> level_5_middle
        test.shouldFindMinNumber();               // из задания lesson_5 -> level_5_middle

        test.shouldFindSpecifiedNumber();         // lesson_6 -> level_3_junior -> Task_9
        test.shouldCountIntegers();               // lesson_6 -> level_3_junior -> Task_10
        test.shouldReplaceInteger();              // lesson_6 -> level_3_junior -> Task_11
        test.shouldReplaceAllInteger();           // lesson_6 -> level_3_junior -> Task_12
        test.shouldReverseAllIntegers();          // lesson_6 -> level_3_junior -> Task_13
        test.shouldSortingNumbersInArray();       // lesson_6 -> level_4_junior -> Task_14
    }

    public void shouldSortingNumbersInArray() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {9, 7, 8, 6, 5, 3, 4, 2, 1, 0};
        int[] expectedResult = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actualResult = arrayTest.sortingNumbersInArray(array);
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println("shouldSortingNumbersInArray ---> SUCCESSFUL! ---> " + " actualResult = " + Arrays.toString(actualResult) + " ---> expectedResult = " + Arrays.toString(expectedResult));
        } else {
            System.out.println("shouldSortingNumbersInArray ---> FAILED! ---> " + " actualResult = " + Arrays.toString(actualResult) + " ---> expectedResult = " + Arrays.toString(expectedResult));
        }
    }
// ^^^ lesson_6 -> level_4_junior -> Task_14 -> Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.

    public void shouldReverseAllIntegers() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expectedResult = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actualResult = arrayTest.reverseAllIntegers(array);
        if (Arrays.equals(actualResult, expectedResult)) {  // были сложности со сравнением массивов, с помощью подсказок среды вышел на это, позже углубиться, по возможности
            System.out.println("shouldReplaceInteger ---> SUCCESSFUL! ---> " + " actualResult = " + Arrays.toString(actualResult) + " ---> expectedResult = " + Arrays.toString(expectedResult));
        } else {
            System.out.println("shouldCountIntegers ---> FAILED! ---> " + " actualResult = " + Arrays.toString(actualResult) + " ---> expectedResult = " + Arrays.toString(expectedResult));
        }
    }
// ^^^ lesson_6 -> level_3_junior -> Task_12 -> Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.

    public void shouldReplaceAllInteger() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1, 0, 3, 3, 2, 3};
        int numberToReplace = 3;
        int newNumber = 7;
        int expectedResult = 7;
        int actualResult = arrayTest.replaceAllInteger(array, numberToReplace, newNumber);
        if (actualResult == expectedResult) {
            System.out.println("shouldReplaceInteger ---> SUCCESSFUL! ---> " + "at array of numbers " + Arrays.toString(array) + " ---> all " + numberToReplace + " replaced to " + newNumber);
        } else {
            System.out.println("shouldCountIntegers ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    }
// ^^^ lesson_6 -> level_3_junior -> Task_12 -> Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.

    public void shouldReplaceInteger() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1, 0, 3, 3};
        int numberToReplace = 3;
        int newNumber = 7;
        int expectedResult = 7;
        int actualResult = arrayTest.replaceInteger(array, numberToReplace, newNumber);
        if (actualResult == expectedResult) {
            System.out.println("shouldReplaceInteger ---> SUCCESSFUL! ---> " + "at array of numbers " + Arrays.toString(array) + " ---> first " + numberToReplace + " replaced to " + newNumber);
        } else {
            System.out.println("shouldCountIntegers ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    }
// ^^^ lesson_6 -> level_3_junior -> Task_11 -> Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.

    public void shouldCountIntegers() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1, 0, 0, 0};
        int number = 0;
        int expectedResult = 3;
        int actualResult = arrayTest.integerCounter(array, number);
        if (actualResult == expectedResult) {
            System.out.println("shouldCountIntegers ---> SUCCESSFUL! ---> " + "at array of numbers " + Arrays.toString(array) + " ---> " + number + " contains " + expectedResult + " times.");
        } else {
            System.out.println("shouldCountIntegers ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    }
// ^^^ lesson_6 -> level_3_junior -> Task_10 -> Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.

    public void shouldFindSpecifiedNumber() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1, 0};
        int specifiedNumber = 1;
        String actualResult = arrayTest.findSpecifiedNumber(array, specifiedNumber);
        String expectedResult = "Array contain your number!";
        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldFindSpecifiedNumber ---> SUCCESSFUL! ---> " + "an array of numbers " + Arrays.toString(array) + " ---> " + expectedResult);
        } else {
            System.out.println("shouldFindSpecifiedNumber ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    }
// ^^^ lesson_6 -> level_3_junior -> Task_9 -> Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указанное число.


    //-------------- здесь начинаются задачи из задания lesson_5 -> level_5_middle --------------\\
    public void shouldCreateArray() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = arrayTest.createArray(9);
        int expectedResult = 9;
        if (array.length == expectedResult) {
            System.out.println("shouldCreateArray ---> SUCCESSFUL! ---> array contains " + array.length + " cells " + " ---> " + "expected result " + expectedResult + " cells.");
        } else {
            System.out.println("shouldCreateArray ---> FAILED! ---> array contains " + array.length + " cells " + " ---> " + "expected result " + expectedResult + " cells.");
        }
    } //^^^ Task_32. Создайте класс ArrayUtilTest. В этом классе напишите автоматический тест метода int[] createArray(int arrayLength) из предыдущего задания.

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }  // ^^^ Task_34. В классе ArrayUtilTest напишите автоматический тест метода void fillArrayWithRandomNumbers(int[] array) из предыдущего задания.

    public void shouldFindMaxNumber() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1};
        int actualResult = arrayTest.findMaxNumber(array);
        int expectedResult = 5;
        if (actualResult == expectedResult) {
            System.out.println("shouldFindMaxNumber ---> SUCCESSFUL! ---> " + "in an array of numbers " + Arrays.toString(array) + " ---> " + expectedResult + " is MaxNumber.");
        } else {
            System.out.println("shouldFindMaxNumber ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    } // ^^^ Task_37. В классе ArrayUtilTest напишите автоматический тестдля метода int findMaxNumber(int[] array) из предыдущего задания.

    public void shouldFindMinNumber() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1};
        int actualResult = arrayTest.findMinNumber(array);
        int expectedResult = 1;
        if (actualResult == expectedResult) {
            System.out.println("shouldFindMinNumber ---> SUCCESSFUL! ---> " + "in an array of numbers " + Arrays.toString(array) + " ---> " + expectedResult + " is MinNumber.");
        } else {
            System.out.println("shouldFindMinNumber ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    } // ^^^ Task_39. В классе ArrayUtilTest напишите автоматический тест для метода int findMinNumber(int[] array) из предыдущего задания.
//----------------- здесь заканчиваются задачи из задания lesson_5 -> level_5_middle ----------------\\
}
