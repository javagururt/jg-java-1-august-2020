package com.javaguru.student_igors_jurkovs.lesson_6.level_5_middle;

class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();
    int[][] field = new int[][]{{0, -1, 0}, {1, 1, 1}, {0, -1, 0}};
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTestForCross();
        ticTacToeTest.isWinPositionForHorizontalsTestForZero();
        ticTacToeTest.isWinPositionForVerticalsTestForCross();
        ticTacToeTest.isWinPositionForVerticalsTestForZero();
        ticTacToeTest.isWinPositionForDiagonalsTestForCross();
        ticTacToeTest.isWinPositionForDiagonalsTestForZero();
        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.isWinTest();


    }
    void isWinPositionForHorizontalsTestForCross() {
        ticTacToe.test(ticTacToe.isWinPositionForHorizontals(field, 1), "Horizontal win position check for cross");
    }

    void isWinPositionForHorizontalsTestForZero() {
        ticTacToe.test(!(ticTacToe.isWinPositionForHorizontals(field, 0)), "Horizontal win position check for zero");
    }

    void isWinPositionForVerticalsTestForCross() {
        ticTacToe.test(!(ticTacToe.isWinPositionForVerticals(field, 1)),"Vertical win position check for cross");
    }
    void isWinPositionForVerticalsTestForZero() {
        ticTacToe.test(!(ticTacToe.isWinPositionForVerticals(field, 0)),"Vertical win position check for zero");
    }
    void isWinPositionForDiagonalsTestForCross() {
        ticTacToe.test(!(ticTacToe.isWinPositionForDiagonals(field, 1)), "Diagonal win position check for cross");
    }
    void isWinPositionForDiagonalsTestForZero() {
        ticTacToe.test(!(ticTacToe.isWinPositionForDiagonals(field, 0)), "Diagonal win position check for zero");
    }
    void isDrawPositionTest() {
        ticTacToe.test(!(ticTacToe.isDrawPosition(field)), "Draw position check");
    }
    void isWinTest() {
        ticTacToe.test(ticTacToe.isWin(), "Win test");
    }
}
