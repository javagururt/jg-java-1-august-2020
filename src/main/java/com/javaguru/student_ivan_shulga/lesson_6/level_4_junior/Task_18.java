package com.javaguru.student_ivan_shulga.lesson_6.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Random;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "лучше не смешивать static/non-static методы в одном классе")
class TwoDimensionalArray {

    int[][] createTwoDemensionalArray(int size) {
        int[][] twoDimensionalArray = new int[size][size];
        return twoDimensionalArray;
    }

    public void fillArrayWithRandomNumbers(int[][] twoDimensionalArray) {
        Random randomInt = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = randomInt.nextInt(3);
            }
        }
    }

    static int sumElements(int[][] twoDimensionalArray) { // сложение чисел двумерного массива
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                sum += twoDimensionalArray[i][j];
            }
        } return sum;
    }

     void printArray(int[][] twoDimensionalArray) {
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class TwoDimensionalArrayTestAndDemo {

    public static void main(String[] args) {

        TwoDimensionalArray testArray = new TwoDimensionalArray(); // пример работы программы (для себя, для наглядности)
        int[][] newArray = testArray.createTwoDemensionalArray(3);
        System.out.println("Пример работы программы (для себя, для наглядности):");
        testArray.fillArrayWithRandomNumbers(newArray);
        testArray.printArray(newArray);
        System.out.println("Сумма чисел двумерного массива равна: " + testArray.sumElements(newArray));

        System.out.println();

        System.out.println("Тесты:"); // здесь начинаются тесты

        TwoDimensionalArrayTestAndDemo tests = new TwoDimensionalArrayTestAndDemo();
        tests.shouldReturnSum8();

    }

        void shouldReturnSum8() { // задаём массив и вручную указываем значение каждой ячейки (вариант только для небольшого массива)
            int[][] array = new int[3][3];
            array[0][1]=1;
            array[1][0]=0;
            array[0][0]=2;
            array[1][1]=2;
            array[0][2]=0;
            array[1][2]=1;
            array[2][2]=1;
            array[2][1]=0;
            array[2][0]=1;
            int expected = 8;
            int actual = TwoDimensionalArray.sumElements(array);
            assertResult(expected, actual, "shouldReturnSum8");
        }

        private void assertResult(int expected, int actual, String testName) {
            if (expected == actual) {
                System.out.println(testName + ": SUCCESS");
            } else {
                System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
            }
        }

}

/*
Как объявить двумерный массив?
Найти в интернете и написать пример кода в котором:
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.

Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */