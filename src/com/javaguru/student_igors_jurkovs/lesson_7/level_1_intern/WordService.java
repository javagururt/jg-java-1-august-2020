package com.javaguru.student_igors_jurkovs.lesson_7.level_1_intern;

class WordService {

    String text;

    WordService(String text) {
        this.text = text;
    }

    String findMostFrequentWord() {
        return splitFormattedTextOnWords()[mostFrequentWordIndex()];
    }

    String formattedText() {
        return text.toLowerCase().replaceAll(",", "").replaceAll("\\.", "");
    }

    String[] splitFormattedTextOnWords() {
        return formattedText().split(" ");
    }

    int[] howManyTimesEachWordRepeated() {
        int[] wordCount = new int[splitFormattedTextOnWords().length];
        for (int i = 0; i < splitFormattedTextOnWords().length; i++) {
            for (String str: splitFormattedTextOnWords()) {
                if (str.equals(splitFormattedTextOnWords()[i])) {
                    wordCount[i]++;
                }
            }
        }

        return wordCount;
    }

    int mostFrequentWordIndex() {
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < howManyTimesEachWordRepeated().length; i++) {
            if (max < howManyTimesEachWordRepeated()[i]) {
                max = howManyTimesEachWordRepeated()[i];
                indexMax = i;
            }
        }

        return indexMax;
    }
    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
