package com.javaguru.student_ivan_shulga.lesson_10.level_2_intern.Task_4_and_Task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер дня недели от 1 до 7!");
        int dayNumber = scanner.nextInt();
        String dayName = dayOfTheWeekDetector.detectDayName(dayNumber);
        System.out.println("This is : " + dayName);
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();

        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(ifVersion);
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(switchVersion);
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(arrayVersion);

        demo1.run();
        demo2.run();
        demo3.run();

    }

}

/*
Создайте класс DayOfTheWeekDetectorDemo.

Цель этой программы:
- запросить у пользователя число;
- с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
- вывести на консоль найденное название.

В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
имплементация интерфейса, которую программа должна использовать для нахождения названия
дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
чтобы использовать её в дальнейшем.

В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.

Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
из трёх имплементаций интерфейса.

Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.

Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.
 */