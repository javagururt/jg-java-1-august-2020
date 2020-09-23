package com.javaguru.student_igors_jurkovs.personal.CarPark;

import java.util.ArrayList;
import java.util.List;

class CarPark {

    List<Car> cars;
    List<Truck> trucks;

    CarPark(List<Car> cars, List<Truck> trucks) {
        this.cars = cars;
        this.trucks = trucks;
    }

    List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        for (Car car: cars) {
            allCars.add(car);
        }
        return allCars;

    }

    List<Truck> getAllTrucks() {
        List<Truck> allTrucks = new ArrayList<>();
        for (Truck truck: trucks) {
            allTrucks.add(truck);
        }
        return allTrucks;
    }


}
