package com.javaguru.student_maksim_morozov.lesson_3.Level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }
    public String getModel() {
        return model;
    }
}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}