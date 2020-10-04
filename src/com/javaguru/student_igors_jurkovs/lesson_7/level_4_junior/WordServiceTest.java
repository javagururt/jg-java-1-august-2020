package com.javaguru.student_igors_jurkovs.lesson_7.level_4_junior;

import java.util.Arrays;

class WordServiceTest {

    String text = "This test is for testing test, if if if, this. How this is";
    WordService wordService = new WordService(text);


    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFormatText();
        wordServiceTest.shouldSplitFormattedTextOnWords();
        wordServiceTest.shouldCreateArrayWithEachWordCountInText();
        wordServiceTest.shouldFindMostFrequentWordIndex();
        wordServiceTest.shouldFindMostFrequentWord();

    }

    void shouldFormatText() {
        String expected = "This test is for testing test if if if this How this is";
        String result = wordService.formattedText();
        wordService.test(result.equals(expected), "Format text");
    }

    void shouldSplitFormattedTextOnWords() {
        String[] expected = {"This", "test", "is", "for", "testing", "test", "if", "if", "if", "this", "How", "this", "is"};
        String[] result = wordService.splitFormattedTextOnWords();
        wordService.test(Arrays.equals(expected, result), "Split formatted test on words");
    }

    void shouldCreateArrayWithEachWordCountInText() {
        int[] expected = {3, 2, 2, 1, 1, 2, 3, 3, 3, 3, 1, 3, 2};
        int[] result = wordService.howManyTimesEachWordRepeated();
        wordService.test(Arrays.equals(expected, result), "Each word count in the text");
    }
    void shouldFindMostFrequentWordIndex() {
        int expected = 0;
        int result = wordService.mostFrequentWordIndex();
        wordService.test(expected == result, "Find most frequent word index");
    }

    void shouldFindMostFrequentWord() {
        String expected = "This";
        String result = wordService.findMostFrequentWord();
        wordService.test(result.equals(expected), "Find most frequent word");
    }

}