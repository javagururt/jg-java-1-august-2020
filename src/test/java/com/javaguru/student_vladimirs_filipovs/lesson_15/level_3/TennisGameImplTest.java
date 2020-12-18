package com.javaguru.student_vladimirs_filipovs.lesson_15.level_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameImplTest {
    private TennisGameImpl victim;
    Player player1 = new Player("Maria Sharapova");
    Player player2 = new Player("Serena Williams");

    Player testPlayer1 = new Player("Maria Sharapova");
    Player testPlayer2 = new Player("Serena Williams");

    @Before
    public void setUp() {
        victim = new TennisGameImpl(player1, player2);
    }

    @Test
    public void LoveFifteen() {
        victim.wonPoint(player2);
        testPlayer2.setPlayerScore(ScoreStatus.FIFTEEN);
        String expected = testPlayer1.getPlayerScore().getCurrentScore() + " - "
                + testPlayer2.getPlayerScore().getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void fifteenFifteen() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        testPlayer1.setPlayerScore(ScoreStatus.FIFTEEN);
        testPlayer2.setPlayerScore(ScoreStatus.FIFTEEN);
        String expected = testPlayer1.getPlayerScore().getCurrentScore() + " - "
                + testPlayer2.getPlayerScore().getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void fifteenThirty() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        testPlayer1.setPlayerScore(ScoreStatus.FIFTEEN);
        testPlayer2.setPlayerScore(ScoreStatus.THIRTY);
        String expected = testPlayer1.getPlayerScore().getCurrentScore() + " - "
                + testPlayer2.getPlayerScore().getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void thirtyThirty() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        testPlayer1.setPlayerScore(ScoreStatus.THIRTY);
        testPlayer2.setPlayerScore(ScoreStatus.THIRTY);
        String expected = testPlayer1.getPlayerScore().getCurrentScore() + " - "
                + testPlayer2.getPlayerScore().getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void fortyThirty() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player1);
        testPlayer1.setPlayerScore(ScoreStatus.FORTY);
        testPlayer2.setPlayerScore(ScoreStatus.THIRTY);
        String expected = testPlayer1.getPlayerScore().getCurrentScore() + " - "
                + testPlayer2.getPlayerScore().getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void deuce() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        String expected = ScoreStatus.DEUCE.getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void deuceAfterAdvantage() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        String expected = ScoreStatus.DEUCE.getCurrentScore();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void secondPlayerImmediatelyWin() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        testPlayer2.setPlayerScore(ScoreStatus.WIN);
        String expected = testPlayer2.getPlayerScore().getCurrentScore() + " " + player2.getPlayerName();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void secondPlayerAdvantage() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        testPlayer2.setPlayerScore(ScoreStatus.ADVANTAGE);
        String expected = testPlayer2.getPlayerScore().getCurrentScore() + " " + player2.getPlayerName();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }

    @Test
    public void secondPlayerWinAfterAdvantage() {
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player1);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        victim.wonPoint(player2);
        testPlayer2.setPlayerScore(ScoreStatus.WIN);
        String expected = testPlayer2.getPlayerScore().getCurrentScore() + " " + player2.getPlayerName();
        String actual = victim.score(player1, player2);
        assertEquals(expected, actual);
    }
}