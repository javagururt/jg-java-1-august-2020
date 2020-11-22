package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3;

abstract class Car {
    abstract void accelerate();

}


class ElectricCar extends Car {
    private int batteryCharge;

    @Override
    void accelerate() {
    }
}


class PetrolCar extends Car {
    private double petrolTankCapacity;

    @Override
    void accelerate() {
    }
}