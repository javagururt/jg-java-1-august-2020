package com.javaguru.student_igors_jurkovs.lesson_9.level_2_intern.task_7;

/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.

Конструктор родительского класса вызывается ключевым словом super.
Это нужно делать при наследовании, чтобы унаследоватсья от суперкласса.
В противном случае выдаст компиляционную ошибку.
 */

class ChildConstructorExample extends ParentConstructorExample {

    ChildConstructorExample (int property1, String property2) {
        super(property1, property2);
    }
}
