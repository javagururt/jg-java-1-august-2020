package com.javaguru.teacher.lesson_9.homework.level_6_middle;

class VarArgsDemo {

    public static void main(String[] args) {

        VarArgsExample varArgsExample = new VarArgsExample();

        int totalSum = varArgsExample.sumOfAllNumbers(1, 3, 5, 6, 7, 2, 4, 6);
        System.out.println(totalSum);
    }
}
