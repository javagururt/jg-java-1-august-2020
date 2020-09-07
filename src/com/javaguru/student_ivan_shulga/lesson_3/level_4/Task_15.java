package com.javaguru.student_ivan_shulga.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Phone.
@CodeReview(approved = true)
class Phone {

    private String model;

    public Phone(String newModel) { // Book заменено на Phone
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
