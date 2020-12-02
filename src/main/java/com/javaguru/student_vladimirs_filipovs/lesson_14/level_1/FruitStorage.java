package com.javaguru.student_vladimirs_filipovs.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> appleFinderByColour(List<Apple> appleList, String colour) {
        List<Apple> applesByColourList = new ArrayList<>();
        for (Apple apple : appleList)
            if (apple.getColour().equalsIgnoreCase(colour)) {
                applesByColourList.add(apple);
            }
        return applesByColourList;
    }

    public List<Apple> heavyAppleFinder(List<Apple> appleList, int weightMinLimit) {
        List<Apple> applesByWeightList = new ArrayList<>();
        for (Apple apple : appleList) {
            if (apple.getWeight() > weightMinLimit) {
                applesByWeightList.add(apple);
            }
        }
        return applesByWeightList;
    }
}

class FruitDemo {
    public static void main(String[] args) {
        FruitStorage fruits = new FruitStorage();

        List<Apple> greenApplesList;
        List<Apple> redApplesList;
        List<Apple> minWeightAppleList;

        greenApplesList = fruits.appleFinderByColour(fruits.getApples(), "green");
        System.out.println(greenApplesList);

        redApplesList = fruits.appleFinderByColour(fruits.getApples(), "red");
        System.out.println(redApplesList);

        minWeightAppleList = fruits.heavyAppleFinder(fruits.getApples(), 150);
        System.out.println(minWeightAppleList);
    }
}
