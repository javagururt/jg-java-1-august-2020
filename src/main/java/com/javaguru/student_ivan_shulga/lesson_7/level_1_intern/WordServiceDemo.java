package com.javaguru.student_ivan_shulga.lesson_7.level_1_intern;

class WordServiceDemo {

    public static void main(String[] args) {

        String text = "Осень. Как холодна она и прекрасна, разноцветная палитра окрашивает все деревья. " +
                "А особенно прекрасен октябрь. Октябрь- это пора, когда все вокруг желтое, красное, оранжевое. " +
                "Хоть осень и хмурая пора, но все же- она прекрасна.";

        WordService wordService = new WordService();

        text = wordService.replaceAllSimbols(text); // убрали знаки препинанания, остались тольк прробелы

        System.out.println(text);

        text = wordService.allTextToLowerCase(text); // убрали заглавные буквы

        System.out.println(text);

        text = wordService.textToArray(text); // получили массив со словами

        System.out.println(text);

        // считаем слова
    }

}
