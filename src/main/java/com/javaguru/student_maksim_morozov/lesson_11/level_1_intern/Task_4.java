package com.javaguru.student_maksim_morozov.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class Task_4 {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();

        Integer firstNumber = 11;
        Integer secondNumber = 4;
        Integer thirdNumber = 24;

        integerList.add(firstNumber);
        integerList.add(secondNumber);
        integerList.add(thirdNumber);
        integerList.add(11);

        System.out.println(integerList.toString());

    }
}
