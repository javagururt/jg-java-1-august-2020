package com.javaguru.teacher.lesson_9.lessoncode.cars;

class CarMain {

    public static void main(String[] args) {
//        Car car1 = new Car();
        ElectricCar electricCar = new ElectricCar("Tesla", 20);
        electricCar.start();

        PetrolCar petrolCar = new PetrolCar("BMW");
        petrolCar.start();

        electricCar.setBatteryCapacity(0);

        electricCar.start();
        electricCar.stop();
    }
}
