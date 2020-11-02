package com.javaguru.student_igors_jurkovs.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
@CodeReview(approved = true)
class IntegerListDemo {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 3;

        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(firstNumber);
        integerList.add(0, secondNumber);
        integerList.add(thirdNumber);

        System.out.println(integerList.toString());
        System.out.println(integerList.size());
        System.out.println(integerList.isEmpty());

        integerList.remove(Integer.valueOf(firstNumber));
        integerList.remove(0);

        System.out.println(integerList.toString());

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(thirdNumber);
        integerLinkedList.addFirst(secondNumber);
        integerLinkedList.addLast(firstNumber);

        System.out.println(integerLinkedList.toString());
        System.out.println(integerLinkedList.size());
        System.out.println(integerLinkedList.isEmpty());

        integerLinkedList.remove(Integer.valueOf(firstNumber));
        integerLinkedList.remove(0);
        integerLinkedList.removeFirst();

        System.out.println(integerLinkedList.toString());
    }
}
