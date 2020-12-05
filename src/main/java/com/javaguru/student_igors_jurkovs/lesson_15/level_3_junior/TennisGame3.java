package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class TennisGame3 implements TennisGame{

    private final Player player1;
    private final Player player2;

    public TennisGame3(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void wonPoint(Player player) {
        int points = player.getPoints() + 1;
        player.setPoints(points);
    }

    @Override
    public String score() {
        String score;
        if (playersGotEqualsScoreButLessThan3()) {
            score = Score.getScores(player1.getPoints()) + " - " + Score.getScores(player1.getPoints());
        } else if (playersGotEqualsScoreButGreaterThan2()) {
            score = "Deuce";
        } else if (player1.getPoints() >= 4 && player1LeadScoreMoreThan1()) {
            score = player1.getPlayerName() + " won";
        } else if (player2.getPoints() >= 4 && player2LeadScoreMoreThan1()) {
            score = player2.getPlayerName() + " won";
        } else if (player1Advantage()) {
            score = "Advantage " + player1.getPlayerName();
        } else if (player2Advantage()) {
            score = "Advantage " + player2.getPlayerName();
        } else {
            score = Score.getScores(player1.getPoints()) + " - " + Score.getScores(player2.getPoints());
        }

        return score;
    }

    private boolean playersGotEqualsScoreButLessThan3() {
        return player1.getPoints() == player2.getPoints() && player1.getPoints() < 3;
    }

    private boolean playersGotEqualsScoreButGreaterThan2() {
        return player1.getPoints() == player2.getPoints() && player1.getPoints() > 2;
    }

    private boolean player1LeadScoreMoreThan1() {
        return player1.getPoints() - player2.getPoints() > 1;
    }

    private boolean player2LeadScoreMoreThan1() {
        return player2.getPoints() - player1.getPoints() > 1;
    }

    private boolean player1Advantage() {
        return player1.getPoints() > player2.getPoints() && player2.getPoints() >= 3;
    }

    private boolean player2Advantage() {
        return player2.getPoints() > player1.getPoints() && player1.getPoints() >= 3;
    }

}
