package com.javaguru.student_vladimirs_filipovs.lesson_9.level_2.Task_8;

import com.javaguru.teacher.codereview.CodeReview;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}
@CodeReview(approved = true)
class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}