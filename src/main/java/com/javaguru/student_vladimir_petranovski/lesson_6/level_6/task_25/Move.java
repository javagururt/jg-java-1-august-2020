package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_25;

import com.javaguru.teacher.codereview.CodeReview;

/*
Создайте класс Move с двумя свойствами:

    private int x;
    private int y;

и конструктором, который принимает два целых числа
- координаты клетки в которую хочет походить игрок
и get методами для этих свойств.

В классе TicTacToe создайте метод:

public Move getNextMove() {
    // запросите у пользователя с консоли две координаты
    // клетки куда хочет походить игрок
    // создайте экземпляр класса Move и передайте ему
    // в конструктор введённые пользователем координаты
    // верните созданный объект Move из метода.
}
 */
@CodeReview(approved = true)
class Move {
    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
