package com.javaguru.student_ivan_shulga.lesson_7.level_1_intern;

import java.util.Arrays;

class WordService {

    String text;
/*
    public String findMostFrequentWord(String text) {
        // write solution here
    }
*/


    public String replaceAllSimbols(String text) { // удаление знаков препинания
        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        return text;
    }

    public String allTextToLowerCase(String text) { // всё к строчным буквам
        text = text.toLowerCase();
        return text;
    }

    public String textToArray(String text) { // текст в массив
        String[] textArray = text.split(" ");
        return Arrays.toString(textArray);
    }

}
/*
1. убираем из текста все знаки препинания, оставляем только пробелы
2. как вариант привести все буквы к одному регистру
3. создаём массив из полученных слов, пробел как разделитель
4. в полученном массиве сравниваем слова
*/