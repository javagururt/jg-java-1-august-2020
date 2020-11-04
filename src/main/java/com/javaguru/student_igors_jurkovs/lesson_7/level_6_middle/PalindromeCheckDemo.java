package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class PalindromeCheckDemo {

    public static void main(String[] args) {

        PalindromeCheckDemo palindromeCheckDemo = new PalindromeCheckDemo();
        palindromeCheckDemo.racecarIsPalindrome();
        palindromeCheckDemo.shouldIgnorePunctuationMarks();
        palindromeCheckDemo.shouldIgnoreSpaces();
    }

    void racecarIsPalindrome() {
        PalindromeCheck palindromeCheck = new PalindromeCheck("racecar");
        boolean expected = true;
        boolean result = palindromeCheck.isPalindrome();
        palindromeCheck.test(expected == result, "racecar is palindrome");
    }

    void shouldIgnorePunctuationMarks() {
        PalindromeCheck palindromeCheck = new PalindromeCheck("Le,VE.l");
        boolean expected = true;
        boolean result = palindromeCheck.isPalindrome();
        palindromeCheck.test(expected == result, "level is palindrome");
    }

    void shouldIgnoreSpaces() {
        PalindromeCheck palindromeCheck = new PalindromeCheck("А роза упала на лапу Азора");
        boolean expected = true;
        boolean result = palindromeCheck.isPalindrome();
        palindromeCheck.test(expected == result, "\"А роза упала на лапу Азора\" is palindrome");
    }
}
