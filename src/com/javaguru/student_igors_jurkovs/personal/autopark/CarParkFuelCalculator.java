package com.javaguru.student_igors_jurkovs.personal.autopark;

class CarParkFuelCalculator {

    double calculateFuel(CarPark carPark, VehicleType vehicleType, FuelInformationType fuelInformationType) {
        if (vehicleType.equals(VehicleType.CAR) && fuelInformationType == FuelInformationType.CURRENT) {
            return allCarsCurrentFuel(carPark);
        } else if (vehicleType.equals(VehicleType.TRUCK) && fuelInformationType == FuelInformationType.CURRENT) {
            return allTrucksCurrentFuel(carPark);
        } else if (vehicleType.equals(VehicleType.CAR) && fuelInformationType == FuelInformationType.EMPTY) {
            return allCarsFreeSpaceForFuel(carPark);
        } else {
            return allTrucksFreeSpaceForFuel(carPark);
        }

//        double maxCarFuel = allCarsCurrentFuel(carPark) + allCarsFreeSpaceForFuel(carPark);
//        System.out.println("All cars current fuel is " + allCarsCurrentFuel(carPark) + " out of " + maxCarFuel + " max fuel.");
//        System.out.println("Empty space for cars fuel is: " + allCarsFreeSpaceForFuel(carPark));
//        double maxTruckFuel = allTrucksCurrentFuel(carPark) + allTrucksFreeSpaceForFuel(carPark);
//        System.out.println("All cars current fuel is " + allTrucksCurrentFuel(carPark) + " out of " + maxTruckFuel + " max fuel.");
//        System.out.println("Empty space for trucks fuel is: " + allTrucksFreeSpaceForFuel(carPark));
    }

    double allCarsCurrentFuel(CarPark carPark) {
        double currentFuel = 0;
        for (Car car: carPark.getAllCars()) {
            currentFuel += car.currentFuel;
        }

        return currentFuel;
    }

    double allTrucksCurrentFuel(CarPark carPark) {
        double currentFuel = 0;
        for (Truck truck: carPark.getAllTrucks()) {
            currentFuel += truck.currentFuel;
        }

        return currentFuel;
    }

    double allCarsFreeSpaceForFuel(CarPark carPark) {
        double freeSpaceForFuel = 0;
        for (Car car: carPark.getAllCars()) {
            freeSpaceForFuel += (car.maxFuel - car.currentFuel);
        }
        return freeSpaceForFuel;
    }

    double allTrucksFreeSpaceForFuel(CarPark carPark) {
        double freeSpaceForFuel = 0;
        for (Truck truck : carPark.getAllTrucks()) {
            freeSpaceForFuel += (truck.maxFuel - truck.currentFuel);
        }
        return freeSpaceForFuel;
    }
}
