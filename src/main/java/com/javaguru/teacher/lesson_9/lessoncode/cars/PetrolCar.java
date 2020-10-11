package com.javaguru.teacher.lesson_9.lessoncode.cars;

class PetrolCar extends Car {

    public PetrolCar(String model) {
        super(model);
    }

    @Override
    void start() {
        System.out.println("Petrol car started");
    }

    @Override
    void stop() {
        System.out.println("Petrol car stopped");
    }
}
