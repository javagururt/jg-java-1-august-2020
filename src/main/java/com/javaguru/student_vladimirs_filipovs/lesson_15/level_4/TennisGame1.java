package com.javaguru.student_vladimirs_filipovs.lesson_15.level_4;

import com.javaguru.teacher.codereview.CodeReviewComment;

class TennisGame1 implements TennisGame {

    private int firstPlayerPoints = 0;
    private int secondPlayerPoints = 0;
    @CodeReviewComment(teacher = "можно сделать как final")
    private String firstPlayerName;
    @CodeReviewComment(teacher = "Данная переменная не испольуется, зачем она?")
    private String secondPlayerName;

    public TennisGame1(String player1Name, String player2Name) {
        this.firstPlayerName = player1Name;
        this.secondPlayerName = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(firstPlayerName)) {
            firstPlayerPoints += 1;
        } else {
            secondPlayerPoints += 1;
        }
    }

    @Override
    public String score() {
        if (firstPlayerPoints == secondPlayerPoints) {
            return chooseGameNameOfSimilarPoints();
        } else if (firstPlayerPoints >= 4 || secondPlayerPoints >= 4) {
            return chooseGameNameAndAdvantagePlayer();
        } else {
            return choseGameScores();
        }
    }

    private String chooseGameNameOfSimilarPoints() {
        switch (firstPlayerPoints) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            default:
                return "Deuce";
        }
    }

    private String chooseGameNameAndAdvantagePlayer() {
        int differenceScore = firstPlayerPoints - secondPlayerPoints;
        if (differenceScore == 1) {
            return "Advantage player1";
        } else if (differenceScore == -1) {
            return "Advantage player2";
        } else if (differenceScore >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private String choseGameScores() {
        return convertRoundPointsToPlayerName(firstPlayerPoints) + "-"
                + convertRoundPointsToPlayerName(secondPlayerPoints);
    }

    private String convertRoundPointsToPlayerName(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }

}

