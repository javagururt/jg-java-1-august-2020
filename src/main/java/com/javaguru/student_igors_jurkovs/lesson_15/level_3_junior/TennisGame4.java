package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class TennisGame4 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame4(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public String score() {
        String score;
        String[] scoreStringArray = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (player1.getPoints() < 4 && player2.getPoints() < 4 && player1.getPoints() + player2.getPoints() != 6) {
            score = scoreStringArray[player1.getPoints()];
            return (player1.getPoints() == player2.getPoints())
                    ? score + " - " + score : score + " - " + scoreStringArray[player2.getPoints()];
        } else {
            if (player1.getPoints() == player2.getPoints())
                return "Deuce";
            score = player1.getPoints() > player2.getPoints() ? player1.getPlayerName() : player2.getPlayerName();
            return ((player1.getPoints() - player2.getPoints()) * (player1.getPoints() - player2.getPoints()) == 1)
                    ? "Advantage " + score : score + " won";
        }
    }

    @Override
    public void wonPoint(Player player) {
        int points = player.getPoints() + 1;
        player.setPoints(points);
    }
}
