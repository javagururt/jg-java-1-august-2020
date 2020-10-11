package com.javaguru.student_vladimirs_filipovs.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class WordServiceTest {
    private WordService victim;

    @Before
    public void setUp() {
        victim = new WordService();
    }

    @Test
    public void shouldDeleteSymbolsInTheText() {
        String actualResult = victim.deleteSymbolsInTheText("!Hi, I try %wri)?/|'+=_*#ting the... important &$ program ?!");
        assertEquals("Hi I try writing the important  program ", actualResult);
    }

    @Test
    public void shouldDivideWordsAndInsertInArray() {
        String text = "Hi I try writing the important  program ";
        String[] actualResult = victim.divideTextInWordsArray(text);
        String[] expectedResult = {"Hi, I, try, writing, the, important, program"};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldFindMostFrequentWord() {
        victim.setInputText("А на сердце опять горячо, горячо\n" +
                "И опять и опять без ответа\n" +
                "А листочек с берёзки упал на плечо\n" +
                "Он как я оторвался от лета");
        String mostPopularWordInTheText = victim.deleteSymbolsInTheText(victim.getInputText());
        String[] wordsToArray = victim.divideTextInWordsArray(mostPopularWordInTheText);
        String actualResult = victim.findMostFrequentWord(wordsToArray);
        assertEquals("опять",actualResult);
    }
}