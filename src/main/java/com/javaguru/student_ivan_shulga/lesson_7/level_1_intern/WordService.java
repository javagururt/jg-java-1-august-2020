package com.javaguru.student_ivan_shulga.lesson_7.level_1_intern;

import java.util.Arrays;

class WordService {

    String text;

    public String replaceAllSimbols(String text) { // удаление знаков препинания
        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        return text;
    }

    public String allTextToLowerCase(String text) { // всё к строчным буквам
        text = text.toLowerCase();
        return text;
    }

    public String[] textToArray(String text) { // текст в массив
        return text.split(" ");
    }

    public String findMostFrequentWord(String text) { // в перспективе лучше разделить на два метода
        String[] textArray = textToArray(text);
        Arrays.sort(textArray); // сортировка как вариант, чтобы пройтись по массиву один раз
        String maxWord = "max";
        String word = "word";
        int maxCount = 0;
        int count = 1;
        for (String words : textArray) {
            if (words.equals(word)) { // смотрим масив, если слово такое же как предыдущее, увеличиваем счётчик
                count++;
            } else { // если слово отличается от предыдущего, то проверяем его на самое повторяющееся и сбрасываем счётчик
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = words;
                count = 1;
                }
        }
        return maxWord + maxCount;
    }

}
/*
1. убираем из текста все знаки препинания, оставляем только пробелы
2. как вариант привести все буквы к одному регистру
3. создаём массив из полученных слов, пробел как разделитель
4. в полученном массиве сравниваем слова
*/