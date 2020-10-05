package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;
/*
int[] copyInRange(int[] in, int numberFrom, int numberTo)

вернуть новый массив, который содержит только те числа,
которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */
class CopyNumbersInRange {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] copyInRange = new int[numbersQuantityInRange(in, numberFrom, numberTo)];
        int copyInRangeIndex = 0;
        for (int j : in) {
            if (j >= numberFrom && j <= numberTo) {
                copyInRange[copyInRangeIndex] = j;
                copyInRangeIndex++;
            }
        }

        return copyInRange;
    }

    int numbersQuantityInRange(int[] in, int numberFrom, int numberTo) {
        int numbersInRange = 0;
        for (int j : in) {
            if (j >= numberFrom && numberTo >= j) {
                numbersInRange++;
            }
        }

        return numbersInRange;
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
