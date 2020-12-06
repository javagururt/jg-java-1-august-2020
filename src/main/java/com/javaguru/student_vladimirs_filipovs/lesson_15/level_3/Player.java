package com.javaguru.student_vladimirs_filipovs.lesson_15.level_3;

class Player {
    private String playerName;
    private ScoreStatus playerScore = ScoreStatus.LOVE;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ScoreStatus getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(ScoreStatus playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", score=" + playerScore +
                '}';
    }
}
