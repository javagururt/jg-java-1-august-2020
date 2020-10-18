package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_16;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel(){
        return this.model;
    }

}
