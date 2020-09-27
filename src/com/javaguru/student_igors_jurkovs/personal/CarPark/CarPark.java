package com.javaguru.student_igors_jurkovs.personal.CarPark;

import java.util.ArrayList;
import java.util.List;

class CarPark {

    private List<Car> cars;
    private List<Truck> trucks;
    private List<Vehicle> vehicles;

    CarPark(List<Car> cars, List<Truck> trucks) {
        this.cars = cars;
        this.trucks = trucks;
        this.vehicles = mergeAllVehicle(cars, trucks);
    }

    private List<Vehicle> mergeAllVehicle(List<Car> cars, List<Truck> trucks) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.addAll(cars);
        vehicles.addAll(trucks);

        return vehicles;
    }

    List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    List<Car> getAllCars() {
        return cars;
    }

    List<Truck> getAllTrucks() {
        return trucks;
    }

    Vehicle getVehicle(String registrationNumber) {
        Vehicle vehicle = null;
        for (Vehicle veh: vehicles) {
            if (veh.getRegistrationNumber().equals(registrationNumber)) {
                vehicle = veh;
            }
        }

        return vehicle;
    }

    void printEachVehiclesRemainingDistance() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.calculateRemainingDistance());
        }
    }
}
