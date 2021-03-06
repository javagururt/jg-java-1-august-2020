package com.javaguru.student_vadim_migun.lesson_9.level_1.task_1;
/*
Что такое дефолтный конструктор класса?
Создайте класс и в нём объявите дефолтный конструктор.
Создайте класс Demo и продемонстрируйте вызов
дефолтного конструктора.
 */


import com.javaguru.teacher.codereview.CodeReview;

/*
Конструктор имеется в любом классе.
Даже если вы его не написали, компилятор Java сам создаст конструктор по умолчанию (default constructor).
Этот конструктор пустой и не делает ничего, кроме вызова конструктора суперкласса.
 */
@CodeReview(approved = true)
class Human {


    public Human() {  // дефолтный конструктор
    }

}


class HumanDemo {
    public static void main(String[] args) {
        Human hunan = new Human();
    }
}