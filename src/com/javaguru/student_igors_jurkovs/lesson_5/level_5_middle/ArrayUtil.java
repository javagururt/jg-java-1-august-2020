package com.javaguru.student_igors_jurkovs.lesson_5.level_5_middle;

/*
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.
 */
/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.
 */
class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}

/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.
 */
/*
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.
 */

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest createArrayTest = new ArrayUtilTest();
        createArrayTest.createArrayTest();
        createArrayTest.fillArrayWithRandomNumbersTest();
    }

    void createArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 5;
        int[] array = arrayUtil.createArray(arrayLength);
        if (array.length == 5) {
            System.out.println("ArrayUtil test : OK");
        } else {
            System.out.println("ArrayUtil test : FAILED");
        }
    }

    void fillArrayWithRandomNumbersTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        boolean empty = true;
        for (Integer ar : array) {
            if (ar != null) {
                empty = false;
                break;
            }
        }
        if (array.length > 0 && !empty) {
            System.out.println("Array not empty");
        } else {
            System.out.println("Array empty");
        }
    }
}