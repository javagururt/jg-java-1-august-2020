package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

//Призываем метод
@CodeReview(approved = true)
class RobotDemo {
    public static void main (String [] args){
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

    }


}
