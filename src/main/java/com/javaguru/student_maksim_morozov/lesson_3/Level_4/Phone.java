package com.javaguru.student_maksim_morozov.lesson_3.Level_4;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Phone {

    private String model;

    @CodeReviewComment(teacher = "конструктор работает некорректно")

    public Phone(String newModel) {
        this.model = newModel;
    }

    public String getModel() { return this.model; }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}