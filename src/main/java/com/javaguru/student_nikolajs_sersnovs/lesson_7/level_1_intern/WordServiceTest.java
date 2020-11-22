package com.javaguru.student_nikolajs_sersnovs.lesson_7.level_1_intern;

import java.util.Arrays;

class WordServiceTest {

    String text = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP " +
            "BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
    WordService wordService = new WordService(text);

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldPrintWords();
        System.out.println("-------------------");
        test.shouldSplitText();
        System.out.println("-------------------");
        test.shouldRewriteTextToLowerCase();
        System.out.println("-------------------");
        test.shouldIgnoreTextCase();
        System.out.println("-------------------");
        test.shouldContainsWord();
        System.out.println("-------------------");
        test.shouldFindIndexOf();
        System.out.println("-------------------");
        // test.shouldFindMostFrequentWor();

    }

    void shouldPrintWords() {
        String actualResult = text;
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP " +
                "BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(expectResult, actualResult, "shouldPrintWords");


    }

    void shouldSplitText() {
        String[] actualResult = wordService.textSplit();
        String[] expectResult = {"junior, format, glance, junior, junior, grass, document, hope, history, keep," +
                " bike, hope, forum, gallery, planet, hope, village, banana"};
        testResult(Arrays.toString(expectResult),Arrays.toString(actualResult), "shouldSplitText");

    }

    void shouldRewriteTextToLowerCase() {
        String actualResult = wordService.textToLowerCase();
        String expectResult = "junior format glance junior junior grass document hope history keep" +
                " bike hope forum gallery planet hope village banana";
        testResult(expectResult, actualResult, "shouldRewriteTextToLowerCase");

    }

    void shouldContainsWord() {
        String word = "GLANCE";
        String actualResult = String.valueOf(wordService.textContains(word));
        String expectResult = String.valueOf(true);
        testResult(expectResult, actualResult, "shouldContainsWord");

    }

    void shouldIgnoreTextCase() {
        String text2 = "Junior Format Glance Junior Junior Grass Document Hope History Keep" +
                " Bike Hope Forum Gallery Planet Hope Village Banana";
        String actualResult = wordService.textIgnoreCase(text2);
        String expectResult = String.valueOf(true);
        testResult(expectResult, actualResult, "shouldIgnoreTextCase");

    }

    void shouldFindIndexOf() {
        String word = "JUNIOR";
        String actualResult = wordService.textIndexOf(word);
        String expectResult = "JUNIOR";
        testResult(expectResult, actualResult, "shouldFindIndexOf");
    }

 /*   void shouldFindMostFrequentWor(){

    }
  */


    private void testResult(String expectResult, String actualResult , String testName) {
        if (actualResult.equals(expectResult)) {
            System.out.println(testName + ": SUCCESS ");
        } else {
            System.out.println(testName + ": FAILURE " + " ExpectResult :" + expectResult + "\nBut ActualResult :" + actualResult);
        }
    }
}
