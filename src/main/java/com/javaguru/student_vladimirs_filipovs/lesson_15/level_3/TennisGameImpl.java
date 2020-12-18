package com.javaguru.student_vladimirs_filipovs.lesson_15.level_3;

class TennisGameImpl implements TennisGame {
    private final Player firstPlayer;
    private final Player secondPlayer;

    public TennisGameImpl(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    @Override
    public void wonPoint(Player player) {
        player.setPoints(player.getPoints() + 1);
        changePlayerScoreStatus(player);
    }

    private void changePlayerScoreStatus(Player player) {
        if (player.getPoints() == 1) {
            changeScoreToFIFTEEN(player);
        } else if (player.getPoints() == 2) {
            changeScoreToTHIRTY(player);
        } else if (chekSimilarScore() && chekPointsMoreThen2()) {
            changeScoreToDEUCE();
        } else if (player.getPoints() == 3) {
            changeScoreToFORTY(player);
        } else if (player.getPoints() > 3
                && chekOutrunTwoPoints()) {
            changeScoreToWIN(player);
        } else if (checkOutrunOnePoint()) {
            changeScoreToADVANTAGE(player);
        }
    }

    private void changeScoreToFIFTEEN(Player player) {
        player.setPlayerScore(ScoreStatus.FIFTEEN);
    }

    private void changeScoreToTHIRTY(Player player) {
        player.setPlayerScore(ScoreStatus.THIRTY);
    }

    private void changeScoreToFORTY(Player player) {
        player.setPlayerScore(ScoreStatus.FORTY);
    }

    private void changeScoreToDEUCE() {
        firstPlayer.setPlayerScore(ScoreStatus.DEUCE);
        secondPlayer.setPlayerScore(ScoreStatus.DEUCE);
    }

    private void changeScoreToADVANTAGE(Player player) {
        player.setPlayerScore(ScoreStatus.ADVANTAGE);
    }

    private void changeScoreToWIN(Player player) {
        player.setPlayerScore(ScoreStatus.WIN);
    }

    private boolean chekSimilarScore() {
        return firstPlayer.getPoints() - secondPlayer.getPoints() == 0;
    }

    private boolean chekPointsMoreThen2() {
        return firstPlayer.getPoints() > 2 || secondPlayer.getPoints() > 2;
    }

    private boolean checkBothScoreIsDEUCE() {
        return firstPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.DEUCE.getCurrentScore())
                && secondPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.DEUCE.getCurrentScore());
    }

    private String witchPlayerForward() {
        if (firstPlayer.getPoints() > secondPlayer.getPoints()) {
            return firstPlayer.getPlayerScore().getCurrentScore() + " "
                    + firstPlayer.getPlayerName();
        } else {
            return secondPlayer.getPlayerScore().getCurrentScore() + " "
                    + secondPlayer.getPlayerName();
        }
    }

    private boolean checkOneOfPlayersIsAdvantage() {
        return firstPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.ADVANTAGE.getCurrentScore())
                || secondPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.ADVANTAGE.getCurrentScore());
    }

    private boolean checkOneOfPlayersIsWIN() {
        return firstPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.WIN.getCurrentScore())
                || secondPlayer.getPlayerScore().getCurrentScore().equals(ScoreStatus.WIN.getCurrentScore());
    }

    private boolean chekOutrunTwoPoints() {
        return firstPlayer.getPoints() - secondPlayer.getPoints() == 2
                || secondPlayer.getPoints() - firstPlayer.getPoints() == 2;
    }

    private boolean checkOutrunOnePoint() {
        return firstPlayer.getPoints() - secondPlayer.getPoints() == 1
                || secondPlayer.getPoints() - firstPlayer.getPoints() == 1;
    }


    @Override
    public String score(Player player1, Player player2) {
        if (checkOneOfPlayersIsWIN()) {
            return witchPlayerForward();
        } else if (checkOneOfPlayersIsAdvantage()) {
            return witchPlayerForward();
        } else if (checkBothScoreIsDEUCE()) {
            return ScoreStatus.DEUCE.getCurrentScore();
        } else {
            return player1.getPlayerScore().getCurrentScore() + " - "
                    + player2.getPlayerScore().getCurrentScore();
        }
    }
}

class GameDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Maria Sharapova");
        Player player2 = new Player("Serena Williams");
        TennisGame game = new TennisGameImpl(player1, player2);

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        System.out.println(player1.getPoints() + " - " + player2.getPoints());
        System.out.println("-----------------");

    }

}
