package com.javaguru.student_ivan_shulga.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

// пока что для себя буду порой писать много комментариев, чтобы самому разобраться что к чему, т.к.
// после "Hello world!" для меня начинается тёмный лес в Java
@CodeReview(approved = true)
class Robot {    // создаём класс  Robot (Task_1)

    public void sayHello() {

        System.out.println("Hello!");  // тут пишем команду распечатки на консоли строки "Hello!" (Task_1)
    }

    public Robot() {    // в классе робот (Robot) создаём конструктор без параметров (Task_2)
    }

    public void sayYourName() {
        System.out.println("My name is ROBO!");  // тут пишем команду распечатки на консоли строки "My name is ROBO" (Task_5)
    }

}
