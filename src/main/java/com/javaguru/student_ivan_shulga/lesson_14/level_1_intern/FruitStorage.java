package com.javaguru.student_ivan_shulga.lesson_14.level_1_intern;

import com.javaguru.student_ivan_shulga.lesson_14.level_2_intern.ApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitStorage {

    public List<Apple> getAllApples() {
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

    public List<Apple> findGreenApples(List<Apple> apples) {
        return apples
                .stream()
                .filter(ap -> ap.getColor().equals("green"))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByColor(List<Apple> apples, String color) {
        return apples
                .stream()
                .filter(ap -> ap.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByWeight (List<Apple> apples, int weight) {
        return apples
                .stream()
                .filter(ap -> ap.getWeight() >= weight)
                .collect(Collectors.toList());
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
