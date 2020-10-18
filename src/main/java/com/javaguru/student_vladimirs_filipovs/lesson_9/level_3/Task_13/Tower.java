package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3.Task_13;

class Tower extends Buildings {
double radius;

    public Tower(String buildingName, double radius) {
        super(buildingName);
        this.radius = radius;
    }

    @Override
    double firstFlourArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
