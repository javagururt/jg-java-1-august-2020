package com.javaguru.student_maksim_morozov.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_1 {
    public static void main(String[] args){

        List<Object> intList = new ArrayList<>();
        int firstNumber = 11;
        Object objectExample = new Object();
        intList.add(firstNumber);
        intList.add(objectExample);

        System.out.println(intList.get(0));

        List<Object> doubleList = new LinkedList<>();
        double secondNumber = 17;
        doubleList.add(secondNumber);
        doubleList.add(objectExample);

        System.out.println(doubleList.get(0));
    }
}
