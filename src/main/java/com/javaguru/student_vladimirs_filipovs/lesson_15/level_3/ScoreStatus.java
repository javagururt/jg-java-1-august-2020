package com.javaguru.student_vladimirs_filipovs.lesson_15.level_3;

enum ScoreStatus {
    LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"),
    FORTY("Forty"), DEUCE("Deuce"), ADVANTAGE("Advantage"),
    WIN("WIN");

    ScoreStatus(String currentScore) {
        this.currentScore = currentScore;
    }

    String currentScore;

    public String getCurrentScore() {
        return currentScore;
    }
}
