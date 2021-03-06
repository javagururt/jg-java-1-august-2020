package com.javaguru.student_vadim_migun.lesson_9.level_2.task_8;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.
Изменения можно вносить только в класс HumanPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {

    }

}
 */
@CodeReview(approved = true)
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
