package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior;

import java.util.Arrays;

class WordServiceTest {

    String text = "Это текст просто текст просто просто";
    WordService wordService = new WordService();


    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFindMostFrequentWord();

    }

    void shouldFindMostFrequentWord() {
        String expected = "просто";
        String result = wordService.findMostFrequentWord(text);
        wordService.test(result.equals(expected), "Find most frequent word");
    }

}
