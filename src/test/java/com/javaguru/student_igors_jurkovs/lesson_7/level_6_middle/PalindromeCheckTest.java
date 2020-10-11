package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
@Category(PalindromeCheck.class)
public class PalindromeCheckTest {

    @Test
    @Parameters({
            "level, true",
            "racecar, true",
            "note, false",
            "anaNa, true"
    })

    public void isPalindrome(String text, boolean expected) {
        PalindromeCheck victim = new PalindromeCheck(text);
        boolean result = victim.isPalindrome();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isPalindrome2() {
        PalindromeCheck victim = new PalindromeCheck("le,vE.l");
        assertTrue(victim.isPalindrome());
    }
}