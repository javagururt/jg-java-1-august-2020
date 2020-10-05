package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_28;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
