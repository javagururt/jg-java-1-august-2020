package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.Scanner;

class UqWordVocabularyDemo {

    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter word:");
            String word = scanner.nextLine();
            vocabulary.addWord(word);
        }

        System.out.println(vocabulary.getMostFrequentWord());
    }
}
