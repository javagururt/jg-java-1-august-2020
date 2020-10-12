package com.javaguru.student_igors_jurkovs.lesson_9.level_1_intern;

/*
Дефолтный констрктор - это конструктор по умолчанию, без каких либо параметров. Если не создавать конструктор
то он будет по умолчанию пустой, как тот, что приведен в ниже указаном примере. При использовании дефолтного
конструктора, для создания экземпляра класса не надо вводить никаких параметров.
 */

class DefaultConstructorExample {

    DefaultConstructorExample() {
    }

    void printInfo() {
        System.out.println("I'm a class with a default constructor");
    }
}
