package com.javaguru.student_igors_jurkovs.personal.CarPark;

class Car extends Vehicle{

    static double CAR_FUEL_CONSUMPTION = 0.1;

    Car(String registrationNumber, double maxFuel, double currentFuel) {
        super(registrationNumber, maxFuel, currentFuel);
    }

    double calculateRemainingDistance() {
        System.out.println("I'm car");
        return currentFuel * CAR_FUEL_CONSUMPTION;
    }
}
