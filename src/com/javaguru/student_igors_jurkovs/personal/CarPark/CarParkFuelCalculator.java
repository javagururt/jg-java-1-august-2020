package com.javaguru.student_igors_jurkovs.personal.CarPark;

class CarParkFuelCalculator {

    CarPark carPark;

    CarParkFuelCalculator(CarPark carPark) {
        this.carPark = carPark;
    }

    double calculateFuel(VehicleType vehicleType, FuelInformationType fuelInformationType) {
        if (vehicleType.equals(VehicleType.CAR) && fuelInformationType == FuelInformationType.CURRENT) {
            return allCarsCurrentFuel();
        } else if (vehicleType.equals(VehicleType.TRUCK) && fuelInformationType == FuelInformationType.CURRENT) {
            return allTrucksCurrentFuel();
        } else if (vehicleType.equals(VehicleType.CAR) && fuelInformationType == FuelInformationType.EMPTY) {
            return allCarsFreeSpaceForFuel();
        } else {
            return allTrucksFreeSpaceForFuel();
        }

    }
    

    double allCarsCurrentFuel() {
        double currentFuel = 0;
        for (Car car: carPark.getAllCars()) {
            currentFuel += car.currentFuel;
        }

        return currentFuel;
    }

    double allTrucksCurrentFuel() {
        double currentFuel = 0;
        for (Truck truck: carPark.getAllTrucks()) {
            currentFuel += truck.currentFuel;
        }

        return currentFuel;
    }

    double allCarsFreeSpaceForFuel() {
        double freeSpaceForFuel = 0;
        for (Car car: carPark.getAllCars()) {
            freeSpaceForFuel += (car.maxFuel - car.currentFuel);
        }
        return freeSpaceForFuel;
    }

    double allTrucksFreeSpaceForFuel() {
        double freeSpaceForFuel = 0;
        for (Truck truck : carPark.getAllTrucks()) {
            freeSpaceForFuel += (truck.maxFuel - truck.currentFuel);
        }
        return freeSpaceForFuel;
    }
}
