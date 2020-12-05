package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

public class TennisGameTest {

    public static void main(String[] args) {

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGameImpl game = new TennisGameImpl(player1, player2);

        game.score();
        game.wonPoint(player1);
        game.score();
        game.wonPoint(player1);
        game.score();
        game.wonPoint(player1);
        game.score();
        game.wonPoint(player2);
        game.score();
        game.wonPoint(player2);
        game.score();
        game.wonPoint(player2);
        game.score();
        game.wonPoint(player2);
        game.score();
        game.wonPoint(player2);
        game.score();
    }
}
