package com.javaguru.student_ivan_shulga.lesson_3.level_1;

// пока что для себя буду порой писать много комментариев, чтобы самому разобраться что к чему, т.к.
// после "Hello world!" для меня начинается тёмный лес в Java

class RobotDemo {   // Создаём отдельный класс RobotDemo для демонстрации работы с классом Robot

    public static void main(String[] args) {

        Robot newRobot = new Robot();  // Создаём экземпляр класса Robot вызвав конструктор класса (Task_3)

        newRobot.sayHello();
        /*
        (Task_4)
        В методе main(...) класса RobotDemo вызываем
        метод sayHello() у созданного ранее виртуального обьекта.
        Запускаем программу и убеждаемся, что созданный
        виртуальный обьект робот напечатал на консоли слово "Hello!".
         */

        newRobot.sayYourName();
        /*
        (Task_5)
        В методе main(...) класса RobotDemo вызываем
        метод sayYourName() у созданного ранее виртуального обьекта.
        Запускаем программу и убеждаемся, что созданный
        виртуальный обьект робот напечатал на консоли "My name is ROBO".
         */

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot robotX = new Robot();
        robotX.sayHello();
        robotX.sayYourName();

        /*
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        (Task_6)
        В методе main(...) класса RobotDemo создаём
        нескольких виртуальный обьектов робот и работаем с ними
        (вызоваем у них методы sayHello() и sayYourName()).
         */

    }

}
