package com.javaguru.student_igors_jurkovs.personal.CarPark;

import java.util.ArrayList;
import java.util.List;

class CarParkCalculatorDemo {

    public static void main(String[] args) {
        Car car1 = new Car(70, 40);
        Car car2 = new Car(60, 60);
        Car car3 = new Car(65, 10);
        Car car4 = new Car(80, 5);
        Car car5 = new Car(90, 0);
        Truck truck1 = new Truck(220, 90);
        Truck truck2 = new Truck(200, 100);
        Truck truck3 = new Truck(250, 120);
        Truck truck4 = new Truck(300, 200);
        Truck truck5 = new Truck(320, 320);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        trucks.add(truck4);
        trucks.add(truck5);
        CarPark carPark = new CarPark(cars, trucks);
        CarParkFuelCalculator carParkFuelCalculator = new CarParkFuelCalculator();

        System.out.println(carParkFuelCalculator.calculateFuel(carPark, VehicleType.CAR, FuelInformationType.CURRENT));
        System.out.println(carParkFuelCalculator.calculateFuel(carPark, VehicleType.TRUCK, FuelInformationType.CURRENT));
        System.out.println(carParkFuelCalculator.calculateFuel(carPark, VehicleType.CAR, FuelInformationType.EMPTY));
        System.out.println(carParkFuelCalculator.calculateFuel(carPark, VehicleType.TRUCK, FuelInformationType.EMPTY));

    }
}
