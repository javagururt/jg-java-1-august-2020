package com.javaguru.student_vadim_migun.lesson_9.level_2.task_7;

import com.javaguru.teacher.codereview.CodeReview;

/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */
@CodeReview(approved = true)
class Human {

    private String name;


    public Human(String name) {
        this.name = name;
    }

}

class Man extends Human {

    public Man(String name) {
        super(name);
    }
}

class Woman extends Human {

    public Woman(String name) {
        super(name);
    }
}