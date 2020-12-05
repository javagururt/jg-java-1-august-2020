package com.javaguru.student_vladimirs_filipovs.lesson_15.level_1;

class WordsService {

    public int countRepetitions(String[] wordsArray, String repeatingWord) {
        int amountOfRepeating = 0;
        for (String word : wordsArray) {
            if (word.equals(repeatingWord)) {
                amountOfRepeating++;
            }
        }
        return amountOfRepeating;
    }

}