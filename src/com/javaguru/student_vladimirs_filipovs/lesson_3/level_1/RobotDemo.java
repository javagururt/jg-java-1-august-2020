package com.javaguru.student_vladimirs_filipovs.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot roboCop = new Robot();
        roboCop.sayHello();
        roboCop.sayYourName();

        Robot roboCop2 = new Robot();
        roboCop2.sayHello();
        roboCop2.sayYourName();
    }
}
