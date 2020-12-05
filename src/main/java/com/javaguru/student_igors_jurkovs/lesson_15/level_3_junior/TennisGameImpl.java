package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class TennisGameImpl implements TennisGame {

    private final Player player1;
    private final Player player2;

    public TennisGameImpl(Player player1, Player player2) {
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
        if (deuce()) {
            return "Deuce";
        } else if (playersGotMoreThan3Points() && isAdvantage()) {
            return playerGotAdvantage();
        } else if (oneOfPlayerGot4Points() && scoreDifference() >= 2) {
            return won();
        } else {
            return Score.getScores(player1.getPoints()) + " - " + Score.getScores(player2.getPoints());
        }
    }

    private boolean deuce() {
        return playersGotMoreThan3Points() && player1.getPoints() == player2.getPoints();
    }

    private String playerGotAdvantage() {
        if (player1.getPoints() > player2.getPoints()) {
            return "Advantage " + player1.getPlayerName();
        } else {
            return "Advantage " + player2.getPlayerName();
        }
    }

    private boolean playersGotMoreThan3Points() {
        return player1.getPoints() >= 3
                && player2.getPoints() >= 3;
    }

    private boolean isAdvantage() {
        return scoreDifference() == 1;
    }

    private String won() {
        if (player1.getPoints() > player2.getPoints()) {
            return player1.getPlayerName() + " won";
        } else {
            return player2.getPlayerName() + " won";
        }
    }

    private boolean oneOfPlayerGot4Points() {
        return player1.getPoints() >= 4 || player2.getPoints() >= 4;
    }

    private int scoreDifference() {
        return Math.abs(player1.getPoints() - player2.getPoints());
    }
}
