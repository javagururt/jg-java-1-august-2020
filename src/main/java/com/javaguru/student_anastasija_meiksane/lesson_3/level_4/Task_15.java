package com.javaguru.student_anastasija_meiksane.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

/*
class Phone {

    private String model;

    public Book(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
 */
@CodeReview(approved = true)
    class Phone {

        private String model;

        public Phone(String newModel) {this.model = newModel;}

        public String getModel() { return this.model; }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }

