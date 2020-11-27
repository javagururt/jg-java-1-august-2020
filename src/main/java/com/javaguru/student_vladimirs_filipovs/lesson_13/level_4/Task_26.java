package com.javaguru.student_vladimirs_filipovs.lesson_13.level_4;

class Task_26 {
    static int i = 0;

    public static int printNum(int x) {
        i = i + 1;
        System.out.println(i);
        return i + printNum(i + 1);
    }

    public static void main(String[] args) {
        Task_26.printNum(i);
    }
}
