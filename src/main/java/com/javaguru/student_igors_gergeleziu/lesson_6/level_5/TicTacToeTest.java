package com.javaguru.student_igors_gergeleziu.lesson_6.level_5;

class TicTacToeTest {
    public final TicTacToe ticTacToe = new TicTacToe();
    public final int[][] ticTacToeArray = ticTacToe.createTwoDimensionalArray();

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.winPositionForHorizontalTest_1();
        ticTacToeTest.winPositionForHorizontalTest_2();
        ticTacToeTest.winPositionForHorizontalTest_3();
        ticTacToeTest.winPositionForVerticalTest_1();
        ticTacToeTest.winPositionForVerticalTest_2();
        ticTacToeTest.winPositionForVerticalTest_3();
        ticTacToeTest.winPositionForDiagonalTest_1();
        ticTacToeTest.winPositionForDiagonalTest_2();
        ticTacToeTest.firstPlayerWinPositionTest();
        ticTacToeTest.secondPlayerWinPositionTest();
        ticTacToeTest.drawPositionTest();
        ticTacToeTest.createFieldTest();

    }

    public void winPositionForHorizontalTest_1() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        boolean result = ticTacToe.isWinPositionForHorizontals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForHorizontalTest_1");
    }

    public void winPositionForHorizontalTest_2() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 2);
        boolean result = ticTacToe.isWinPositionForHorizontals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForHorizontalTest_2");
    }

    public void winPositionForHorizontalTest_3() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 2);
        boolean result = ticTacToe.isWinPositionForHorizontals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForHorizontalTest_3");
    }

    public void winPositionForVerticalTest_1() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 0);
        boolean result = ticTacToe.isWinPositionForVerticals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForVerticalTest_1");
    }

    public void winPositionForVerticalTest_2() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 1);
        boolean result = ticTacToe.isWinPositionForVerticals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForVerticalTest_2");
    }

    public void winPositionForVerticalTest_3() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 2);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 2);
        boolean result = ticTacToe.isWinPositionForVerticals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForVerticalTest_3");
    }

    public void winPositionForDiagonalTest_1() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 2);
        boolean result = ticTacToe.isWinPositionForDiagonals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForDiagonalTest_1");
    }

    public void winPositionForDiagonalTest_2() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 0);
        boolean result = ticTacToe.isWinPositionForDiagonals(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "winPositionForDiagonalTest_2");
    }

    public void firstPlayerWinPositionTest() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.secondPlayerMove(ticTacToeArray, 0, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        ticTacToe.secondPlayerMove(ticTacToeArray, 2, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 0);
        ticTacToe.secondPlayerMove(ticTacToeArray, 2, 2);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 2);
        boolean result = ticTacToe.isWinPosition(ticTacToeArray, 0);
        ticTacToe.checkResult(result, "firstPlayerWinPositionTest");
    }

    public void secondPlayerWinPositionTest() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 0);
        ticTacToe.secondPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 0);
        ticTacToe.secondPlayerMove(ticTacToeArray, 2, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        ticTacToe.secondPlayerMove(ticTacToeArray, 0, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 2);
        ticTacToe.secondPlayerMove(ticTacToeArray, 2, 1);
        boolean result = ticTacToe.isWinPosition(ticTacToeArray, 1);
        ticTacToe.checkResult(result, "secondPlayerWinPositionTest");
    }

    public void drawPositionTest() {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToe.fillTwoDimensionalArray(ticTacToeArray);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 1);
        ticTacToe.secondPlayerMove(ticTacToeArray, 0, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 0, 2);
        ticTacToe.secondPlayerMove(ticTacToeArray, 2, 0);
        ticTacToe.firstPlayerMove(ticTacToeArray, 1, 0);
        ticTacToe.secondPlayerMove(ticTacToeArray, 1, 2);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 1);
        ticTacToe.secondPlayerMove(ticTacToeArray, 0, 1);
        ticTacToe.firstPlayerMove(ticTacToeArray, 2, 2);
        boolean result = ticTacToe.isDrawPosition(ticTacToeArray);
        boolean firstPlayerDraw = ticTacToe.isWinPosition(ticTacToeArray, 0);
        boolean secondPlayerDraw = ticTacToe.isWinPosition(ticTacToeArray, 1);
        ticTacToe.checkResult(result, "drawPositionTest");
        ticTacToe.checkResult(!firstPlayerDraw, "firstPlayerDrawTest");
        ticTacToe.checkResult(!secondPlayerDraw, "secondPlayerDrawTest");
    }
    public void createFieldTest(){
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        int[][]fieldTest=ticTacToe.createField();
        boolean result=ticTacToe.isDrawPosition(fieldTest);
        ticTacToe.checkResult(!result, "createFieldTest");
    }

}
