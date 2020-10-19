package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3.Task_13;

abstract class Buildings {
        private String buildingName;

    public Buildings(String buildingName) {
        this.buildingName = buildingName;
    }

    abstract double firstFlourArea();

}
