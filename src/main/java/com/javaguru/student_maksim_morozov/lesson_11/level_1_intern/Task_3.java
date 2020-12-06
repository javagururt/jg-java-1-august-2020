package com.javaguru.student_maksim_morozov.lesson_11.level_1_intern;

import java.util.*;

class IntegerListDemo {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 8;
        int thirdnumber = 11;

        List<Integer> integerList = new ArrayList<>();

        integerList.add(firstNumber);
        integerList.add(0, secondNumber);
        integerList.add(thirdnumber);

        System.out.println(integerList.toString());
        System.out.println(integerList.size());
        System.out.println(integerList.isEmpty());

        integerList.remove(Integer.valueOf(firstNumber));
        integerList.remove(0);

        System.out.println(integerList.toString());

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(thirdnumber);
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
