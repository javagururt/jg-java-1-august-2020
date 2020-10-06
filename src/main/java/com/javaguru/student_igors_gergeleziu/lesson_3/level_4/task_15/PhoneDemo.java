package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_15;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
