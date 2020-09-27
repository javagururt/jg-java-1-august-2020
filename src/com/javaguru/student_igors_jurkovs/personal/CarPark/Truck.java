package com.javaguru.student_igors_jurkovs.personal.CarPark;

class Truck extends Vehicle {

    static double TRUCK_FUEL_CONSUMPTION = 0.2;

    Truck(String registrationNumber, double maxFuel, double currentFuel) {
        super(registrationNumber, maxFuel, currentFuel);
    }

    double calculateRemainingDistance() {
        System.out.println("I'm truck");
        return currentFuel * TRUCK_FUEL_CONSUMPTION;
    }
}
