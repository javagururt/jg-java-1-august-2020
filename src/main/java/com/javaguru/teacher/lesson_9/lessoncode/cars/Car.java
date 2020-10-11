package com.javaguru.teacher.lesson_9.lessoncode.cars;

abstract class Car {

    protected String model;

    public Car(String model) {
        this.model = model;
    }

    abstract void start();

    abstract void stop();

}
