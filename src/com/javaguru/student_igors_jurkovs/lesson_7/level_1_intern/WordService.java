package com.javaguru.student_igors_jurkovs.lesson_7.level_1_intern;

class WordService {

    String findMostFrequentWord(String text) {
        String[] parts = formattedText(text).split(" ");
        return parts[findMostFrequentWordIndex(howManyTimesEachWordRepeated(text))];
    }

    String formattedText(String text) {
        return text.toLowerCase().replaceAll(",", "").replaceAll("\\.", "");
    }

    int[] howManyTimesEachWordRepeated(String text) {
        String[] parts = formattedText(text).split(" ");
        int[] wordCount = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            for (String str: parts) {
                if (str.equals(parts[i])) {
                    wordCount[i]++;
                }
            }
        }
        return wordCount;
    }

    int findMostFrequentWordIndex(int[] wordCount) {
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < wordCount.length; i++) {
            if (max < wordCount[i]) {
                max = wordCount[i];
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
