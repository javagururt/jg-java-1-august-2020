package com.javaguru.student_vladimirs_filipovs.lesson_9.level_2.Task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }
}
