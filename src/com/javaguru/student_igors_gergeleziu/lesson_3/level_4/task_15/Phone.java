package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_15;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    private String model;

    public Phone(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}
