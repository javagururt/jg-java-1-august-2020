package com.javaguru.student_vladimir_petranovski.lesson_10.level_3.task_6;
/*
Что такое функциональный интерфейс в Java?

Найдите в интернете информацию об этом.
Придумайте и реализуйте его в виде программного кода.
В комментарии в коде напишите ответ на вопрос.
 */

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "main в этом классе лишнее")
class Dog implements Animals{
    //Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
    // Основное назначение – использование в лямбда выражениях и method reference.
    //Наличие 1 абстрактного метода - это единственное условие,
    // таким образом функциональный интерфейс может содержать так же default и static методы.
    //К функциональному интерфейсу можно добавить аннотацию @FunctionalInterface.
    // Это не обязательно, но при наличии данной аннотации код не скомпилируется,
    // если будет больше или меньше, чем 1 абстрактный метод.
    //Рекомендуется добавлять @FunctionalInterface.
    // Это позволит использовать интерфейс в лямбда выражениях, не остерегаясь того,
    // что кто-то добавит в интерфейс новый абстрактный метод и он перестанет быть функциональным.

    //Но оказывается есть один тонкий момент, описанный в Java Language Specification:
    // “interfaces do not inherit from Object, but rather implicitly declare many of the same methods as Object.”
    //Это означает, что функциональные интерфейсы могут содержать дополнительно абстрактные методы, определенные в классе Object
    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }

    public static void main(String[] args) {
        new Dog().voice();
    }
}
