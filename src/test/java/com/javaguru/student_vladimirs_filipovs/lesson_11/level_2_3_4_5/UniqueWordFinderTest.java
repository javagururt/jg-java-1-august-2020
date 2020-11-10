package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {
    private UniqueWordFinder victim;

    @Before
    public void setUp() {
        victim = new UniqueWordFinder();
    }

    @Test
    public void shouldReturnZeroWord() {
        Set<String> actualList = new HashSet<>();
        Set<String> expectedList = new HashSet<>();
        actualList = victim.find("");
        expectedList.add("");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnOneWord() {
        Set<String> actualList = new HashSet<>();
        Set<String> expectedList = new HashSet<>();
        actualList = victim.find("apple,+@! apple,<>?- apple");
        expectedList.add("apple");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnTwoWord() {
        Set<String> actualList = new HashSet<>();
        Set<String> expectedList = new HashSet<>();
        actualList = victim.find("apple, apple, apple, pear");
        expectedList.add("apple");
        expectedList.add("pear");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnAllWord() {
        Set<String> actualList = new HashSet<>();
        Set<String> expectedList = new HashSet<>();
        actualList = victim.find("apple, orange, mellon, pear");
        expectedList.add("apple");
        expectedList.add("mellon");
        expectedList.add("orange");
        expectedList.add("pear");
        assertEquals(expectedList, actualList);
    }
}