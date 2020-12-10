package com.javaguru.student_ivan_shulga.lesson_15.level_1_intern;

public class WordsService {

    public int countRepetitions(String[] words, String RepetitionsOfThisWordMustBeCounted) {
        int NumberOfRepetitionsOfTheSpecifiedWord = 0;
        for (String word : words) {
            if (word.equals(RepetitionsOfThisWordMustBeCounted)) {
                NumberOfRepetitionsOfTheSpecifiedWord++;
            }
        }
        return NumberOfRepetitionsOfTheSpecifiedWord;
    }
}
