package com.javaguru.student_igors_jurkovs.lesson_6.level_6_middle;


class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();
    private int[][] field = ticTacToe.createField();

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isFieldCreated();


    }
    void isFieldCreated() {
        ticTacToe.test(ticTacToe.isFieldCreated(field), "Field creation");
    }
}
