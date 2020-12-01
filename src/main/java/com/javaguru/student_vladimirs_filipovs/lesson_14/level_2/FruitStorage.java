package com.javaguru.student_vladimirs_filipovs.lesson_14.level_2;

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


    public List<Apple> findApples(List<Apple> appleList, ApplePredicate pred) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (pred.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}

class FruitDemo {
    public static void main(String[] args) {
        FruitStorage fruits = new FruitStorage();

        System.out.println("All green apples: " +
                fruits.findApples(fruits.getApples(),
                        new GreenApplesPredicate()));

        System.out.println("All red apples: " +
                fruits.findApples(fruits.getApples(),
                        new RedApplesPredicate()));

        System.out.println("All apples with weight > 150g: " +
                fruits.findApples(fruits.getApples(),
                        new HeavyApplesPredicate()));

        System.out.println("All apples with weight < 150g: " +
                fruits.findApples(fruits.getApples(),
                        new LightApplesPredicate()));
    }
}
