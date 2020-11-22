package com.javaguru.student_vladimirs_filipovs.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

//У дефолтного конструктора нет никаких аргументов,
// но он срабатывает каждый раз при создании любого объекта любого класса.
class DefaultConstructorCat {

}
@CodeReview(approved = true)
class DefaultConstructorCatDemo{
    public static void main(String[] args) {
        DefaultConstructorCat cat = new DefaultConstructorCat();
    }
}