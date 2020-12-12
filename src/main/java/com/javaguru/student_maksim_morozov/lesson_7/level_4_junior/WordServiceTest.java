package com.javaguru.student_maksim_morozov.lesson_7.level_4_junior;

import java.util.Arrays;

class WordServiceTest {

    String text = "This test is for testing test if if if,this. Now this is.";
    WordService wordService = new WordService(text);

    public static void main(String[] args){
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFormatText();
        wordServiceTest.shouldSplitFormattedTextOnWords();
        wordServiceTest.shouldFindMostFrequentWord();
        wordServiceTest.shouldFindMostFrequentWordIndex();
        wordServiceTest.shouldCreateArrayWithEachWordCountInText();
    }
    void shouldFormatText(){
        String expected = "This test is for testing test if if if,this. Now this is.";
        String result = wordService.formattedText();
        wordService.test(result.equals(expected), "Format text");
    }
    void shouldSplitFormattedTextOnWords(){
        String[] expected = {"This", "test", "is", "for", "testing", "test", "if", "if", "if", "this", "How", "this", "is"};
        String[] result = wordService.splitFormattedTextOnWords();
        wordService.test(Arrays.equals(expected, result),"Split formatted test on words");
    }
    void shouldFindMostFrequentWord(){
        String expected = "This";
        String result = wordService.findMostFrequentWord();
        wordService.test(result.equals(expected),"Find most frequent word");
    }
    void shouldFindMostFrequentWordIndex(){
        int expected = 0;
        int result = wordService.mostFrequentWordIndex();
        wordService.test(expected == result, "Find most frequent word index");
    }
    void shouldCreateArrayWithEachWordCountInText(){
        int[] expected = {3,1,2,3,2,1,2,3,1,1,3,2,2,3};
        int[] result = wordService.howManyTimesEachWordRepeated();
        wordService.test(Arrays.equals(expected, result), "Each word count in the text");
    }

}
