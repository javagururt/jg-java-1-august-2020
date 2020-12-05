package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
@Category(TennisGameImpl.class)

public class TennisGameImplTest {

    private final Player player1 = new Player("player1");
    private final Player player2 = new Player("player2");
    private final TennisGame victim = new TennisGameImpl(player1, player2);
    private final TennisGame2 victim2 = new TennisGame2(player1, player2);
    private final TennisGame3 victim3 = new TennisGame3(player1, player2);
    private final TennisGame4 victim4 = new TennisGame4(player1, player2);

    @Test
    @Parameters({
            "0, 0, Love - Love",
            "1, 1, Fifteen - Fifteen",
            "2, 2, Thirty - Thirty",
            "3, 3, Deuce",
            "4, 4, Deuce",

            "1, 0, Fifteen - Love",
            "0, 1, Love - Fifteen",
            "2, 0, Thirty - Love",
            "0, 2, Love - Thirty",
            "3, 0, Forty - Love",
            "0, 3, Love - Forty",
            "4, 0, Player1 won",
            "0, 4, Player2 won",

            "2, 1, Thirty - Fifteen",
            "1, 2, Fifteen - Thirty",
            "3, 1, Forty - Fifteen",
            "1, 3, Fifteen - Forty",
            "4, 1, Player1 won",
            "1, 4, Player2 won",

            "3, 2, Forty - Thirty",
            "2, 3, Thirty - Forty",
            "4, 2, Player1 won",
            "2, 4, Player2 won",

            "4, 3, Advantage player1",
            "3, 4, Advantage player2",
            "5, 4, Advantage player1",
            "4, 5, Advantage player2",
            "15, 14, Advantage player1",
            "14, 15, Advantage player2",

            "6, 4, Player1 won",
            "4, 6, Player2 won",
            "16, 14, Player1 won",
            "14, 16, Player2 won",
    })
    public void score(int player1score, int player2score, String expected) {
        player1.setPoints(player1score);
        player2.setPoints(player2score);
        String result = victim.score();
        assertThat(result).isEqualToIgnoringCase(expected);
    }

    @Test
    @Parameters({
            "0, 0, Love - Love",
            "1, 1, Fifteen - Fifteen",
            "2, 2, Thirty - Thirty",
            "3, 3, Deuce",
            "4, 4, Deuce",

            "1, 0, Fifteen - Love",
            "0, 1, Love - Fifteen",
            "2, 0, Thirty - Love",
            "0, 2, Love - Thirty",
            "3, 0, Forty - Love",
            "0, 3, Love - Forty",
            "4, 0, Player1 won",
            "0, 4, Player2 won",

            "2, 1, Thirty - Fifteen",
            "1, 2, Fifteen - Thirty",
            "3, 1, Forty - Fifteen",
            "1, 3, Fifteen - Forty",
            "4, 1, Player1 won",
            "1, 4, Player2 won",

            "3, 2, Forty - Thirty",
            "2, 3, Thirty - Forty",
            "4, 2, Player1 won",
            "2, 4, Player2 won",

            "4, 3, Advantage player1",
            "3, 4, Advantage player2",
            "5, 4, Advantage player1",
            "4, 5, Advantage player2",
            "15, 14, Advantage player1",
            "14, 15, Advantage player2",

            "6, 4, Player1 won",
            "4, 6, Player2 won",
            "16, 14, Player1 won",
            "14, 16, Player2 won",
    })
    public void score2(int player1score, int player2score, String expected) {
        player1.setPoints(player1score);
        player2.setPoints(player2score);
        String result = victim2.score();
        assertThat(result).isEqualToIgnoringCase(expected);
    }

    @Test
    @Parameters({
            "0, 0, Love - Love",
            "1, 1, Fifteen - Fifteen",
            "2, 2, Thirty - Thirty",
            "3, 3, Deuce",
            "4, 4, Deuce",

            "1, 0, Fifteen - Love",
            "0, 1, Love - Fifteen",
            "2, 0, Thirty - Love",
            "0, 2, Love - Thirty",
            "3, 0, Forty - Love",
            "0, 3, Love - Forty",
            "4, 0, Player1 won",
            "0, 4, Player2 won",

            "2, 1, Thirty - Fifteen",
            "1, 2, Fifteen - Thirty",
            "3, 1, Forty - Fifteen",
            "1, 3, Fifteen - Forty",
            "4, 1, Player1 won",
            "1, 4, Player2 won",

            "3, 2, Forty - Thirty",
            "2, 3, Thirty - Forty",
            "4, 2, Player1 won",
            "2, 4, Player2 won",

            "4, 3, Advantage player1",
            "3, 4, Advantage player2",
            "5, 4, Advantage player1",
            "4, 5, Advantage player2",
            "15, 14, Advantage player1",
            "14, 15, Advantage player2",

            "6, 4, Player1 won",
            "4, 6, Player2 won",
            "16, 14, Player1 won",
            "14, 16, Player2 won",
    })
    public void score3(int player1score, int player2score, String expected) {
        player1.setPoints(player1score);
        player2.setPoints(player2score);
        String result = victim3.score();
        assertThat(result).isEqualToIgnoringCase(expected);
    }

    @Test
    @Parameters({
            "0, 0, Love - Love",
            "1, 1, Fifteen - Fifteen",
            "2, 2, Thirty - Thirty",
            "3, 3, Deuce",
            "4, 4, Deuce",

            "1, 0, Fifteen - Love",
            "0, 1, Love - Fifteen",
            "2, 0, Thirty - Love",
            "0, 2, Love - Thirty",
            "3, 0, Forty - Love",
            "0, 3, Love - Forty",
            "4, 0, Player1 won",
            "0, 4, Player2 won",

            "2, 1, Thirty - Fifteen",
            "1, 2, Fifteen - Thirty",
            "3, 1, Forty - Fifteen",
            "1, 3, Fifteen - Forty",
            "4, 1, Player1 won",
            "1, 4, Player2 won",

            "3, 2, Forty - Thirty",
            "2, 3, Thirty - Forty",
            "4, 2, Player1 won",
            "2, 4, Player2 won",

            "4, 3, Advantage player1",
            "3, 4, Advantage player2",
            "5, 4, Advantage player1",
            "4, 5, Advantage player2",
            "15, 14, Advantage player1",
            "14, 15, Advantage player2",

            "6, 4, Player1 won",
            "4, 6, Player2 won",
            "16, 14, Player1 won",
            "14, 16, Player2 won",
    })
    public void score4(int player1score, int player2score, String expected) {
        player1.setPoints(player1score);
        player2.setPoints(player2score);
        String result = victim4.score();
        assertThat(result).isEqualToIgnoringCase(expected);
    }
}