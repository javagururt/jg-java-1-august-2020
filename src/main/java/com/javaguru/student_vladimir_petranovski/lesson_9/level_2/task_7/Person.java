package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_7;

import com.javaguru.teacher.codereview.CodeReview;

/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */
// Он вызывается при помощи ключевого слова super, это нужно делать всегда, иначе выдаст компиляциооную ошибку
@CodeReview(approved = true)
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {

    }
}
