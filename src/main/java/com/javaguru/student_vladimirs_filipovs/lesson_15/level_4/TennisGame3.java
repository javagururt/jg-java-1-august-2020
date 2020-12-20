package com.javaguru.student_vladimirs_filipovs.lesson_15.level_4;

import com.javaguru.teacher.codereview.CodeReviewComment;

class TennisGame3 implements TennisGame {

    private int firstPlayerPoints;
    private int SecondPlayerPoints;
    private String firstPlayerName;
    private String secondPlayerName;

    public TennisGame3(String player1Name, String player2Name) {
        this.firstPlayerName = player1Name;
        this.secondPlayerName = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.SecondPlayerPoints += 1;
        else
            this.firstPlayerPoints += 1;

    }

    @Override
    @CodeReviewComment(teacher = "очень сложное условие. Его нужно упростить. Так же можно использовать !=")
    public String score() {
        String score;
        if (SecondPlayerPoints < 4 && firstPlayerPoints < 4
                && !(SecondPlayerPoints + firstPlayerPoints == 6)) {
            String[] scoresArray = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = scoresArray[SecondPlayerPoints];
            return (SecondPlayerPoints == firstPlayerPoints)
                    ? score + "-All" : score + "-" + scoresArray[firstPlayerPoints];
        } else {
            if (SecondPlayerPoints == firstPlayerPoints) {
                return "Deuce";
            }
            score = SecondPlayerPoints > firstPlayerPoints ? firstPlayerName : secondPlayerName;
            return ((SecondPlayerPoints - firstPlayerPoints)
                    * (SecondPlayerPoints - firstPlayerPoints) == 1)
                    ? "Advantage " + score : "Win for " + score;
        }
    }
}
