package com.javaguru.teacher.lesson_6.lessoncode;

import java.util.Scanner;

class ArrayUtilsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter table size:");
        int size = scanner.nextInt();
        int[][] table = ArrayUtils.createMultiplicationTable(size);
        ArrayUtils.printArray(table);
    }
}
