package com.javaguru.student_igors_jurkovs.lesson_3.level_x;

import com.javaguru.teacher.codereview.CodeReviewComment;

class Game {
    public static final int MAX_ROLLS = 21;
    @CodeReviewComment(teacher = "java style: int[] array = new int[size];")
    int[] roll = new int [MAX_ROLLS];
    int currentRoll = 0;
    int score = 0;
    int rollNumber = 0;

    @CodeReviewComment(teacher = "лучше разделить на несколько строк. Запись с count++ в качестве индекса немного может сбивать с толку")
    @CodeReviewComment(teacher = "имеет смысл добавить доп проверки на некорректные данные")
    void roll(int pins) {
        roll[currentRoll] = pins;
        currentRoll++;
    }

    int score() {
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollNumber)) {
                score += 10 + strikeBonus(rollNumber);
                rollNumber ++;
            } else if (isSpare(rollNumber)) {
                score += 10 + spareBonus(rollNumber);
                rollNumber += 2;
            } else {
                score += pinsKnocked(rollNumber);
                rollNumber += 2;
            }
        }

        return score;
    }
    boolean isStrike (int rollNumber) {
        return roll[rollNumber] == 10;
    }
    int strikeBonus(int rollNumber) {
        return roll[rollNumber+1] + roll[rollNumber+2];
    }
    boolean isSpare (int rollNumber) {
        return roll[rollNumber] + roll[rollNumber+1] == 10;
    }
    int spareBonus(int rollNumber) {
        return roll[rollNumber+2];
    }
    int pinsKnocked(int rollNumber) {
        return roll[rollNumber] + roll[rollNumber+1];
    }

}

class GameTest {
    public static void main(String[] args) {

        Game game = new Game();
        game.score();
        game.roll(2);
        game.roll(2);
        System.out.println(game.score());
    }
}
