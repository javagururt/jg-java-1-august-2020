package com.javaguru.student_ivan_shulga.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

// Найти ошибку в коде.
// Исправить и запустить программу.
// Менять можно только класс Car.
@CodeReview(approved = true)
class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() { //добавлено --->>> ()
        return this.model; // добавлено --->>> ;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
