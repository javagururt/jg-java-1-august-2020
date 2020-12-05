package com.javaguru.student_ivan_shulga.lesson_14.level_1_intern;

import java.util.Objects;

public class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight &&
                Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

}

/*
Хорошо известная проблема в разработке программного обеспечения
состоит в том, что независимо от того, что вы делаете,
требования пользователя меняются.

Например, представьте приложение, которое поможет фермеру
исследовать его запасы.

class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

}

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


}

Первое требование фермера:
найти все зеленые яблоки в своем складе.

В классе FruitStorage создайте метод для реализации этого требования.

Создайте класс FruitStorageTest и напишите юнит тест
опираясь на данные из FruitStorage.getAllApples().
 */