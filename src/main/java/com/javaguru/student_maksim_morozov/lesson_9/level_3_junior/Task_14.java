package com.javaguru.student_maksim_morozov.lesson_9.level_3_junior;

abstract class Task_14 {
    abstract class Car {

        abstract void accelerate();

    }

    abstract class ElectricCar extends Car {

        private int batteryCharge;


    }

    abstract class PetrolCar extends Car {

        private double petrolTankCapacity;

    }
}
