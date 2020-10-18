package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior;

import com.javaguru.teacher.codereview.CodeReviewComment;

class WordService {

    String findMostFrequentWord(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = convertStringToWordArray(text);
        wordCountArray = creatingWordCountArray(textArray);

        return textArray[findMostFrequentWordIndex(wordCountArray)];
    }

    private String[] convertStringToWordArray(String text) {
        return  text.split(" ");
    }

    private int findMostFrequentWordIndex(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }

    private int[] creatingWordCountArray(String[] textArray) {
        int[] wordCountArray = new int[textArray.length];
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }

        return wordCountArray;
    }

    @CodeReviewComment(teacher = "тестовые методы лучше хранить в тестовых классах. " +
            "В данном случае получается, что метод для теста хранится в продакшн коде")
    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
