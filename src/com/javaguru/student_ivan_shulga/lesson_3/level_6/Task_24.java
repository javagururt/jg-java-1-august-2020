package com.javaguru.student_ivan_shulga.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Employee {

    String name;
    int age;
    double salary;
    // ^^^ объявление переменных

    @CodeReviewComment(teacher = "можно назвать сеттерами")
    public void employeeName(String employeeName) { name = employeeName; }
    // ^^^ Присвоение имени работника переменной name

    public void employeeAge(int employeeAge) { age = employeeAge; }
    // ^^^ Присвоение возраста работника переменной age

    public void employeeSalary(double employeeSalary) { salary = employeeSalary; }
    // ^^^ Присвоение величины зп переменной salary

    public void printEmployee () {
        System.out.println("Имя работника: " + name);
        System.out.println("Возраст работника: " + age);
        System.out.println("Размер заработной платы работника: " + salary);
        // ^^^ Вывод информации

}

}

class DemoEmployee {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        // ^^^ Создание нового объекта с помощью конструктора

        firstEmployee.employeeName("Pjotr");
        firstEmployee.employeeAge(33);
        firstEmployee.employeeSalary(1000.00);
        firstEmployee.printEmployee();
        // вызов ранее созданных метов для созданного объекта

    }

}

// тестирование второго варианта, где сразу в конструкторе все три переменные указаны, без методов
 /*
class Employee {

    String name;
    int age;
    double salary;
    // ^^^ объявление переменных

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // ^^^ объявление конструктора класса Employee

    public void printEmployee () {
        System.out.println("Имя работника: " + name);
        System.out.println("Возраст работника: " + age);
        System.out.println("Размер заработной платы работника: " + salary);
        // ^^^ Вывод информации

    }

}

class DemoEmployee {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Oleg", 35, 1500);
        // ^^^ Создание нового объекта с помощью конструктора

        firstEmployee.printEmployee();
        // вызов ранее созданного метода вывода на экран для созданного объекта

    }

}
 */
