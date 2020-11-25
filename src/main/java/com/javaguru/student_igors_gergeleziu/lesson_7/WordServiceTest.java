package com.javaguru.student_igors_gergeleziu.lesson_7;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.test1DeleteSymbolsFromText();
        test.test2DeleteSymbols();
        test.test3DivideTextToArray();
        test.test4FindMostFrequentWord();
        test.test5NoFrequentWords();
    }

    public void test1DeleteSymbolsFromText() {
        WordService wordService = new WordService();
        String text = "Hello@, !my. name) *is Jeff#@";
        String expected = "Hello my name is Jeff";
        String actual = wordService.replaceSymbolsInText(text);
        checkResultString(expected, actual, "test1DeleteSymbolsFromText");
    }

    public void test2DeleteSymbols() {
        WordService wordService = new WordService();
        String text = "!@,.<>:;()?/|'+=_*#$%^&-";
        String expected = "";
        String actual = wordService.replaceSymbolsInText(text);
        checkResultString(expected, actual, "test2DeleteSymbols");
    }

    public void test3DivideTextToArray() {
        WordService wordService = new WordService();
        String text = "My name is Jeff";
        String[] expected = {"My", "name", "is", "Jeff"};
        String[] actual = wordService.divideTextOnWordsInArray(text);
        checkResultArray(expected, actual, "test3DivideTextToArray");
    }

    public void test4FindMostFrequentWord() {
        WordService wordService = new WordService();
        wordService.setInputText("Hi!\n+" +
                " My name is\n" +
                " What?\n" +
                " My name is\n" +
                " Who?\n" +
                " My name is\n" +
                " Chika-chika Slim Shady");
        String mostFrequentWord = wordService.replaceSymbolsInText(wordService.getInputText());
        String[] mostFrequentWordArray = wordService.divideTextOnWordsInArray(mostFrequentWord);
        String expected = "My";
        String actual = wordService.findMostFrequentWord(mostFrequentWordArray);
        checkResultString(expected, actual, "test4FindMostFrequentWord");
    }

    public void test5NoFrequentWords() {
        WordService wordService = new WordService();
        wordService.setInputText("Я узнал, что у меня\n" +
                "Есть огромная семья");
        String mostFrequentWord = wordService.replaceSymbolsInText(wordService.getInputText());
        String[] mostFrequentWordArray = wordService.divideTextOnWordsInArray(mostFrequentWord);
        String expected = "No frequent words";
        String actual = wordService.findMostFrequentWord(mostFrequentWordArray);
        checkResultString(expected, actual, "test5NoFrequentWords");
    }

    public void checkResultString(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail" + " expected: " + expected + " actual: " + actual);
        }
    }

    public void checkResultArray(String[] expected, String[] actual, String testName) {
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail" + " expected: " + expected + " actual: " + actual);
        }
    }
}
