package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordServiceTest {

    private WordService victim = new WordService();

    @Test
    public void findMostFrequentWord() {
        String text = "Это текст просто текст просто просто";
        String expected = "просто";
        String result = victim.findMostFrequentWord(text);
        assertEquals(expected, result);
    }
}