package com.javaguru.student_igors_jurkovs.lesson_6.level_5_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    TicTacToe victim = new TicTacToe();

    @Test
    public void isWinPositionForHorizontalsCross() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.isWinPositionForHorizontals(field, 1);
        assertTrue(result);
    }

    @Test
    public void isWinPositionForHorizontalsZero() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.isWinPositionForHorizontals(field, 0);
        assertFalse(result);
    }

    @Test
    public void isWinPositionForVerticalsCross() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.isWinPositionForVerticals(field, 1);
        assertFalse(result);
    }

    @Test
    public void fieldsCheckForWin() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.fieldsCheckForWin(field, 1, "Horizontal");
        assertTrue(result);
    }

    @Test
    public void isWinPositionForDiagonals() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.isWinPositionForDiagonals(field, 1);
        assertFalse(result);
    }

    @Test
    public void isDrawPosition() {
        int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
        boolean result = victim.isDrawPosition(field);
        assertFalse(result);
    }
}