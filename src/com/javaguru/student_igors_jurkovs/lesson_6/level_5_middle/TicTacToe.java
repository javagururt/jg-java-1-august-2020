package com.javaguru.student_igors_jurkovs.lesson_6.level_5_middle;

import java.util.Arrays;

class TicTacToe {

    private final int[][] field = new int[3][3];
    /*
    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        }else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        }else return field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck;
    }*/

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int[] ints : field) {
            int counter = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (ints[j] == playerToCheck) {
                    counter++;
                }
            }
            if (counter == 3) {
                win =  true;
                break;
            }
        }
        return win;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean win = false;
        for (int j = 0; j < field[0].length; j++) {
            int counter = 0;
            for (int[] ints : field) {
                if (ints[j] == playerToCheck) {
                    counter++;
                }
            }
            if (counter == 3) {
                win =  true;
                break;
            }
        }
        return win;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int[] diagonalArray = new int[3];
        int[] sidDiagonalArray = new int[3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++){
                if (i == j) {
                    diagonalArray[i] = field[i][j];
                }
                sidDiagonalArray[i] = field[i][field.length - 1 - i];
            }
        }
        int[] checkArray = {playerToCheck, playerToCheck, playerToCheck};
        if (Arrays.equals(diagonalArray, checkArray)) {
            return true;
        } else return Arrays.equals(sidDiagonalArray, checkArray);
    }

    boolean isDrawPosition(int[][] field) {
        boolean draw = true;
        if (!isWin()) {
            for (int[] ints : field) {
                for (int j = 0; j < field[0].length; j++) {
                    if (ints[j] == -1) {
                        draw = false;
                        break;
                    }
                }
                if (!draw) {
                    break;
                }
            }
        } else draw = false;
        return draw;
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
    boolean isWin() {
        boolean win = false;
        if (isWinPositionForHorizontals(field, 0) || isWinPositionForHorizontals(field, 1)
                || isWinPositionForVerticals(field, 0) || isWinPositionForVerticals(field, 1)
                || isWinPositionForDiagonals(field, 0) || isWinPositionForDiagonals(field, 1)) {
            win = true;
        }
        return win;
    }
}
