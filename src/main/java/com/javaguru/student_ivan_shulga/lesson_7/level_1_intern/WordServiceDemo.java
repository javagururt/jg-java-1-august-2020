package com.javaguru.student_ivan_shulga.lesson_7.level_1_intern;

import java.util.Arrays;

class WordServiceDemo {

    public static void main(String[] args) {

        String text = "Пора, все, деревья, деревья пришли. Домой. Снег и въюга. Красный свет. Теремок синеватый!";

        WordService wordService = new WordService();

        text = wordService.replaceAllSimbols(text); // убрали знаки препинанания, остались тольк прробелы

        System.out.println(text);

        text = wordService.allTextToLowerCase(text); // убрали заглавные буквы

        System.out.println(text);

        String[] textArray = wordService.textToArray(text); // получили массив со словами

        System.out.println(Arrays.toString(textArray));

        text = wordService.findMostFrequentWord(text);

        System.out.println(text);
    }

}
