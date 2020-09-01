package com.javaguru.student_igors_jurkovs.lesson_3.level_4;
/*
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Car.

 */
class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel () { //пропущены круглые скобки
        return this.model; // пропущена ";"
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}