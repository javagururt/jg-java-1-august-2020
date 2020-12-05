package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class Player {

    private final String playerName;
    private int points;

    public Player(String playerName) {
        this.playerName = playerName;
        points = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
