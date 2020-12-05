package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class TennisGame2 implements TennisGame {

    private final Player player1;
    private final Player player2;

    public TennisGame2(Player player1, Player player2) {
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
        if (player1.getPoints() == player2.getPoints()) {
            score = playersGotEqualScore();
        } else if (player1.getPoints() >= 4 || player2.getPoints() >= 4) {
            score = playersGotMoreThan4Points();
        } else {
            score = playersScore();
        }

        return score;
    }

    private String playersGotEqualScore() {
        if (player1.getPoints() < 3) {
            return Score.getScores(player1.getPoints()) + " - " + Score.getScores(player1.getPoints());
        } else {
            return "Deuce";
        }
    }

    private String playersGotMoreThan4Points() {
        int scoreDifference = player1.getPoints() - player2.getPoints();
        if (scoreDifference == 1) {
            return "Advantage " + player1.getPlayerName();
        } else if (scoreDifference == -1) {
            return "Advantage " + player2.getPlayerName();
        } else if (scoreDifference >= 2) {
            return player1.getPlayerName() + " won";
        } else {
            return player2.getPlayerName() + " won";
        }
    }

    private String playersScore() {
        return Score.getScores(player1.getPoints()) + " - " + Score.getScores(player2.getPoints());
    }
}
