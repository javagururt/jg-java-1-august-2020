package com.javaguru.student_vladimirs_filipovs.lesson_15.level_3;

class TennisGameImpl implements TennisGame {
    private Player firstPlayer;
    private Player secondPlayer;

    public TennisGameImpl(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    @Override
    public void wonPoint(Player player) {
        if (player.getPlayerScore().getCurrentScore().equals("Love")) {
            player.setPlayerScore(ScoreStatus.FIFTEEN);
        } else if (player.getPlayerScore().getCurrentScore().equals("Fifteen")) {
            player.setPlayerScore(ScoreStatus.THIRTY);
        } else if (player.getPlayerScore().getCurrentScore().equals("Thirty")) {
            player.setPlayerScore(ScoreStatus.FORTY);
//        } else if (player.getPlayerScore().getCurrentScore().equals("Forty")
//                && checkIsScoreStatusDeuce(player1, player2) == false){
//            player.setPlayerScore(ScoreStatus.WON);
//        } else if (player.getPlayerScore().getCurrentScore().equals("Forty")
//                && checkIsScoreStatusDeuce(player1, player2) == true) {
//            player.setPlayerScore(ScoreStatus.ADVANTAGE);
        }
    }


    private boolean checkIsScoreStatusDeuce(Player player1, Player player2) {
        return player1.getPlayerScore().getCurrentScore().equals("Forty")
                && player2.getPlayerScore().getCurrentScore().equals("Forty");
    }

    @Override
    public String score(Player player1, Player player2) {
        return player1.getPlayerScore().getCurrentScore() + " - "
                + player2.getPlayerScore().getCurrentScore();
    }
}

class GameDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Maria Sharapova", ScoreStatus.LOVE);
        Player player2 = new Player("Serena Williams", ScoreStatus.LOVE);
        TennisGame game = new TennisGameImpl(player1, player2);

        System.out.println(game.score(player1, player2));
        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
        game.wonPoint(player2);
        System.out.println(game.score(player1, player2));
        game.wonPoint(player1);
        System.out.println(game.score(player1, player2));
    }
}
