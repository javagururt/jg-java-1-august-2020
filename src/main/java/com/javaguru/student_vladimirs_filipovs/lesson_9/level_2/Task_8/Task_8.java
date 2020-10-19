package com.javaguru.student_vladimirs_filipovs.lesson_9.level_2.Task_8;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}