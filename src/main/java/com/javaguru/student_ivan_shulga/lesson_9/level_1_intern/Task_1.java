package com.javaguru.student_ivan_shulga.lesson_9.level_1_intern;

class Task_1 { // т.к. конструктор не объявлен, то будет использоваться default constructor

    int a = 10;

    public int getA() {
        return a;
    }
}

class Task_1_Demo {

    public static void main(String[] args) {

        Task_1 test = new Task_1(); // объявлен объект класса с использованием конструктора по умолчанию
        System.out.println(test.getA());

    }

}
/*
Что такое дефолтный конструктор класса?
Создайте класс и в нём объявите дефолтный конструктор.
Создайте класс Demo и продемонстрируйте вызов
дефолтного конструктора.
 */

/*
Конструктор – это схожая  c методом структура, назначение которой состоит в создании экземпляра класса.
Конструктор имеется в любом классе. Даже если вы его не написали, компилятор Java сам создаст конструктор по умолчанию (default constructor),
который будет пустым и не делает ничего, кроме вызова конструктора суперкласса.
Конструкторов может быть несколько в классе. В этом случае конструкторы называют перегруженными.
Если в классе не описан конструктор, компилятор автоматически добавляет в код конструктор без параметров.
 */