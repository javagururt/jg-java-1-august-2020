package com.javaguru.student_ivan_shulga.lesson_14.level_1_intern;

import java.util.List;

public class FruitStorageTest { // тесты не через junit просто так, для практики непонятно чего, логичекого мышления на языке java

    public static void main(String[] args) {

        FruitStorageTest test = new FruitStorageTest();
        test.shouldFindOnlyGreenApplesOldMethod();
        test.shouldFindRedApples();
        test.shouldFindApplesWithWeightMoreThan150();
    }


    public void shouldFindApplesWithWeightMoreThan150() { // проверка как-бы работает, но есть куда улучшить, сразу не вижу как
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> heavyApples = testFruitStorage.findApplesByWeight(allApples, 150);
        for(Apple apple : heavyApples)
        if (heavyApples.stream().anyMatch(ap -> ap.getWeight() < 150)) {  //в перспективе добавить Optional
            System.out.println("Test Fail!");
        } else {
            System.out.println("Test Ok!");
        }
    }

    public void shouldFindRedApples() {
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> redApples = testFruitStorage.findApplesByColor(allApples, "red");
        if (redApples.contains("yellow") | redApples.contains("green")) {  //в перспективе добавить Optional
            System.out.println("Test Fail!");
        } else {
            System.out.println("Test Ok!");
        }
    }


    public void shouldFindOnlyGreenApplesOldMethod() {
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> onlyGreenApples = testFruitStorage.findGreenApples(allApples);
        if (onlyGreenApples. contains("yellow") | onlyGreenApples.contains("red")) {  //в перспективе добавить Optional
            System.out.println("Test Fail!");
        } else {
            System.out.println("Test Ok!");
        }

    }

}
