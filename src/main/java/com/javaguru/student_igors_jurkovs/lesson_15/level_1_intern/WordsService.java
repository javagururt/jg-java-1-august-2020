package com.javaguru.student_igors_jurkovs.lesson_15.level_1_intern;

class WordsService {

    public int countRepetitions(String[] words, String repeatableWord) {
        int repeatitions = 0;
        for (String word : words) {
            if (word.equals(repeatableWord)) {
                repeatitions++;
            }
        }
        return repeatitions;
    }
}
