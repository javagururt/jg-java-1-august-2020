package com.javaguru.student_vladimirs_filipovs.lesson_11.level_1;

import java.util.ArrayList;

class Task_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        int a = 99;
        int b = 99;
        numberList.add(a);
        numberList.add(a);
        numberList.add(b);
        numberList.add(99);
        System.out.println(numberList);
    }
}
