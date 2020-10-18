package com.javaguru.student_igors_jurkovs.lesson_6.level_6_middle;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
class TicTacToe {

    int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }

        return field;
    }

    Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose X coordinate for your move:");
        int x = sc.nextInt() - 1;
        System.out.println("Chose Y coordinate for your move:");
        int y = sc.nextInt() - 1;

        return new Move(x, y);

    }

    void printFieldToConsole(int[][] field) {
        for (int[] fi: field) {
            System.out.println(Arrays.toString(fi));
        }
        System.out.println();
    }

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
        if (!isWin(field, 0) && !isWin(field, 1)) {
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

    boolean isFieldCreated(int[][] field){
        boolean created = true;
        for (int[] ints: field) {
            for (int anInt : ints) {
                if (anInt != -1) {
                    created = false;
                    break;
                }
            } if (!created) break;
        } return created;
    }
    boolean isWin(int[][] field, int playerToCheck) {
        boolean win = false;
        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) ||isWinPositionForDiagonals(field, playerToCheck)) {
            win = true;
        }
        return win;
    }
    void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}


