package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_19;
/*
Дано поле игры крестики нолики размерностью три на три клетки.
Поле представлено двумерным массивом целых чисел, где:
-1 - это пустая клетка,
0 - это клетка в которую сделал ход первый игрок,
1 - это клетка в которую сделал ход второй игрок.
Создайте класс TicTacToe и в этом классе реализуйте
метод для определения является ли данная позиция
победной по горизонталям для указанного игрока.
Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).
Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.
Метод должен вернуть:
 - true если в одной из горизонталей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.
Создать класс TicTacToeTest
и написать тесты для разработанного метода.
 */

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
