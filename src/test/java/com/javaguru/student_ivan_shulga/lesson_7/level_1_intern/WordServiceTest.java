package com.javaguru.student_ivan_shulga.lesson_7.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordServiceTest {

    private WordService victim = new WordService();

    @Test
    public void shouldReplaceAllSimbols() {
        String expected = "Тестовая строка Для проверки уДаления знаков препинания";
        String actual = victim.replaceAllSimbols("Тестовая, строка! Для? проверки уДаления: знаков? препинания...");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAllTextToLowerCase() {
        String expected = "тестовая строка для проверки приведения букв к одному регистру";
        String actual = victim.allTextToLowerCase("Тестовая СТРока дЛЯ проверки приВЕдениЯ букв к одНому региСТРУ");
        assertEquals(expected, actual);
    }


}