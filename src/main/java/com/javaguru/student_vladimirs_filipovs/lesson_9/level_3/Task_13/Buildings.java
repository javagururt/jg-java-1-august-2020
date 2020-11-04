package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3.Task_13;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Buildings {
        private String buildingName;

    public Buildings(String buildingName) {
        this.buildingName = buildingName;
    }

    abstract double firstFlourArea();

}
