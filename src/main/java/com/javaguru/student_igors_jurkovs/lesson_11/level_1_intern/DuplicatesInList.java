package com.javaguru.student_igors_jurkovs.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class DuplicatesInList {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        Integer firstNumber = 5;
        Integer secondNumber = 5;

        integerList.add(firstNumber);
        integerList.add(secondNumber);
        integerList.add(firstNumber);
        integerList.add(5);

        System.out.println(integerList.toString());
    }
}
