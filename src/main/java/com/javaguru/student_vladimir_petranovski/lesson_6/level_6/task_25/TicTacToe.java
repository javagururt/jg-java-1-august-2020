package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_25;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class TicTacToe {
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }
}
