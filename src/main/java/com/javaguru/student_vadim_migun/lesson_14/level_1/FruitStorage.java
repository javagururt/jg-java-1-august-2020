package com.javaguru.student_vadim_migun.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

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

    List<Apple> findAllGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apples : getAllApples()) {
            if ("green".equals(apples.getColor())) {
                greenApples.add(apples);
            }
        }
        return greenApples;
    }


}