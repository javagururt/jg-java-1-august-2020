/*
- Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указанное число.
- Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
- Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.

 */
package com.javaguru.student_sergey_kazyanin.lesson_6.level_3_junior;

class ArrayUtil {

    public boolean isNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int numberCount(int[] array, int number) {
        int count = 0;
        for (int i : array) {
            if (i == number) count++;
        }
        return count;
    }

    public void replace(int[] arr, int numberToReplace, int number) {

    }
}
