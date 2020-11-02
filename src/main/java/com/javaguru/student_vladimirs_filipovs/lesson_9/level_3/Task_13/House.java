package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3.Task_13;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class House extends Buildings {
double length;
double width;

    public House(String buildingName, double length, double width) {
        super(buildingName);
        this.length = length;
        this.width = width;
    }

    @Override
    double firstFlourArea() {
        return length * width;
    }
}
