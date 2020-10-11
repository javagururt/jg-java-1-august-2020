package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckTest {

    String text;

    @Test
    public void isPalindrome() {
        text = "racecar";
        PalindromeCheck victim = new PalindromeCheck(text);
        assertTrue(victim.isPalindrome());

    }

    @Test
    public void isPalindrome2() {
        text = "le,vE.l";
        PalindromeCheck victim = new PalindromeCheck(text);
        assertTrue(victim.isPalindrome());

    }

    @Test
    public void isPalindrome3() {
        text = "А роза упала на лапу Азора";
        PalindromeCheck victim = new PalindromeCheck(text);
        assertTrue(victim.isPalindrome());
    }

    @Test
    public void isNotPalindrome() {
        text = "Note";
        PalindromeCheck victim = new PalindromeCheck(text);
        assertFalse(victim.isPalindrome());
    }
}