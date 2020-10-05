package com.javaguru.teacher.lesson_6.lessoncode;

class ArrayUtils {

    static int[][] createMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        return sum;
    }
}
