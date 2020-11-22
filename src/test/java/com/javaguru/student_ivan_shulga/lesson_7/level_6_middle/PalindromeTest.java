package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome victim = new Palindrome();

    @Test
    public void isPalindrome1() {
        boolean actual = victim.isPalindrome("Казак");
        assertEquals(true,actual);
    }

    @Test
    public void isPalindrome2() {
        boolean actual = victim.isPalindrome("Лёша на полке клопа нашёл");
        assertTrue(actual);
    }

    @Test
    public void isPalindrome3() {
        assertTrue(victim.isPalindrome("О, лета тело!"));
    }

    @Test
    public void isPalindrome4() {
        boolean actual = victim.isPalindrome("Просто предложение");
        assertEquals(false,actual);
    }

    @Test
    public void isPalindrome5() {
        boolean actual = victim.isPalindrome("Предложение");
        assertFalse(actual);
    }

}