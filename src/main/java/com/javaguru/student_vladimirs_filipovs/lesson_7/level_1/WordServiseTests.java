package com.javaguru.student_vladimirs_filipovs.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTests {

    public static void main(String[] args) {
        WordServiceTests testRunner = new WordServiceTests();
        testRunner.test1DeleteSymbolsInText();
        testRunner.test2DeleteSymbolsWithoutText();
        testRunner.test3TransformStringToArray();
        testRunner.test4FindMostFrequentWord();
        testRunner.test5FindMostFrequentNoSameWord();
    }

    private void test1DeleteSymbolsInText() {
        WordService wordService = new WordService();
        String text = "Es esMu -ml|@tj +patriotsMan >=@? ";
        String expectedResult = "Es esMu mltj patriotsMan  ";
        String actualResult = wordService.deleteSymbolsInTheText(text);
        finalResultString(expectedResult, actualResult, "test1DeleteSymbolsInText");
    }

    private void test2DeleteSymbolsWithoutText() {
        WordService wordService = new WordService();
        String text = "!@#$%^&*()_+=-/?<>|/";
        String expectedResult = "";
        String actualResult = wordService.deleteSymbolsInTheText(text);
        finalResultString(expectedResult, actualResult, "test2DeleteSymbolsWithoutText");
    }

    private void test3TransformStringToArray() {
        WordService wordService = new WordService();
        String text = "Холодная война и время как вода";
        String[] expectedResult = {"Холодная, война, и, время, как, вода"};
        String[] actualResult = wordService.divideTextInWordsArray(text);
        finalResultArray(expectedResult, actualResult, "test3TransformStringToArray");
    }

    private void test4FindMostFrequentWord() {
        WordService wordService = new WordService();
        wordService.setInputText("Я схожу с ума, мне мало мало мало\n" +
                "Мне мало мало мало тебя\n" +
                "Знаю я сама, мне мало мало мало\n" +
                "Мне мало мало мало тебя");
        String mostPopularWordInTheText = wordService.deleteSymbolsInTheText(wordService.getInputText());
        String[] wordInTheTextInArray = wordService.divideTextInWordsArray(mostPopularWordInTheText);
        String expectedResult = "мало";
        String actualResult = wordService.findMostFrequentWord(wordInTheTextInArray);
        finalResultString(expectedResult, actualResult, "test4FindMostFrequentWord");
    }

    private void test5FindMostFrequentNoSameWord() {
        WordService wordService = new WordService();
        wordService.setInputText("Большие города\n" +
                "Пустые поезда,\n" +
                "Ни берега не дна\n" +
                "Все начинать сначала");
        String mostPopularWordInTheText = wordService.deleteSymbolsInTheText(wordService.getInputText());
        String[] wordInTheTextInArray = wordService.divideTextInWordsArray(mostPopularWordInTheText);
        String expectedResult = "No words duplicates";
        String actualResult = wordService.findMostFrequentWord(wordInTheTextInArray);
        finalResultString(expectedResult, actualResult, "test5FindMostFrequentNoSameWord");
    }


    private void finalResultString(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result " + expectedResult + ", actual result " + actualResult);
        }
    }

    private void finalResultArray(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result " + Arrays.toString(expectedResult) + ", actual result " + Arrays.toString(actualResult));
        }
    }
}
