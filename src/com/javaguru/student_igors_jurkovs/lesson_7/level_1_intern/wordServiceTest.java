package com.javaguru.student_igors_jurkovs.lesson_7.level_1_intern;

import java.util.Arrays;

class WordServiceTest {

    WordService wordService = new WordService();
    String text = "This test is for testing test, if if if, this. How this is";

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFormatText();
        wordServiceTest.shouldCreateArrayWithEachWordCountInText();
        wordServiceTest.shouldFindMostFrequentWordIndex();
        wordServiceTest.shouldFindMostFrequentWord();

    }

    void shouldFormatText() {
        String expected = "this test is for testing test if if if this how this is";
        String result = wordService.formattedText(text);
        wordService.test(result.equals(expected), "Format text");
    }

    void shouldCreateArrayWithEachWordCountInText() {
        int[] expected = {3, 2, 2, 1, 1, 2, 3, 3, 3, 3, 1, 3, 2};
        int[] result = wordService.howManyTimesEachWordRepeated(text);
        wordService.test(Arrays.equals(expected, result), "Each word count in the text");
    }

    void shouldFindMostFrequentWordIndex() {
        int expected = 0;
        int result = wordService.findMostFrequentWordIndex(new int[]{3, 2, 2, 1, 1, 2, 3, 3, 3, 3, 1, 3, 2});
        wordService.test(expected == result, "Find most frequent word index");
    }

    void shouldFindMostFrequentWord() {
        String expected = "this";
        String result = wordService.findMostFrequentWord(text);
        wordService.test(result.equals(expected), "Find most frequent word");
    }

}
