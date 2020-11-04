package com.javaguru.student_igors_gergeleziu.lesson_6.level_5;


class TicTacToe {
    public int[][] createTwoDimensionalArray() {
        return new int[3][3];
    }

    public void fillTwoDimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
    }

    public void printTwoDimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = false;
        int horizontalPositionRow = 0;
        for (int i = 0; i < field.length; i++) {
            horizontalPositionRow = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    horizontalPositionRow++;
                    if (horizontalPositionRow == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = false;
        int verticalPositionRow = 0;
        for (int i = 0; i < field.length; i++) {
            verticalPositionRow = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    verticalPositionRow++;
                    if (verticalPositionRow == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
        if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) ||
                (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)) {
            result = true;
        }
        return result;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck){
        boolean result=false;
        if(isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck)){
            result=true;
        }
       return result;
    }
    public boolean isDrawPosition(int[][] field){
        boolean result=true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
               if(field[i][j]==-1){
                   result=false;
                   break;
               }
            }
        }
        return result;
    }
    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName+" = Success");
        }else{
            System.out.println(testName+" = Fail");
        }
    }

    public void firstPlayerMove(int[][] arr, int column, int row) {
        arr[column][row] = 0;
    }

    public void secondPlayerMove(int[][] arr, int column, int row) {
        arr[column][row] = 1;
    }

}
