package com.javaguru.student_igors_jurkovs.personal.CarPark;

import java.util.ArrayList;
import java.util.List;

class CarParkCalculatorDemo {

    public static void main(String[] args) {
        Car car = new Car("H123", 70, 50);
        Truck truck = new Truck("F553", 300, 150);

        List<Car> cars = new ArrayList<>();
        cars.add(car);

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck);

        CarPark carPark = new CarPark(cars, trucks);
        carPark.printEachVehiclesRemainingDistance();

    }
}
