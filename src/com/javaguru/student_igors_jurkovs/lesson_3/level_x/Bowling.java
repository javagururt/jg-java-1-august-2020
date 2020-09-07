package com.javaguru.student_igors_jurkovs.lesson_3.level_x;

class Game {
    int roll[];
    int currentRoll = 0;

    void roll(int pins) {
        roll[currentRoll++] = pins;
    }

    int score() {
        int score = 0;
        int rollNumber = 0;

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
        game.roll(10);
        game.roll(6);
        game.roll(1);
        System.out.println(game.score());
    }
}
