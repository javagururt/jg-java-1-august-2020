package com.javaguru.student_maksim_morozov.lesson_14.level_1_intern;

import java.util.List;

class FruitStorageTest {

    public static void main(String[] args){
        FruitStorageTest test = new FruitStorageTest();
        test.shouldFindOnlyGreenApplesOldMethod();
        test.shouldFindRedApples();
        test.shouldFindApplesWithWeightMoreThan150();
    }
    public void shouldFindOnlyGreenApplesOldMethod(){
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> onlyGreenApples = testFruitStorage.findGreenApples(allApples);
        if (onlyGreenApples.contains("yellow") | onlyGreenApples.contains("red")){
            System.out.println("Ощибка задачи!");
        } else {
            System.out.println("Тест пройден!");
        }
    }
    public void shouldFindRedApples(){
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> redApples = testFruitStorage.findApplesByColor(allApples, "red");
        if (redApples.contains("yellow") | redApples.contains("green")){
            System.out.println("Ощибка задачи!");
        } else {
            System.out.println("Тест пройден!");
        }
    }
    public void shouldFindApplesWithWeightMoreThan150(){
        FruitStorage testFruitStorage = new FruitStorage();
        List<Apple> allApples = testFruitStorage.getAllApples();
        List<Apple> heavyApples = testFruitStorage.findApplesByWeight(allApples, 150);
        for (Apple apple : heavyApples)
            if (heavyApples.stream().anyMatch(ap -> ap.getWeight() < 150)){
                System.out.println("Ощибка задачи!");
            } else {
                System.out.println("Тест пройден!");
            }
    }
}
