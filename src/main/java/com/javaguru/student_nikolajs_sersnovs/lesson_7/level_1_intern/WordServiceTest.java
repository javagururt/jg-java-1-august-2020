package com.javaguru.student_nikolajs_sersnovs.lesson_7.level_1_intern;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldPrintWords();
        System.out.println("-------------------");
        test.shouldSplitText();
        System.out.println("-------------------");
        test.shouldRewriteTextToLowerCase();
        System.out.println("-------------------");
        test.shouldContainsWord();
        System.out.println("-------------------");
        test.shouldIgnoreTextCase();
        System.out.println("-------------------");
        test.shouldFindIndexOf();
        System.out.println("-------------------");
       // test.shouldFindMostFrequentWor();

    }

    void shouldPrintWords() {
        WordService wordService = new WordService();
        String actualResult = wordService.text(wordService);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP " +
                "BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldPrintWords");


    }

    void shouldSplitText() {
        WordService wordService = new WordService();
        String myText = wordService.text(wordService);
        String actualResult = wordService.textSplit(myText);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP" +
                " BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldSplitText");

    }

    void shouldRewriteTextToLowerCase() {
        WordService wordService = new WordService();
        String myText = wordService.text(wordService);
        String actualResult = wordService.textToLowerCase(myText);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP" +
                " BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldRewriteTextToLowerCase");

    }

    void shouldContainsWord() {
        WordService wordService = new WordService();
        String myText = wordService.text(wordService);
        String word = "GLANCE";
        String actualResult = wordService.textContains(myText, word);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP" +
                " BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldContainsWord");

    }

    void shouldIgnoreTextCase() {
        WordService wordService = new WordService();
        String myText = wordService.text(wordService);
        String text2 = "junior format glance junior junior grass document hope history keep" +
                " bike hope forum gallery planet hope village banana";
        String actualResult = wordService.textIgnoreCase(myText, text2);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP" +
                " BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldIgnoreTextCase");

    }

    void shouldFindIndexOf() {
        WordService wordService = new WordService();
        String myText = wordService.text(wordService);
        String word = "JUNIOR";
        String actualResult = wordService.textIndexOf(myText, word);
        String expectResult = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP" +
                " BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        testResult(actualResult, expectResult, "shouldFindIndexOf");
    }

 /*   void shouldFindMostFrequentWor(){

    }
  */


    private void testResult(String actualResult, String expectResult, String testName) {
        if (expectResult.equals(actualResult)) {
            System.out.println(testName + ": SUCCESS ");
        } else {
            System.out.println(testName + ": FAILURE " + " ExpectResult :" + expectResult + "\nBut ActualResult :" + actualResult);
        }
    }
}
