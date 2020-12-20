package com.javaguru.student_vladimirs_filipovs.lesson_15.level_4;

import com.javaguru.teacher.codereview.CodeReviewComment;

class TennisGame2 implements TennisGame {

    public int firstPlayerPoints = 0;
    public int secondPlayerPoints = 0;

    public String player1Score;
    public String player2Score;
    @CodeReviewComment(teacher = "если переменные не испольщуются, то и лучше удалять")
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String player) {
        if (player.equals("player1")) {
            increaseOnePointToFirstPlayer();
        } else {
            increaseOnePointToSecondPlayer();
        }
    }

    @Override
    public String score() {
        String score = "";
        if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints < 3) {
            return chooseGameNameOfSimilarPoints();
        }
        if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints >= 3)
            return "Deuce";

        if (firstPlayerPoints > 0 && secondPlayerPoints == 0) {
            return choseGameScoresWhenSecondPlayerScoreEquals0();
        }
        if (secondPlayerPoints > 0 && firstPlayerPoints == 0) {
            return choseGameScoresWhenFirstPlayerScoreEquals0();
        }

        if (firstPlayerPoints > secondPlayerPoints && firstPlayerPoints < 4) {
            if (firstPlayerPoints == 2)
                player1Score = "Thirty";
            if (firstPlayerPoints == 3)
                player1Score = "Forty";
            if (secondPlayerPoints == 1)
                player2Score = "Fifteen";
            if (secondPlayerPoints == 2)
                player2Score = "Thirty";
            score = player1Score + "-" + player2Score;
        }
        if (secondPlayerPoints > firstPlayerPoints && secondPlayerPoints < 4) {
            if (secondPlayerPoints == 2)
                player2Score = "Thirty";
            if (secondPlayerPoints == 3)
                player2Score = "Forty";
            if (firstPlayerPoints == 1)
                player1Score = "Fifteen";
            if (firstPlayerPoints == 2)
                player1Score = "Thirty";
            score = player1Score + "-" + player2Score;
        }

        if (firstPlayerPoints > secondPlayerPoints && secondPlayerPoints >= 3) {
            score = "Advantage player1";
        }

        if (secondPlayerPoints > firstPlayerPoints && firstPlayerPoints >= 3) {
            score = "Advantage player2";
        }

        if (firstPlayerPoints >= 4 && secondPlayerPoints >= 0
                && (firstPlayerPoints - secondPlayerPoints) >= 2) {
            score = "Win for player1";
        }
        if (secondPlayerPoints >= 4 && firstPlayerPoints >= 0
                && (secondPlayerPoints - firstPlayerPoints) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String chooseGameNameOfSimilarPoints() {
        if (firstPlayerPoints == 0) {
            return "Love-All";
        } else if (firstPlayerPoints == 1) {
            return "Fifteen-All";
        } else {
            return "Thirty-All";
        }
    }

    private String choseGameScoresWhenSecondPlayerScoreEquals0() {
        if (firstPlayerPoints == 1) {
            return "Fifteen-Love";
        } else if (firstPlayerPoints == 2) {
            return "Thirty-Love";
        } else if (firstPlayerPoints == 3) {
            return "Forty-Love";
        } else {
            return "Win for player1";
        }
    }

    private String choseGameScoresWhenFirstPlayerScoreEquals0() {
        if (secondPlayerPoints == 1) {
            return "Love-Fifteen";
        } else if (secondPlayerPoints == 2) {
            return  "Love-Thirty";
        } else if (secondPlayerPoints == 3) {
            return  "Love-Forty";
        } else {
            return "Win for player2";
        }
    }

    public void increaseOnePointToFirstPlayer() {
        firstPlayerPoints++;
    }

    public void increaseOnePointToSecondPlayer() {
        secondPlayerPoints++;
    }
}
