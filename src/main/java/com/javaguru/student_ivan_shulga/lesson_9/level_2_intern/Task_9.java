package com.javaguru.student_ivan_shulga.lesson_9.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Player9 {

    private String name;

    Player9(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player9 {

    ComputerPlayer(String name) {
        super(name);
    }
}

/*
Внесите изменения в код программы так,
чтобы можно было создать экземпляр класса
ComputerPlayer. Класс ComputerPlayer должен
наследоваться от класса Player. Изменения
в код можно вносить только в класс ComputerPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer {

}
 */