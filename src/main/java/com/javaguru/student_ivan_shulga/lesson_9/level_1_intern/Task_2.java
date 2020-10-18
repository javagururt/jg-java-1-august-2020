package com.javaguru.student_ivan_shulga.lesson_9.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_2 {

    int a = 22;

    public int getA() {
        return a;
    }

}

class Task_2_Demo {

    public static void main(String[] args) {

        Task_2 test = new Task_2(); // объявлен объект класса с использованием конструктора по умолчанию
        System.out.println(test.getA());

    }

}
/*
Нужно ли в классе создавать дефолтный конструктор
или Java его автоматически добавит при компиляции
кода? Ответьте на вопрос примером кода!
 */