package com.javaguru.teacher.lesson_6.lessoncode;

import java.util.ArrayList;
import java.util.List;

class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println(integers);
        System.out.println(integers.get(1));
        integers.remove(1);
        System.out.println(integers);
    }
}
