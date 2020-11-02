package com.javaguru.student_igors_jurkovs.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class ArrayAndLinkedListExample {

    public static void main(String[] args) {

        List<Object> intList = new ArrayList<>();
        int firstNumber = 5;
        Object objectExample = new Object();
        intList.add(firstNumber);
        intList.add(objectExample);

        System.out.println(intList.get(0));

        List<Object> doubleList = new LinkedList<>();
        double secondNumber = 9.0;
        doubleList.add(secondNumber);
        doubleList.add(objectExample);

        System.out.println(doubleList.get(0));
    }
}

/**
 * Связной список отличается от массивном тем, что в первом объекты хранятся в памяти, а во втором
 * в массиве. Связной список лучше для манипуляции с данными, а не массивный для быстрого доступа к данным.
 *
 * Списки могут хранить только объекты, для хранения примитивов, они помещаются в соответствующую обертку.
 */
