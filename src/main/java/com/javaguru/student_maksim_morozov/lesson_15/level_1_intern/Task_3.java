package com.javaguru.student_maksim_morozov.lesson_15.level_1_intern;

class Task_3 {
    class WordsService {

        public int countRepetitions(String[] words, String repeatingWord) {
            int repetitions = 0;
            for (String word : words) {
                if (word.equals(repeatingWord)) {
                    repetitions++;
                }
            }
            return repetitions;
        }
    }
}
