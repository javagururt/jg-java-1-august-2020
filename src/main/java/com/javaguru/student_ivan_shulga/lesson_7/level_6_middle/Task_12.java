package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import java.util.Arrays;

class Palindrome { // тесты в junit.Test

    boolean isPalindrome(String text) {

        text = replaceAllSimbols(text); // оставляем только буквы
        text = allTextToLowerCase(text); // приводим к строчным буквам
        String text2 = allTextReverse(text); // делаем зеркальную копию строки
        String[] arrayFromText = textToArray(text); // массив из первой строки
        String[] arrayFromText2 = textToArray(text2); // массив из зеркальной копии

        return Arrays.equals(arrayFromText, arrayFromText2); // сравниваем два массива, если если равны, то палиндром
    }

    public String replaceAllSimbols(String text) { // оставляем только буквы
        return text.replaceAll("[^a-zA-Zа-яА-Я]", "");
    }

    public String allTextToLowerCase(String text) { // всё к строчным буквам
        return text.toLowerCase();
    }

    public String[] textToArray(String text) { // строку в массив побуквенно (каждую букву отдельно)
        return text.split("");
    }

    public String allTextReverse(String text) { // получаем перевёрнутую строку
        String text2 = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            text2 += text.charAt(i);
        }
        return text2;
    }

}

class PalindromeMiniTest {

    public static void main(String[] args) {

        Palindrome test1 = new Palindrome();
        String text = "text, txet";

        text = test1.replaceAllSimbols(text); // оставляем только буквы
        System.out.println(text);
        text = test1.allTextToLowerCase(text); // приводим к строчным
        System.out.println(text);
        String text2 = test1.allTextReverse(text); // получем перевёрнутую копию строки
        System.out.println(text2);
        String[] arrayFromText = test1.textToArray(text); // создаём массив со сторокой первой
        System.out.println(Arrays.toString(arrayFromText));
        String[] arrayFromText2 = test1.textToArray(text2); // создаём массив с зеркальной копией
        System.out.println(Arrays.toString(arrayFromText2));

        System.out.println(test1.isPalindrome(text)); // сравниваем два массива true - палиндром
    }

}

/* при случае попробовать вариант через сравнивание двух половин массива с начала и с конца
        for (int i = 0; i < arrayFromText.length / 2; i++) {
            if (arrayFromText[i] != arrayFromText[arrayFromText.length - i - 1]) {
                return false;
            }
        }
        return true;
*/

/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */