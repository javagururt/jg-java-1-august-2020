package com.javaguru.student_ivan_shulga.lesson_14.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class TempTestsForMe {

    public static void main(String[] args) {

        FruitStorage testFruitStorage = new FruitStorage();

        List<Apple> testApples = testFruitStorage.getAllApples();

        System.out.println(testFruitStorage.findGreenApples(testApples)); // поиск только зелёных яблок

        System.out.println(testFruitStorage.findApplesByColor(testApples, "red")); // поиск красных яблок

        System.out.println(testFruitStorage.findApplesByWeight(testApples, 150)); // поиск тяжёлых яблок

    }

}
