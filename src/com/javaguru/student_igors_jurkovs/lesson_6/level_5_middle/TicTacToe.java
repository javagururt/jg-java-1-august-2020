package com.javaguru.student_igors_jurkovs.lesson_6.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "имеет смысл подумать на вынесением дублирующегося кода в отдельный метод")
class TicTacToe {

    private final int[][] field = new int[3][3];

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return fieldsCheckForWin(field, playerToCheck, "Horizontal");
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return fieldsCheckForWin(field, playerToCheck, "Vertical");
    }

    boolean fieldsCheckForWin(int[][] field, int playerToCheck, String direction) {
        boolean win = false;
        if (direction.equals("Horizontal")) {
            for (int[] ints : field) {
                int counter = 0;
                for (int j = 0; j < field[0].length; j++) {
                    if (ints[j] == playerToCheck) {
                        counter++;
                    }
                }
                if (counter == 3) {
                    win = true;
                    break;
                }
            }

            return win;
        }
        if (direction.equals("Vertical")) {
            for (int j = 0; j < field[0].length; j++) {
                int counter = 0;
                for (int[] ints : field) {
                    if (ints[j] == playerToCheck) {
                        counter++;
                    }
                }
                if (counter == 3) {
                    win = true;
                    break;
                }
            }
            return win;
        }
        return false;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int[] diagonalArray = new int[3];
        int[] sideDiagonalArray = new int[3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == j) {
                    diagonalArray[i] = field[i][j];
                }
                sideDiagonalArray[i] = field[i][field.length - 1 - i];
            }
        }
        int[] checkArray = {playerToCheck, playerToCheck, playerToCheck};
        if (Arrays.equals(diagonalArray, checkArray)) {
            return true;
        } else return Arrays.equals(sideDiagonalArray, checkArray);
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
