package com.javaguru.student_vladimirs_filipovs.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class WordService {
    //план построения программы:
    //1. Создать массив для отдельных слов.
    //2. Запихнуть слова в массив.
    //3. Посчитать сколько раз повторяется каждое слово.
    //4. Сравнить у какого слова больше всех повторений.
    //5. Вывести на консоль это слово и количество его повторов в тексте.

    private String inputText;
    String mostPopularWordInTheText = "No words duplicates";
    int count;
    int wordCount = 0;

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String deleteSymbolsInTheText(String InputText) {
        //Убираем все лишние знаки из текста, чтобы остались только слова и пробелы.
        InputText = InputText.replaceAll("[!@,.<>:;()?/|'+=_*#$%^&-]", "");
        return InputText;
    }

    public String[] divideTextInWordsArray(String InputText) {
        //Разбиваем предложения на массив слов с помощю пробелов.
        String words[] = InputText.split("\\s+");
        //System.out.println("We have: " + words.length + " words");
        //System.out.println(Arrays.toString(words) + "\n");
        return words;
    }

    public String findMostFrequentWord(String[] words) {
        //Перебираем все слова с помощью циклов.
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }

            //Записываем/перезаписываем число повторяемых слов в переменную "сount" сравнивая их количество,
            // а само слово записываем/перезаписывем в переменную "mostPopularWordInTheText".
            if (count > 1 && words[i] != "0") {
                if (wordCount < count) {
                    wordCount = count;
                    mostPopularWordInTheText = words[i];
                }
            }
        }
        return mostPopularWordInTheText;
    }

    public void printToConsole(String mostPopularWordInTheText) {
        System.out.println("Most frequent word in text is: " + mostPopularWordInTheText);
    }
}
