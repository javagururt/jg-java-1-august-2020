package com.javaguru.student_igors_jurkovs.personal.CarPark;

abstract class Vehicle {

    private String registrationNumber;
    protected double maxFuel;
    protected double currentFuel;

    Vehicle(String registrationNumber, double maxFuel, double currentFuel) {
        this.registrationNumber = registrationNumber;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    abstract double calculateRemainingDistance();

    String getRegistrationNumber() {
        return registrationNumber;
    }

}
